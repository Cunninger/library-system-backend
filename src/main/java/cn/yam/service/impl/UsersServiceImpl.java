package cn.yam.service.impl;

import cn.yam.utils.TokenUtils;
import cn.yam.vo.LoginVo;
import cn.yam.vo.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import cn.yam.mapper.UsersMapper;
import cn.yam.domain.Users;
import cn.yam.service.UsersService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return usersMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(Users record) {
        if (record.getPassword() == null) {
            record.setPassword("123456");
        }
        if (record.getRole() == null) {
            record.setRole("reader");
        }
        return usersMapper.insert(record);
    }

    @Override
    public int insertSelective(Users record) {
        return usersMapper.insertSelective(record);
    }

    @Override
    public Users selectByPrimaryKey(Integer userId) {
        return usersMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {
        return usersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return usersMapper.updateByPrimaryKey(record);
    }

    @Override
    public Users login(LoginVo loginVo) {
        Users users = new Users();
        BeanUtils.copyProperties(loginVo,users);
        // 判断用户名和密码是否为空
        if (users.getUsername() == null || users.getPassword() == null) {
            return null;
        }
        // 根据用户名和密码查询用户
        List<Users> userList = usersMapper.selectByUsername(users.getUsername());
        Users users1 = userList.get(0);
        if (users1.getPassword().equals(users.getPassword()) && users1.getRole().equals(users.getRole())) {
            // 生成token
            String token = TokenUtils.genToken(users1.getUserId().toString(), users1.getPassword());
            users1.setToken(token);
            return users1;
        }
        return null;
    }

    @Override
    public List<Users> selectAll() {
        return usersMapper.selectAll();
    }

    @Override
    public List<Users> selectByRole(String role) {
        return usersMapper.selectByRole(role);
    }

    @Override
    public PageResult<Users> selectByPage(Integer page, Integer size) {
        // 设置分页
        PageHelper.startPage(page, size);
        List<Users> users = usersMapper.selectAll();
        Page p = (Page) users;
        return new PageResult<>(p.getTotal(), p.getResult());


    }

    @Override
    public List<Users> selectByUsernameOrEmailOrPhone(String username, String email, String phone) {
        return usersMapper.selectByUsernameOrEmailOrPhone(username, email, phone);
    }

}
