/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcheckupsystem.info;

import com.mycompany.healthcheckupsystem.model.Patient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author jdpha
 */
public class Patient_info {
    
    String id;
    String name;
    String contact;
    
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    
   public Patient Data() throws IOException{
       System.out.println("Enter Patient Id: ");
       id=br.readLine();
       
       System.out.println("Enter Patient Name: ");
       name=br.readLine();
       
       System.out.println("Enter Patient Contact: ");
       contact=br.readLine();
       
       Patient p=new Patient(id, name, contact);
       return p;
   }
}
