package com.example.spirngsecurityoauth2server.service;


import com.example.spirngsecurityoauth2server.entity.TbPermission;

import java.util.List;

public interface TbPermissionService {
    public List<TbPermission> selectByUserId(Long userId);
}