package cn.yam.service.impl;

import cn.yam.vo.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import cn.yam.domain.Bookclassification;
import cn.yam.mapper.BookclassificationMapper;
import cn.yam.service.BookclassificationService;

import java.util.List;

@Service
public class BookclassificationServiceImpl implements BookclassificationService {

    @Autowired
    private BookclassificationMapper bookclassificationMapper;// 引入bookclassificationMapper

    @Override
    public int insert(Bookclassification record) {
        return bookclassificationMapper.insert(record);
    }

    @Override
    public int insertSelective(Bookclassification record) {
        return bookclassificationMapper.insertSelective(record);
    }

    @Override
    public int deleteByClassificationId(Integer id) {
        return bookclassificationMapper.deleteByClassificationId(id);
    }

    @Override
    public List<Bookclassification> selectAll() {
        return bookclassificationMapper.selectAll();
    }

    @Override
    public int updateByClassificationId(Bookclassification record) {
        return bookclassificationMapper.updateByClassificationId(record, record.getClassificationId());
    }

    @Override
    public List<Bookclassification> selectByClassDescriptionOrClassName(String classDescription, String className) {
        return bookclassificationMapper.selectByClassDescriptionOrClassName(classDescription, className);
    }

    @Override
    public Bookclassification selectByClassificationId(Integer id) {
        return bookclassificationMapper.selectByClassificationId(id);
    }

    @Override
    public int deleteByPrimaryKey(Integer classificationId) {
        return bookclassificationMapper.deleteByPrimaryKey(classificationId);
    }

    @Override
    public Bookclassification selectByPrimaryKey(Integer classificationId) {
        return bookclassificationMapper.selectByPrimaryKey(classificationId);
    }

    @Override
    public int updateByPrimaryKeySelective(Bookclassification record) {
        return bookclassificationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Bookclassification record) {
        return bookclassificationMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageResult<Bookclassification> selectByPage(int page, int size) {
        // 设置分页
        PageHelper.startPage(page, size);
        // 查询
        List<Bookclassification> alllist = bookclassificationMapper.selectAll();
        Page p = (Page) alllist;// 强转为Page类型
        long total = p.getTotal();
        List result = p.getResult();
        return new PageResult<Bookclassification>(total, result);

    }
}

