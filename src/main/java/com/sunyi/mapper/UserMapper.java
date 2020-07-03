package com.sunyi.mapper;

import com.sunyi.model.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Insert("insert into user (username,password) values (#{username},#{password})")
    void addnew(String username, String password);
    @Select("select * from user where username=#{username}")
    User getuser(String username);
    @Delete("delete  from user where username=#{username}")
    void deleteuser(String username);
    @Update("update user set password=#{password} where username=#{username}")
    void updateuser(String username,String password);
}
