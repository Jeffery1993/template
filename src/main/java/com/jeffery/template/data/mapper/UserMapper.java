package com.jeffery.template.data.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jeffery.template.data.model.UserModel;

@Mapper
public interface UserMapper {

	@Select("select * from user where name = #{name}")
	UserModel findUserByName(@Param("name") String name);

}
