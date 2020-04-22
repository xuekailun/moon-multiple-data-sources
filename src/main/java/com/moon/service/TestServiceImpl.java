package com.moon.service;

import com.moon.dao.first.HsCaseMapper;
import com.moon.dao.second.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private HsCaseMapper hsCaseMapper;

    @Autowired
    private UserMapper userMapper;



}
