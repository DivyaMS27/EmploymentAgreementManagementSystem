package com.gorai.EmployeeManagement.repository;

import com.gorai.EmployeeManagement.entity.EmploymentAgreement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploymentAgreementRepository extends JpaRepository<EmploymentAgreement, Long> {
  List<EmploymentAgreement> findByEmployeeNameContainingOrRoleContaining(String employeeName,String role);
}
