package com.mybatis.mybatisproject.resource;

import com.mybatis.mybatisproject.mapper.UsersMapper;
import com.mybatis.mybatisproject.model.Users;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/users")
public class UserResource {
  private UsersMapper usersMapper;

  public UserResource(UsersMapper usersMapper) {
    this.usersMapper = usersMapper;
  }

  @GetMapping("/all")
  public List<Users> getALl(){
      return usersMapper.findAll();
  }
}
