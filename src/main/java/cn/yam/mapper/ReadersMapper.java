package cn.yam.mapper;

import cn.yam.domain.Readers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReadersMapper {
    /**
     * delete by primary key
     *
     * @param readerId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer readerId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Readers record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Readers record);

    /**
     * select by primary key
     *
     * @param readerId primary key
     * @return object by primary key
     */
    Readers selectByPrimaryKey(Integer readerId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Readers record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Readers record);

    List<Readers> selectByContactInfo(@Param("contactInfo") String contactInfo);

    List<Readers> selectByName(@Param("name") String name);
}