/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcheckupsystem.model;

import com.mycompany.healthcheckupsystem.model.Doctor;
import com.mycompany.healthcheckupsystem.model.Patient;

/**
 *
 * @author jdpha
 */
public class CheckUp {
    Doctor doctor;
    Patient patient;
    
    private int priority;
    private String recommendation;
    private String date;

    public CheckUp(Doctor doctor, Patient patient, int priority, String recommendation, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.priority = priority;
        this.recommendation = recommendation;
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CheckUp{" + "doctor=" + doctor.toString() + ", patient=" + patient.toString() + ", priority=" + priority + ", recommendation=" + recommendation + ", date=" + date + '}';
    }
    
    
}
