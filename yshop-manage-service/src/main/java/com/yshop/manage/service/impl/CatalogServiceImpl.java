package com.yshop.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yshop.bean.PmsBaseCatalog1;
import com.yshop.bean.PmsBaseCatalog2;
import com.yshop.bean.PmsBaseCatalog3;
import com.yshop.manage.mapper.PmsBaseCatalog1Mapper;
import com.yshop.manage.mapper.PmsBaseCatalog2Mapper;
import com.yshop.manage.mapper.PmsBaseCatalog3Mapper;
import com.yshop.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 类目Impl
 *
 * @author jiyf
 * @create 2020-01-14 17:04
 **/
@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private PmsBaseCatalog1Mapper catalog1Mapper;

    @Autowired
    private PmsBaseCatalog2Mapper catalog2Mapper;

    @Autowired
    private PmsBaseCatalog3Mapper catalog3Mapper;


    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return catalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        PmsBaseCatalog2 pmsBaseCatalog2 = new PmsBaseCatalog2();
        pmsBaseCatalog2.setCatalog1Id(catalog1Id);
        return catalog2Mapper.select(pmsBaseCatalog2);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        PmsBaseCatalog3 pmsBaseCatalog3 = new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);
        return catalog3Mapper.select(pmsBaseCatalog3);
    }
}
