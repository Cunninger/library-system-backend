package cn.yam.mapper;

import cn.yam.domain.Bookclassification;
import cn.yam.domain.Books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookclassificationMapper {
    /**
     * delete by primary key
     *
     * @param classificationId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer classificationId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Bookclassification record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Bookclassification record);

    /**
     * select by primary key
     *
     * @param classificationId primary key
     * @return object by primary key
     */
    Bookclassification selectByPrimaryKey(Integer classificationId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Bookclassification record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Bookclassification record);

    Bookclassification selectByClassificationId(@Param("classificationId") Integer classificationId);

    /**
     * 根据主键删除
     */
    int deleteByClassificationId(@Param("classificationId") Integer classificationId);

    /**
     * 查询所有数据
     */
    List<Bookclassification> selectAll();

    /**
     * 通过主键更新数据
     *
     * @param record 实体对象
     * @return 影响行数
     */


    int updateByClassificationId(@Param("updated") Bookclassification updated, @Param("classificationId") Integer classificationId);

    /**
     * 根据分类描述或分类名查询
     *
     * @param classDescription
     * @param className
     * @return
     */
    List<Bookclassification> selectByClassDescriptionOrClassName(@Param("classDescription") String classDescription, @Param("className") String className);

    List<Bookclassification> selectByPage(@Param("start") Integer start, @Param("pageSize") Integer size);





}