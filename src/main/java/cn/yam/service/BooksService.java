package cn.yam.service;

import cn.yam.domain.Books;
import cn.yam.vo.PageResult;
import cn.yam.vo.StatusVo;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BooksService{

    int deleteByPrimaryKey(Integer bookId);

    int insert(Books record);

    int insertSelective(Books record);

    Books selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Books record);

    int updateByPrimaryKey(Books record);

    List<Books> selectAll();





    List<Books> selectByAuthorOrTitle(String bookName, String author);

    List<Books> selectAllByPublisher(String publisher);

    List<Books> selectAllByYearPublished(Object yearPublished);

    List<Books> selectByStatus(Object status);


    int updateStatusByBookId( StatusVo statusVo);


    PageResult<Books> selectByPage(int page, int size);
}
