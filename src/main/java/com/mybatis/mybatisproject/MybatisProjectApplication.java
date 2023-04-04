package com.mybatis.mybatisproject;

import com.mybatis.mybatisproject.model.Users;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MappedTypes(Users.class)
@MapperScan("com.mybatis.mybatisproject.mapper")
@SpringBootApplication
public class MybatisProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisProjectApplication.class, args);
	}

}
