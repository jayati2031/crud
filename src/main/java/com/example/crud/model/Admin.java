package com.example.crud.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "admindetails")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank
    @Size(max = 100)
    @Column(name = "emailid")
    private String emailid;

    @NotBlank
    @Column(name = "password")
    private String password;

    public Admin() {
    }

    public Admin(String emailid, String password) {
        this.emailid = emailid;
        this.password = password;

    }

    public long getId() {
        return id;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Admin [id=" + id + ", emailid=" + emailid + ", password=" + password +"]";
    }
}

