/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.healthcheckupsystem;

/**
 *
 * @author jdpha
 */
public class HealthCheckupSystem {

    public static void main(String[] args) {
        Patient p1=new Patient("1","Sayali","8794561213");
        Patient p2=new Patient("2","Mayuri","7456121346");
        Patient p3=new Patient("3","Umesh","9875461210");
        
        
        PatientList plist=new PatientList();
        plist.InsertPatient(p1);
        plist.InsertPatient(p2);
        plist.InsertPatient(p3);

        System.out.println("Searched by id: "+plist.searchbyId("2").getName());
        Doctor d1=new Doctor("1","Shiva","7845612346","Eyes",8000);
        Doctor d2=new Doctor("2","Bill Smith","7418529631","Ear",4500);
        Doctor d3=new Doctor("3","Umesh","9875461210","Nose",1000);
        DoctorList dlist=new DoctorList();
        dlist.InsertDoctor(d1);
        dlist.InsertDoctor(d2);
        dlist.InsertDoctor(d3);

        dlist.allDoctorInfo();
        
        
    
    
    }
}
