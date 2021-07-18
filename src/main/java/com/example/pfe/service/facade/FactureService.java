package com.example.pfe.service.facade;

import com.example.pfe.bean.BudjetDetail;
import com.example.pfe.bean.Facture;
import com.example.pfe.vo.FactureVo;

import java.util.List;

public interface FactureService {

    Facture findByLibelle (String libelle);

    Facture save(Facture facture);

    Facture update(Facture facture);

    List<Facture> findAll();

    Facture deleteByByClientName (String clientName);

    int deleteByLibelle(String libelle);

    int deleteByLibelle(List<Facture> factures);

    int calculer(String clientName, double prix, double qte, double total);

    List<Facture> search(FactureVo factureVo);
}
