package com.example.pfe.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BudjetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private Double mtFctAffecter;
    private Double mtFctPayer;
    private Double mtFctRes;

    public BudjetDetail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getMtFctAffecter() {
        return mtFctAffecter;
    }

    public void setMtFctAffecter(Double mtFctAffecter) {
        this.mtFctAffecter = mtFctAffecter;
    }

    public Double getMtFctPayer() {
        return mtFctPayer;
    }

    public void setMtFctPayer(Double mtFctPayer) {
        this.mtFctPayer = mtFctPayer;
    }

    public Double getMtFctRes() {
        return mtFctRes;
    }

    public void setMtFctRes(Double mtFctRes) {
        this.mtFctRes = mtFctRes;
    }
}
