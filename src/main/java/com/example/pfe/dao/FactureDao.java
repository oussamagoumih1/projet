package com.example.pfe.dao;

import com.example.pfe.bean.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface FactureDao extends JpaRepository <Facture, Long> {

    Facture findByBudjet(String Budjet);

    Facture findByLibelle (String libelle);

    Facture findByProduit (String produit);

    Facture findByClientName (String clientName);

    Facture findByTotalAndPrix(Double total, Double prix);

    Facture deleteByClientName (String clientName);

    Facture deleteByIdentite(Double identite);

    int deleteByLibelle(String libelle);

    List<Facture> findByBudjetDateFacture (Date dateFacture);
}
