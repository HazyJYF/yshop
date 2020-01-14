package com.yshop.bean;

import lombok.Data;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 属性分类
 *
 * @author jiyf
 * @create 2020-01-14 16:11
 **/
@Data
public class PmsBaseAttrInfo implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String attrName;
    @Column
    private String catalog3Id;
    @Column
    private String isEnabled;

    @Transient
    List<PmsBaseAttrValue> attrValueList;
}
