package cn.yam.service;

import cn.yam.domain.Library;
import cn.yam.vo.PageResult;

import java.util.List;

public interface LibraryService{

    int deleteByPrimaryKey(Integer libraryId);

    int insert(Library record);

    int insertSelective(Library record);

    Library selectByPrimaryKey(Integer libraryId);

    int updateByPrimaryKeySelective(Library record);

    int updateByPrimaryKey(Library record);

    List<Library> selectAll();

    List<String> selectLibraryNameByLibraryId(Integer libraryId);

    PageResult<Library> selectByPage(Integer page, Integer size);
}
