package com.sliaya.mapper;

import com.sliaya.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int getCount();

    User getUserById(@Param("id")int id);
}
