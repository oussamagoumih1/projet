package com.example.pfe.bean;

import javax.persistence.*;

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double identite;
    private String clientName;
    private String libelle;
    private Double qte;
    private Double prix;
    private Double total;
    private String produit;
    @ManyToOne
    private Budjet budjet;

    public Facture() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getIdentite() {
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

    public double getQte() {
        return qte;
    }

    public void setQte(Double qte) {
        this.qte = qte;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public Budjet getBudjet() {
        return budjet;
    }

    public void setBudjet(Budjet budjet) {
        this.budjet = budjet;
    }
}
