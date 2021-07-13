package com.example.pfe.service.impl;

import com.example.pfe.bean.Budjet;
import com.example.pfe.dao.BudjetDao;
import com.example.pfe.service.facade.BudjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
@Service
public class BudjetServiceImpl implements BudjetService {
    @Autowired
    private BudjetDao budjetDao;

    @Override
    public Budjet findByFacture(String facture) {
        return null;
    }

    @Override
    public Budjet save(Budjet budjet) {
        if (findByDateFacture(budjet.getDateFacture())==null)
            budjetDao.save(budjet);
        return budjet;
    }

    @Override
    public Budjet update(Budjet budjet) {
        return budjetDao.save(budjet);
    }

    @Override
    public Budjet findByDateFacture(Date dateFacture) {
        return budjetDao.findByDateFacture(dateFacture);
    }

    @Override
    public List<Budjet> findByFactureLibelle(String libelle) {
        return budjetDao.findByFactureLibelle(libelle);
    }

    @Override
    public List<Budjet> findByFactureTotalAndPrix(Double total, Double prix) {
        return budjetDao.findByFactureTotalAndPrix(total, prix);
    }

    @Override
    @Transactional
    public int deleteByDateFacture(Date dateFacture) {
        return budjetDao.deleteByDateFacture(dateFacture);
    }

    @Override
    @Transactional
    public int deleteByDateFacture(List<Budjet> budjets) {
        int res = 0;
        for (int i = 0; i < budjets.size(); i++) {
            res += deleteByDateFacture(budjets.get(i).getDateFacture());
        }
        return res;
    }

    @Override
    public List<Budjet> findByAll() {
        return budjetDao.findAll();
    }


}
