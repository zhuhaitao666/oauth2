package com.example.spirngsecurityoauth2server.service;

import com.example.spirngsecurityoauth2server.entity.TbUser;

public interface TbUserService {
    public TbUser getByUsername(String username);
}
