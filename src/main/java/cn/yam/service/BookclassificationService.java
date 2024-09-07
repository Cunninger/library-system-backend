package cn.yam.service;

import cn.yam.domain.Bookclassification;
import cn.yam.domain.Books;
import cn.yam.vo.PageResult;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BookclassificationService {

    int insert(Bookclassification record);

    int insertSelective(Bookclassification record);

    Bookclassification selectByClassificationId(Integer id);

    int deleteByClassificationId(Integer id);

    List<Bookclassification> selectAll();

    int updateByClassificationId(Bookclassification record);

    List<Bookclassification> selectByClassDescriptionOrClassName(String classDescription, String className);

    int deleteByPrimaryKey(Integer classificationId);

    Bookclassification selectByPrimaryKey(Integer classificationId);

    int updateByPrimaryKeySelective(Bookclassification record);

    int updateByPrimaryKey(Bookclassification record);

    PageResult<Bookclassification> selectByPage(int page, int size);
}

