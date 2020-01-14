package com.yshop.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 一级类目
 *
 * @author jiyf
 * @create 2020-01-14 11:46
 **/
@Data
public class PmsBaseCatalog1 implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String name;

    @Transient
    private List<PmsBaseCatalog2> pmsBaseCatalog2s;
}
