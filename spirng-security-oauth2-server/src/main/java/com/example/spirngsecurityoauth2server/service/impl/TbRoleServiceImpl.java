package com.example.spirngsecurityoauth2server.service.impl;

import com.example.spirngsecurityoauth2server.mapper.TbRoleMapper;
import com.example.spirngsecurityoauth2server.service.TbRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbRoleServiceImpl implements TbRoleService {

    @Resource
    private TbRoleMapper tbRoleMapper;

}