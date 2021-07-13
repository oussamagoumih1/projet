package com.example.pfe.service.facade;



import com.example.pfe.bean.Budjet;
import com.example.pfe.bean.BudjetDetail;

import java.util.Date;
import java.util.List;

public interface BudjetService {

    Budjet findByFacture (String facture);

    Budjet save(Budjet budjet);

    Budjet update(Budjet budjet);

    Budjet findByDateFacture (Date dateFacture);

    List<Budjet> findByFactureLibelle (String libelle);

    List<Budjet> findByFactureTotalAndPrix (Double total, Double prix);

    int deleteByDateFacture (Date dateFacture);

    int deleteByDateFacture (List<Budjet>budjets);

    List<Budjet> findByAll();


}
