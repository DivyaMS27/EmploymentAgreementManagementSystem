package com.gorai.EmployeeManagement.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class OtherDetails {

    private String department;
    private String manager;

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department=department;
    }

    public String getManager() {
        return manager;
    }
    public void setManager(String manager) {
        this.manager=manager;
    }
}
