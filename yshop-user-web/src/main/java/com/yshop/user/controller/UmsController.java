package com.yshop.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yshop.bean.UmsMember;
import com.yshop.service.UmsMemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用户controller
 *
 * @author jiyf
 * @create 2020-01-10 11:21
 **/
@Controller
public class UmsController {

    @Reference
    private UmsMemberService umsMemberService;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        return umsMemberService.getAllUser();
    }
}
