package com.example.spirngsecurityoauth2server.service.impl;

import com.example.spirngsecurityoauth2server.entity.TbPermission;
import com.example.spirngsecurityoauth2server.mapper.TbPermissionMapper;
import com.example.spirngsecurityoauth2server.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}