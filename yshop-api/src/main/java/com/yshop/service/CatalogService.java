package com.yshop.service;

import com.yshop.bean.PmsBaseCatalog1;
import com.yshop.bean.PmsBaseCatalog2;
import com.yshop.bean.PmsBaseCatalog3;

import java.util.List;

/**
 * 类目Service
 *
 * @author jiyf
 * @create 2020-01-14 17:03
 **/
public interface CatalogService {

    List<PmsBaseCatalog1> getCatalog1();
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);
    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
