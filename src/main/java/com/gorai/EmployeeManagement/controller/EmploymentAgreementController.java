package com.gorai.EmployeeManagement.controller;

import com.gorai.EmployeeManagement.entity.EmploymentAgreement;
import com.gorai.EmployeeManagement.service.EmploymentAgreementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employment-agreement")
public class EmploymentAgreementController {

    @Autowired
    private EmploymentAgreementService service;

    @PostMapping
    public ResponseEntity<EmploymentAgreement> createAgreement(@RequestBody EmploymentAgreement agreement) {
        EmploymentAgreement savedAgreement = service.createAgreement(agreement);
        return ResponseEntity.ok(savedAgreement);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmploymentAgreement> getAgreementById(@PathVariable Long id) {
        return service.getAgreementById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmploymentAgreement> updateAgreement(@PathVariable Long id, @RequestBody EmploymentAgreement updatedAgreement) {
        EmploymentAgreement agreement=service.updateAgreement(id,updatedAgreement);
        if (agreement!=null) {
            return ResponseEntity.ok(agreement);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAgreement(@PathVariable Long id) {
        service.deleteAgreement(id);
        return ResponseEntity.noContent().build();
    }
}
