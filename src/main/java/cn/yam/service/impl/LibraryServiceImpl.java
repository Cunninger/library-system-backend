package cn.yam.service.impl;

import cn.yam.domain.Bookclassification;
import cn.yam.vo.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import cn.yam.mapper.LibraryMapper;
import cn.yam.domain.Library;
import cn.yam.service.LibraryService;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService{

    @Autowired
    private LibraryMapper libraryMapper;

    @Override
    public int deleteByPrimaryKey(Integer libraryId) {
        return libraryMapper.deleteByPrimaryKey(libraryId);
    }

    @Override
    public int insert(Library record) {
        return libraryMapper.insert(record);
    }

    @Override
    public int insertSelective(Library record) {
        return libraryMapper.insertSelective(record);
    }

    @Override
    public Library selectByPrimaryKey(Integer libraryId) {
        return libraryMapper.selectByPrimaryKey(libraryId);
    }

    @Override
    public int updateByPrimaryKeySelective(Library record) {
        return libraryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Library record) {
        return libraryMapper.updateByPrimaryKey(record);
    }

    public List<Library> selectAll() {
        return libraryMapper.selectAll();
    }

    @Override
    public List<String> selectLibraryNameByLibraryId(Integer libraryId) {
        return  libraryMapper.selectLibraryNameByLibraryId(libraryId);
    }

    @Override
    public PageResult<Library> selectByPage(Integer page, Integer size) {
        // 设置分页
        PageHelper.startPage(page, size);
        // 查询
        List<Library> alllist = libraryMapper.selectAll();
        Page p = (Page) alllist;// 强转为Page类型
        long total = p.getTotal();
        List result = p.getResult();
        return new PageResult<Library>(total, result);
    }
}
