package com.example.pfe.service.impl;

import com.example.pfe.bean.Facture;
import com.example.pfe.dao.FactureDao;
import com.example.pfe.service.facade.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FactureServiceImpl implements FactureService {

    @Autowired
    private FactureDao factureDao;


    @Override
    public Facture findByLibelle(String libelle) {
        return null;
    }

    @Override
    public Facture save(Facture facture) {
        if (findByLibelle(facture.getLibelle()) == null)
            factureDao.save(facture);
        return facture;
    }

    @Override
    public Facture update(Facture facture) {
        return factureDao.save(facture);
    }

    @Override
    public List<Facture> findAll() {
        return factureDao.findAll();
    }

    @Override
    public Facture deleteByByClientName(String clientName) {
        return factureDao.deleteByClientName(clientName);
    }

    @Override
    @Transactional
    public int deleteByLibelle(String libelle) {
        return factureDao.deleteByLibelle(libelle);
    }

    @Override
    @Transactional
    public int deleteByLibelle(List<Facture> factures) {
        int res = 0;
        for (int i = 0; i < factures.size(); i++) {
            res += deleteByLibelle(factures.get(i).getLibelle());
        }
        return res;
    }

    public int calculer(String clientName, double prix, double qte, double total) {
        total = 0;
        Facture facture = factureDao.findByClientName(clientName);
        if (facture == null) {
            return -1;
        } else {
            Facture f = new Facture();
            f.setQte(qte);
            f.setPrix(prix);
            f.setTotal(total);
            total += prix * qte;
            factureDao.save(f);
            return 1;
        }
    }
}