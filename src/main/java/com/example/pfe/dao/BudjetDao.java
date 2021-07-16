package com.example.pfe.dao;

import com.example.pfe.bean.Budjet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface BudjetDao extends JpaRepository <Budjet, Long> {

    Budjet findByDateFacture (Date dateFacture);

    Budjet findByFacture (String facture);

    List<Budjet> findByFactureLibelle (String libelle);

    int deleteByDateFacture (Date dateFacture);

}
