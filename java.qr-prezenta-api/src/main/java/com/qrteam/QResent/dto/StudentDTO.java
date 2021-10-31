package com.qrteam.QResent.dto;

import com.qrteam.QResent.models.Materie;

import java.util.ArrayList;
import java.util.List;

public class StudentDTO {
    private String cnp;
    private String firstName;
    private String lastName;
    private String email;
    private int yearOfStudy;

    public StudentDTO() {

    }

    public StudentDTO(String cnp, String firstName, String lastName, String email, int yearOfStudy) {
        this.cnp = cnp;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.yearOfStudy = yearOfStudy;
    }


    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}

