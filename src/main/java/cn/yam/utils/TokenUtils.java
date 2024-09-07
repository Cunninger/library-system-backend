package cn.yam.utils;

import cn.yam.domain.Users;
import cn.yam.mapper.UsersMapper;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 功能：
 * 日期：2024/8/14 下午5:03
 */
@Component
public class TokenUtils {

    //1、定义一个静态mapper的原因，因为下面有static方法，在static方法里面像使用mapper那么mapper必须是static修饰的（静态的方法只能访问静态的变量）
    private static UsersMapper staticUserMapper;

    @Resource
    UsersMapper userMapper;

    @PostConstruct
    public void setUserService() {
        staticUserMapper = userMapper;
    }

    /**
     * 2、生成token
     *
     * @return
     */
    public static String genToken(String userId, String sign) {
        return JWT.create().withAudience(userId) // 将 user id 保存到 token 里面,作为载荷
                .withExpiresAt(DateUtil.offsetHour(new Date(), 2)) // 2小时后token过期  withExpiresAt设置过期时间。offsetHour(new Date(), 2)表示当前日期new Date()往后偏移两个小时，他返回的是一个时间
                .sign(Algorithm.HMAC256(sign)); // 以 password 作为 token 的密钥.sign(Algorithm.HMAC256(sign))进行加密  sign是传过来的参数，传什么参数生成什么类型的验证器
    }

    /**
     * 3、获取当前登录的用户信息
     * 只要当前请求有token我就可以通过token去拿到当前请求的用户的所有的信息（是从数据库里面查出来的 ）
     *
     * @return user对象
     */
    public static Users getCurrentUser() {
        try {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            String token = request.getHeader("Authorization");
            // 去掉Authorization前面的Bearer
            if (StrUtil.isNotBlank(token) && token.startsWith("Bearer ")) {
                token = token.substring(7);
            }
            if (StrUtil.isNotBlank(token)) {
                String userId = JWT.decode(token).getAudience().get(0);
                return staticUserMapper.selectByPrimaryKey(Integer.valueOf(userId));
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}