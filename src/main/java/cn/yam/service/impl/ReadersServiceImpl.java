package cn.yam.service.impl;

import cn.yam.vo.LoginVo;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import cn.yam.domain.Readers;
import cn.yam.mapper.ReadersMapper;
import cn.yam.service.ReadersService;

import java.util.List;

@Service
public class ReadersServiceImpl implements ReadersService {

    @Autowired
    private ReadersMapper readersMapper;

    @Override
    public int deleteByPrimaryKey(Integer readerId) {
        return readersMapper.deleteByPrimaryKey(readerId);
    }

    @Override
    public int insert(Readers record) {
        return readersMapper.insert(record);
    }

    @Override
    public int insertSelective(Readers record) {
        return readersMapper.insertSelective(record);
    }

    @Override
    public Readers selectByPrimaryKey(Integer readerId) {
        return readersMapper.selectByPrimaryKey(readerId);
    }

    @Override
    public int updateByPrimaryKeySelective(Readers record) {
        return readersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Readers record) {
        return readersMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Readers> selectByContactInfo(String contact) {
        return readersMapper.selectByContactInfo(contact);
    }

    @Override
    public List<Readers> selectByName(String name) {
        return readersMapper.selectByName(name);
    }

    @Override
    public Readers login(LoginVo loginVo) {
        List<Readers> readers = readersMapper.selectByName(loginVo.getUsername());
        if (readers.get(0).getPassword().equals(loginVo.getPassword())) {
            return readers.get(0);
        }
        else {
            return null;
        }
    }


}
