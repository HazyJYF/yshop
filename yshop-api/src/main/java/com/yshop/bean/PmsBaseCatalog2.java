package com.yshop.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 二级类目
 *
 * @author jiyf
 * @create 2020-01-14 11:46
 **/
@Data
public class PmsBaseCatalog2 implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String name;

    @Column
    private String catalog1Id;

    @Transient
    private List<PmsBaseCatalog3> pmsBaseCatalog3s;


}
