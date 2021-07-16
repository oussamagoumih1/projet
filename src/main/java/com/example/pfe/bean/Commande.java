package com.example.pfe.bean;

import javax.persistence.*;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private BudjetDetail budjetDetail;


    public Commande() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BudjetDetail getBudjetDetail() {
        return budjetDetail;
    }

    public void setBudjetDetail(BudjetDetail budjetDetail) {
        this.budjetDetail = budjetDetail;
    }
}
