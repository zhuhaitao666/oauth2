package com.example.springsecurityoauth2resource.service.impl;

import com.example.springsecurityoauth2resource.mapper.TbContentCategoryMapper;
import com.example.springsecurityoauth2resource.service.TbContentCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService {

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

}