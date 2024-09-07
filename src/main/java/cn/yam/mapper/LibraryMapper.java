package cn.yam.mapper;
import org.apache.ibatis.annotations.Param;

import cn.yam.domain.Library;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LibraryMapper {
    /**
     * delete by primary key
     * @param libraryId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer libraryId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Library record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Library record);

    /**
     * select by primary key
     * @param libraryId primary key
     * @return object by primary key
     */
    Library selectByPrimaryKey(Integer libraryId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Library record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Library record);

    List<Library> selectAll();


    List<String> selectLibraryNameByLibraryId(@Param("libraryId")Integer libraryId);



}