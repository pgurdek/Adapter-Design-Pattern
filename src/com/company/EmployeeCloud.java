package com.company;

public class EmployeeCloud {

    private Integer prefix;
    private String firstname;
    private String lastname;
    private String emailAdress;


    public EmployeeCloud(Integer prefix, String firstname, String lastname, String emailAdress) {
        this.prefix = prefix;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailAdress = emailAdress;
    }

    public Integer getPrefix() {
        return prefix;
    }

    public void setPrefix(Integer prefix) {
        this.prefix = prefix;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
}
