package cn.yam.service;

import cn.yam.domain.Readers;
import cn.yam.vo.LoginVo;

import java.util.List;

public interface ReadersService{

    int deleteByPrimaryKey(Integer readerId);

    int insert(Readers record);

    int insertSelective(Readers record);

    Readers selectByPrimaryKey(Integer readerId);

    int updateByPrimaryKeySelective(Readers record);

    int updateByPrimaryKey(Readers record);

    List<Readers> selectByContactInfo(String contact);

    List<Readers> selectByName(String name);

    Readers login(LoginVo loginVo);
}
