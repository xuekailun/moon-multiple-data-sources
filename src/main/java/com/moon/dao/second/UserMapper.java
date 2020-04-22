package com.moon.dao.second;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int selectUserCont();
}
