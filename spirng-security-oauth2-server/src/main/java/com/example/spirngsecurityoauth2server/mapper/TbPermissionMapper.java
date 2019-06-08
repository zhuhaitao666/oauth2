package com.example.spirngsecurityoauth2server.mapper;

import com.example.spirngsecurityoauth2server.entity.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk_mybatis_mapper.MyMapper;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {
    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}