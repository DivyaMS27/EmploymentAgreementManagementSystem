package com.gorai.EmployeeManagement.service;

import com.gorai.EmployeeManagement.entity.EmploymentAgreement;
import com.gorai.EmployeeManagement.repository.EmploymentAgreementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmploymentAgreementService {

    @Autowired
    private EmploymentAgreementRepository repository;

    public EmploymentAgreement createAgreement(EmploymentAgreement agreement) {
        return repository.save(agreement);
    }
    public Optional<EmploymentAgreement> getAgreementById(Long id) {
        return repository.findById(id);
    }
    public EmploymentAgreement updateAgreement(Long id,EmploymentAgreement updatedAgreement) {
        Optional<EmploymentAgreement> existingAgreement = repository.findById(id);
        if (existingAgreement.isPresent()) {
            updatedAgreement.setId(id);
            return repository.save(updatedAgreement);
        }
        return null;
    }
    public void deleteAgreement(Long id) {
        repository.deleteById(id);
    }
}
