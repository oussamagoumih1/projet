package com.example.pfe.ws.provided;

import com.example.pfe.bean.BudjetDetail;
import com.example.pfe.service.facade.BudjetDetailService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pfe/BudjetDetail")
public class BudjetDetailProvidedRest {
    @Autowired
    private BudjetDetailService budjetDetailService;
    @GetMapping("/type/{type}")
    @ApiOperation("findByType")
    public BudjetDetail findByType(@PathVariable String type) {
        return budjetDetailService.findByType(type);
    }
    @PostMapping("/")
    @ApiOperation("save")
    public BudjetDetail save(@RequestBody BudjetDetail budjetDetail) {
        return budjetDetailService.save(budjetDetail);
    }
    @PutMapping("/")
    @ApiOperation("update")
    public BudjetDetail update(@RequestBody BudjetDetail budjetDetail) {
        return budjetDetailService.update(budjetDetail);
    }
    @DeleteMapping("/type/{type}")
    @ApiOperation("deleteByType")
    public int deleteByType(@PathVariable String type) {
        return budjetDetailService.deleteByType(type);
    }
    @PostMapping("/delete-multiple-by-type")
    @ApiOperation("multiple delete")
    public int deleteByType(@RequestBody List<BudjetDetail> budjetDetails) {
        return budjetDetailService.deleteByType(budjetDetails);
    }
}
