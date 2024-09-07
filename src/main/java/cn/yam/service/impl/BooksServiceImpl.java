package cn.yam.service.impl;

import cn.yam.vo.PageResult;
import cn.yam.vo.StatusVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import cn.yam.domain.Books;
import cn.yam.mapper.BooksMapper;
import cn.yam.service.BooksService;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BooksMapper booksMapper;

    @Override
    public int deleteByPrimaryKey(Integer bookId) {
        return booksMapper.deleteByPrimaryKey(bookId);
    }

    @Override
    public int insert(Books record) {
        return booksMapper.insert(record);
    }

    @Override
    public int insertSelective(Books record) {
        return booksMapper.insertSelective(record);
    }

    @Override
    public Books selectByPrimaryKey(Integer bookId) {
        return booksMapper.selectByPrimaryKey(bookId);
    }

    @Override
    public int updateByPrimaryKeySelective(Books record) {
        return booksMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Books record) {
        return booksMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Books> selectAll() {
        return booksMapper.selectAll();
    }

    @Override
    public List<Books> selectByAuthorOrTitle(String bookName, String author) {
        return booksMapper.selectByAuthorOrTitle(bookName, author);
    }

    @Override
    public List<Books> selectAllByPublisher(String publisher) {
        return booksMapper.selectAllByPublisher(publisher);
    }

    @Override
    public List<Books> selectAllByYearPublished(Object yearPublished) {
        return booksMapper.selectAllByYearPublished(yearPublished);
    }

    @Override
    public List<Books> selectByStatus(Object status) {
        return booksMapper.selectByStatus(status);
    }

    @Override
    public int updateStatusByBookId(StatusVo statusVo) {
        return booksMapper.updateStatusByBookId(statusVo.getStatus(), statusVo.getBookId());
    }


    @Override
    public PageResult<Books> selectByPage(int page, int size) {
        // 设置分页
        PageHelper.startPage(page, size);
        // 查询
        List<Books> alllist = booksMapper.selectAll();
        Page p = (Page) alllist;// 强转为Page类型
        long total = p.getTotal();
        List result = p.getResult();
        return new PageResult<Books>(total, result);
    }


}
