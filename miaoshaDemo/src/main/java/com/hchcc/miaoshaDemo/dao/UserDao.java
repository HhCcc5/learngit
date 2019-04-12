package com.hchcc.miaoshaDemo.dao;


import com.hchcc.miaoshaDemo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from user where id = #{id}")
    public User getById(@Param("id") int id);

    @Insert("insert into User(id,name) values (#{id},#{name})")
    public boolean insertUser(User user);
}
