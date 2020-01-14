package com.yshop.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 三级类目
 *
 * @author jiyf
 * @create 2020-01-14 11:46
 **/
@Data
public class PmsBaseCatalog3 implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String name;

    @Column
    private String catalog2Id;
}
