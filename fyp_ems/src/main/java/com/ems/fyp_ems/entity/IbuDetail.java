package com.ems.fyp_ems.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class IbuDetail {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column(name = "name")
    private String name;

    @Column(name = "ic")
    private String ic;

    @Column(name = "oku")
    private String oku;

    public IbuDetail(){}
    
    public IbuDetail(Long id,String name, String ic, String oku) {
        this.id = id;
        this.name = name;
        this.ic = ic;
        this.oku = oku;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getOku() {
        return oku;
    }

    public void setOku(String oku) {
        this.oku = oku;
    }

}

