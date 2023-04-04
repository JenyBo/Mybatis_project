package com.mybatis.mybatisproject.mapper;

import com.mybatis.mybatisproject.model.Users;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UsersMapper {
  @Select("select * from users")
  List<Users> findAll();
}
