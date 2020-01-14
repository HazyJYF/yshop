package com.yshop.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yshop.bean.PmsBaseAttrInfo;
import com.yshop.bean.PmsBaseAttrValue;
import com.yshop.manage.mapper.PmsBaseAttrInfoMapper;
import com.yshop.manage.mapper.PmsBaseAttrValueMapper;
import com.yshop.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 属性impl
 *
 * @author jiyf
 * @create 2020-01-14 17:14
 **/
@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    private PmsBaseAttrInfoMapper infoMapper;

    @Autowired
    private PmsBaseAttrValueMapper valueMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        return infoMapper.select(pmsBaseAttrInfo);
    }

    @Override
    public void save(PmsBaseAttrInfo pmsBaseAttrInfo) {
        infoMapper.insert(pmsBaseAttrInfo);
    }
}
