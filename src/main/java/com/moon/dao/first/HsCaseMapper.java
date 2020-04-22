package com.moon.dao.first;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HsCaseMapper {

    int selectCount();
}
