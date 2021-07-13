package com.example.pfe.dao;

import com.example.pfe.bean.BudjetDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BudjetDetailDao extends JpaRepository<BudjetDetail, Long> {

    BudjetDetail findByType (String type);

    BudjetDetail deleteByType (String type);

}
