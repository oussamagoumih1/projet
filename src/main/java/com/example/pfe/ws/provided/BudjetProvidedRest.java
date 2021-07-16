package com.example.pfe.ws.provided;

import com.example.pfe.bean.Budjet;
import com.example.pfe.service.facade.BudjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pfe/Budjet")
public class BudjetProvidedRest {
    @Autowired
    private BudjetService budjetService;


    @GetMapping("/facture/{facture}")
    public Budjet findByFacture(@PathVariable String facture) {
        return budjetService.findByFacture(facture);
    }

    @PostMapping("/")
    public Budjet save(@RequestBody Budjet budjet) {
        return budjetService.save(budjet);
    }
@PutMapping("/")
    public Budjet update(@RequestBody  Budjet budjet) {
        return budjetService.update(budjet);
    }
@GetMapping("/dateFacture/{dateFacture}")
    public Budjet findByDateFacture(@PathVariable Date dateFacture) {
        return budjetService.findByDateFacture(dateFacture);
    }
@GetMapping("/facture/libelle/{libelle}")
    public List<Budjet> findByFactureLibelle(String libelle) {
        return budjetService.findByFactureLibelle(libelle);
    }

@DeleteMapping("/dateFacture/{dateFacture}")
    public int deleteByDateFacture(@PathVariable Date dateFacture) {
        return budjetService.deleteByDateFacture(dateFacture);
    }
@PostMapping("/delete-multiple-by-dateFacture")
    public int deleteByDateFacture(List<Budjet> budjets) {
        return budjetService.deleteByDateFacture(budjets);
    }
}
