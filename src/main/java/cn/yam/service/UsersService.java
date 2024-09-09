package cn.yam.service;

import cn.yam.domain.Users;
import cn.yam.vo.LoginVo;
import cn.yam.vo.PageResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UsersService{

    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    Users login(LoginVo loginVo);

    List<Users> selectAll();

    List<Users> selectByRole(String role);

    PageResult<Users> selectByPage(Integer page, Integer size);

    List<Users> selectByUsernameOrEmailOrPhone(String username, String email, String phone);
}
