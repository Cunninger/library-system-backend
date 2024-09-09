package cn.yam.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能：
 * 日期：2024/8/8 上午10:15
 */
@AllArgsConstructor//   生成全参数构造函数
@NoArgsConstructor//    生成无参构造函数
@Data// 生成getter、setter、toString、equals、hashCode等方法
public class LoginVo {
    private String username;
    private String password;
    private String role;
    private String captcha;
}