/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcheckupsystem.model;

/**
 *
 * @author jdpha
 */
public class Doctor {
    private String id,name,contact,speciality;
    private int fees;

    public Doctor(){
        
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public Doctor(String id, String name, String contact, String speciality, int fees) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.speciality = speciality;
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", name=" + name + ", contact=" + contact + ", speciality=" + speciality + ", fees=" + fees + '}';
    }
    
}
