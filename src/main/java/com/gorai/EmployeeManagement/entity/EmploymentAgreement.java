package com.gorai.EmployeeManagement.entity;

import jakarta.persistence.*;

import javax.print.attribute.standard.MediaSize;
import java.time.LocalDate;

@Entity
public class EmploymentAgreement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String employeeName;
    private String role;
    private LocalDate startDate;
    private LocalDate endDate;
    private double salary;
    private String terms;

    @Embedded
    private OtherDetails otherDetails;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id=id;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName=employeeName;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role=role;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate=startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate() {
        this.endDate=endDate;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary=salary;
    }

    public String getTerms() {
        return terms;
    }
    public void setTerms(String terms) {
        this.terms=terms;
    }

    public OtherDetails getOtherDetails() {
        return otherDetails;
    }
    public void setOtherDetails(OtherDetails otherDetails) {
        this.otherDetails=otherDetails;
    }



}
