package com.company;

public class EmployeeAdapterCloud implements Employee{

    private EmployeeCloud employeeCloud;

    public EmployeeAdapterCloud(EmployeeCloud employeeCloud) {
        this.employeeCloud = employeeCloud;
    }

    @Override
    public String getId() {
        return String.valueOf(employeeCloud.getPrefix());
    }

    @Override
    public String getFirstName() {
        return employeeCloud.getFirstname();
    }

    @Override
    public String getLastName() {
        return employeeCloud.getLastname();
    }

    @Override
    public String getEmail() {
        return employeeCloud.getEmailAdress();
    }
}
