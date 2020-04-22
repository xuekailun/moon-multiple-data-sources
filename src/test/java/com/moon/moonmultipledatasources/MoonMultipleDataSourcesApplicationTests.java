package com.moon.moonmultipledatasources;

import com.moon.dao.first.HsCaseMapper;
import com.moon.dao.second.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoonMultipleDataSourcesApplicationTests {

    @Autowired
    private HsCaseMapper hsCaseMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {

        System.out.println("查询first数据中的总条数：" + hsCaseMapper.selectCount());
        System.out.println("查询second数据中的总条数：" +  userMapper.selectUserCont());
    }

}
