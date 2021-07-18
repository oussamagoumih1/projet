package com.example.pfe.service.impl;

import com.example.pfe.bean.Facture;
import com.example.pfe.dao.FactureDao;
import com.example.pfe.service.facade.FactureService;
import com.example.pfe.vo.FactureVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class FactureServiceImpl implements FactureService {

    @Autowired
    private FactureDao factureDao;
    @Autowired
    private EntityManager entityManager;


    @Override
    public Facture findByLibelle(String libelle) {
        return factureDao.findByLibelle(libelle);
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

    @Override
    public List<Facture> search(FactureVo factureVo) {
        String q =  "select f from Facture f where 1=1";
        if(factureVo.getIdentite()!=null){
            q += " And f.identite LIKE '%" + factureVo.getIdentite()+"%'";
        }
        if (factureVo.getTotalMin()!=null){
            q += " And f.total >= " + factureVo.getTotalMin();
        }
        if (factureVo.getTotalMax()!=null){
            q += " And f.total <= " + factureVo.getTotalMax();
        }
        return entityManager.createQuery(q).getResultList();
    }
}