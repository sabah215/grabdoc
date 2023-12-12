package com.eitaciesproject.grabdoc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "doctors")
public class Doctor {

    public Doctor(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "specialization")
    private String specialization;
    @Column(name = "highest_degree")
    private String highestDegree;
    @Column(name = "education")
    private String education;
    @Column(name = "overview")
    private String overview;
    @Column(name = "conditions_treated")
    private String conditionsTreated;
    @Column(name = "phone_no")
    private String phoneNo;

    public Doctor(int id, String firstName, String lastName,
                  String email, String specialization, String highestDegree,
                  String education, String overview,
                  String conditionsTreated, String phoneNo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.specialization = specialization;
        this.highestDegree = highestDegree;
        this.education = education;
        this.overview = overview;
        this.conditionsTreated = conditionsTreated;
        this.phoneNo = phoneNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return lastName;
    }

    public void setLast_name(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getConditionsTreated() {
        return conditionsTreated;
    }

    public void setConditionsTreated(String conditionsTreated) {
        this.conditionsTreated = conditionsTreated;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", specialization='" + specialization + '\'' +
                ", highest_degree='" + highestDegree + '\'' +
                ", education='" + education + '\'' +
                ", overview='" + overview + '\'' +
                ", conditions_treated='" + conditionsTreated + '\'' +
                ", phone_no='" + phoneNo + '\'' +
                '}';
    }
}
