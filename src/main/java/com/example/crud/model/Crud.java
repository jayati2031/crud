package com.example.crud.model;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name = "employeedetails")
public class Crud {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty(message = "FirstName cannot be empty")
    @Size(message = "FirstName is not valid", min=3,max=20)
    @Column(name = "firstname")
    private String firstname;

    @NotEmpty(message = "LastName cannot be empty")
    @Size(message = "LastName is not valid", min=3,max=20)
    @Column(name = "lastname")
    private String lastname;

    @NotEmpty(message = "Mobile No cannot be empty")
    @Pattern(message = "Mobile No is not valid", regexp="(^$|[0-9]{10})")
    @Column(name = "mobile")
    private String mobile;

    @Email(message = "Email is not valid", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    @NotEmpty(message = "Email cannot be empty")
    @Column(name = "email")
    private String email;

    @NotEmpty(message = "Salary cannot be empty")
    @Pattern(message = "Salary is not valid", regexp="^(0|[1-9][0-9]*)$")
    @Column(name = "salary")
    private String salary;

    public Crud() {
    }

    public Crud(String firstname, String lastname,String mobile,String email,String salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobile = mobile;
        this.email = email;
        this.salary = salary;
    }

    public long getId() {
        return id;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Crud [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ",mobile=" + mobile + ",email=" + email + ",salary="+ salary+ "]";
    }
}


