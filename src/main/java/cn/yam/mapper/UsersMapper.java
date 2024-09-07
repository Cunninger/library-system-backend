package cn.yam.mapper;

import cn.yam.domain.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsersMapper {
    /**
     * delete by primary key
     *
     * @param userId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Users record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Users record);

    /**
     * select by primary key
     *
     * @param userId primary key
     * @return object by primary key
     */
    Users selectByPrimaryKey(Integer userId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Users record);

    List<Users> selectByRole(@Param("role") Object role);

    List<Users> selectByUsername(@Param("username") String username);

    List<Users> selectAll();

    List<Users> selectByPage(@Param("start") Integer page, @Param("pageSize") Integer size);

    List<Users> selectByUsernameOrEmailOrPhone(@Param("username")String username,@Param("email")String email,@Param("phone")String phone);



}