package com.example.pfe.vo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class FactureVo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double identite;
    private String clientName;
    private String libelle;
    private Double qte;
    private Double prix;
    private Double total;
    private Double totalMin;
    private Double totalMax;
    private String produit;

    public FactureVo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getIdentite() {
        return identite;
    }

    public void setIdentite(Double identite) {
        this.identite = identite;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getQte() {
        return qte;
    }

    public void setQte(Double qte) {
        this.qte = qte;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalMin() {
        return totalMin;
    }

    public void setTotalMin(Double totalMin) {
        this.totalMin = totalMin;
    }

    public Double getTotalMax() {
        return totalMax;
    }

    public void setTotalMax(Double totalMax) {
        this.totalMax = totalMax;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }
}
