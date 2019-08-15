package com.pvlpech.domain;

import java.util.List;

public class EmployeesCreation {

    private List<Employee> employees;

    public EmployeesCreation() {
    }

    public EmployeesCreation(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
