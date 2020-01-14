package com.yshop.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 属性分类值
 *
 * @author jiyf
 * @create 2020-01-14 16:15
 **/
@Data
public class PmsBaseAttrValue implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String attrName;
    @Column
    private String attrId;
    @Column
    private String isEnabled;

    @Transient
    private String urlParam;

}
