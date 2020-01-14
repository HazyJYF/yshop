package com.yshop.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yshop.bean.PmsBaseAttrInfo;
import com.yshop.service.AttrService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 属性Controller
 *
 * @author jiyf
 * @create 2020-01-14 19:20
 **/


public class AttrController {

    @Reference
    private AttrService attrService;

    @RequestMapping("/attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(@RequestParam String catalog3Id){
        return attrService.attrInfoList(catalog3Id);
    }


    @RequestMapping("/saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){

        attrService.save(pmsBaseAttrInfo);
        return "success";
    }
}
