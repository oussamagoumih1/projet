package com.example.pfe.service.impl;


import com.example.pfe.bean.BudjetDetail;
import com.example.pfe.bean.Commande;
import com.example.pfe.dao.BudjetDetailDao;
import com.example.pfe.service.facade.BudjetDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class BudjetDetailServiceImpl implements BudjetDetailService {
   @Autowired
   private BudjetDetailDao budjetDetailDao;

    @Override
    public BudjetDetail findByType(String type) {
        return null;
    }

    @Override
    public BudjetDetail save(BudjetDetail budjetDetail) {
        if (findByType(budjetDetail.getType())==null)
            budjetDetailDao.save(budjetDetail);
        return budjetDetail;
    }

    @Override
    public BudjetDetail update(BudjetDetail budjetDetail) {
        return budjetDetailDao.save(budjetDetail);
    }

    @Override
    @Transactional
    public int deleteByType(String type) {
        return deleteByType(type);
    }

    @Override
    @Transactional
    public int deleteByType(List<BudjetDetail> budjetDetails) {
        int res = 0;
        for (int i = 0; i < budjetDetails.size(); i++) {
            res += deleteByType(budjetDetails.get(i).getType());
        }
        return res;
    }

    @Override
    public List<BudjetDetail> findByAll() {
        return budjetDetailDao.findAll();
    }

    @Override
    public int payer(String type, Double mtFctPayer, Double mtFctAffecter) {
       BudjetDetail budjetDetail = budjetDetailDao.findByType(type);
        if (budjetDetail == null){
            return -1;
    } else if (budjetDetail.getMtFctAffecter() < mtFctPayer){
                return -2;
            } else {
                Double nvMtFctAffecter = budjetDetail.getMtFctAffecter() - mtFctPayer;
                budjetDetail.setMtFctAffecter(nvMtFctAffecter);
                return 1;
            }
        }

    @Override
    public int reserver(String type, Double mtFctRes, Double mtFctAffecter) {
        BudjetDetail budjetDetail = budjetDetailDao.findByType(type);
        if (budjetDetail == null) {
            return -1;
        } else {
            Double nvMtFctAffecter = budjetDetail.getMtFctAffecter() + mtFctRes;
            budjetDetail.setMtFctAffecter(nvMtFctAffecter);
            return 1;
        }
    }


}
