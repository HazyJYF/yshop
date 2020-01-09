package com.yshop.user.service;

import com.yshop.bean.UmsMember;
import com.yshop.service.UmsMemberService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author jiyf
 * @create 2020-01-09 13:44
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class UmsMemberServiceImplTest {

    @Autowired
    private UmsMemberService umsMemberService;


    @Test
    public void getAllUser() {

        List<UmsMember> result = umsMemberService.getAllUser();
        System.out.println(result);
        Assert.assertNotNull(result);
    }
}