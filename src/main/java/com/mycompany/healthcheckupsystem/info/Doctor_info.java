/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcheckupsystem.info;

import com.mycompany.healthcheckupsystem.model.Doctor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author jdpha
 */
public class Doctor_info {
    String id,name,contact,speciality;
    int fees;
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    Scanner sc=new Scanner(System.in);
   public Doctor Data() throws IOException{
       System.out.println("Enter Doctor Id: ");
       id=br.readLine();
       
       System.out.println("Enter Doctor Name: ");
       name=br.readLine();
       
       System.out.println("Enter Doctor Contact: ");
       contact=br.readLine();
       
       System.out.println("Enter Doctor Speciality: ");
       speciality=br.readLine();
       
       System.out.println("Enter Doctor Fees: ");
       fees=sc.nextInt();
       
       Doctor d=new Doctor(id, name, contact, speciality, fees);
       return d;
   }
}
