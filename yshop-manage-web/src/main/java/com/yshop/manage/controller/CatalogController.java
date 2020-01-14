package com.yshop.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yshop.bean.PmsBaseAttrInfo;
import com.yshop.bean.PmsBaseCatalog1;
import com.yshop.bean.PmsBaseCatalog2;
import com.yshop.bean.PmsBaseCatalog3;
import com.yshop.service.AttrService;
import com.yshop.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 类目Controller
 *
 * @author jiyf
 * @create 2020-01-14 14:17
 **/
@Controller
@CrossOrigin
public class CatalogController {

    @Reference
    private CatalogService catalogService;

    @RequestMapping("/getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        return catalogService.getCatalog1();
    }

    @RequestMapping("/getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(@RequestParam String catalog1Id){
        return catalogService.getCatalog2(catalog1Id);
    }


    @RequestMapping("/getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(@RequestParam String catalog2Id){
        return catalogService.getCatalog3(catalog2Id);
    }


}
