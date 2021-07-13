package com.example.pfe.ws.provided;

import com.example.pfe.bean.Facture;
import com.example.pfe.service.facade.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pfe/Facture")
public class FactureProvidedRest {
    @Autowired
    private FactureService factureService;

@GetMapping("/libelle/{libelle}")
    public Facture findByLibelle(@PathVariable String libelle) {
        return factureService.findByLibelle(libelle);
    }
@PostMapping("/")
    public Facture save(@RequestBody Facture facture) {
        return factureService.save(facture);
    }
@PutMapping("/")
    public Facture update(@RequestBody Facture facture) {
        return factureService.update(facture);
    }
@GetMapping("/")
    public List<Facture> findAll() {
        return factureService.findAll();
    }
@DeleteMapping("/clientName/{clientName}")
    public Facture deleteByByClientName(@PathVariable String clientName) {
        return factureService.deleteByByClientName(clientName);
    }
    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return factureService.deleteByLibelle(libelle);
    }
@PostMapping("/delete-multiple-by-libelle")
    public int deleteByLibelle(@RequestBody List<Facture> factures) {
        return factureService.deleteByLibelle(factures);
    }

    @PutMapping("/clientName/{clientName}/prix/{prix}/qte/{qte}/total/{total}")
    public int calculer(String clientName, double prix, double qte, double total) {
        return factureService.calculer(clientName, prix, qte, total);
    }
}
