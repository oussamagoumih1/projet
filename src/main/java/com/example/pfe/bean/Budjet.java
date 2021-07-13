package com.example.pfe.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Budjet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dateFacture;
    private Double mtFacture;
    private Double mtInvester;

    @ManyToOne
    private Facture facture;

    public Budjet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public Double getMtFacture() {
        return mtFacture;
    }

    public void setMtFacture(Double mtFacture) {
        this.mtFacture = mtFacture;
    }

    public Double getMtInvester() {
        return mtInvester;
    }

    public void setMtInvester(Double mtInvester) {
        this.mtInvester = mtInvester;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }
}
