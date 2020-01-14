package com.yshop.service;

import com.yshop.bean.PmsBaseAttrInfo;

import java.util.List;

/**
 * 属性Service
 *
 * @author jiyf
 * @create 2020-01-14 17:06
 **/
public interface AttrService {

    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    void save(PmsBaseAttrInfo pmsBaseAttrInfo);
}
