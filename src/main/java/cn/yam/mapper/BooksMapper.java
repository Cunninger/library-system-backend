package cn.yam.mapper;

import cn.yam.domain.Books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BooksMapper {
    /**
     * delete by primary key
     *
     * @param bookId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer bookId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Books record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Books record);

    /**
     * select by primary key
     *
     * @param bookId primary key
     * @return object by primary key
     */
    Books selectByPrimaryKey(Integer bookId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Books record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Books record);

    List<Books> selectAll();

    List<Books> selectByAuthorOrTitle(@Param("author") String author, @Param("title") String title);

    List<Books> selectAllByPublisher(@Param("publisher") String publisher);

    List<Books> selectAllByYearPublished(@Param("yearPublished") Object yearPublished);

    List<Books> selectByStatus(@Param("status") Object status);

    int updateStatusByBookId(@Param("updatedStatus") Object updatedStatus, @Param("bookId") Integer bookId);

    List<Books> selectByPage(@Param("start") Integer page, @Param("pageSize") Integer size);
}