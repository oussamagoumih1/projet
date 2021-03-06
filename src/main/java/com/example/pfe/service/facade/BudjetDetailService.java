package com.example.pfe.service.facade;

import com.example.pfe.bean.BudjetDetail;
import com.example.pfe.bean.Commande;

import java.util.List;

public interface BudjetDetailService {

    BudjetDetail findByType (String type);

    BudjetDetail save(BudjetDetail budjetDetail);

    BudjetDetail update(BudjetDetail budjetDetail);

    int deleteByType (String type);

    int deleteByType (List<BudjetDetail> budjetDetails);

    List<BudjetDetail> findByAll();

    int payer (String type, Double mtFctPayer, Double mtFctAffecter);

    int reserver (String type, Double mtFctRes, Double mtFctAffecter);
}
