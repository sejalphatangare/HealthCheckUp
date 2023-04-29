/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcheckupsystem.info;

import com.mycompany.healthcheckupsystem.model.Patient;

/**
 *
 * @author jdpha
 */

class Pnode{
    Patient patient;
    Pnode next,prev;

    public Pnode() {
    }

    public Pnode(Patient patient) {
        this.patient = patient;
        next=null;
        prev=null;
    }
}
public class PatientList {
    Pnode head,tail;

    public PatientList() {
        head=null;
        tail=null;
    }
    
    public void InsertPatient(Patient p){
        Pnode node=new Pnode(p);
        if(head==null || tail==null){
            head=node;
            tail=node;
        }else{
            head.next=node;
            node.prev=head;
            head=node;
        }
    }
    
    public Patient searchbyId(String id){
        Pnode temp=head;
        while(temp!=null){
            if(temp.patient.getId().equals(id)){
                return temp.patient;
            }
            temp=temp.prev;
        }
        return null;
    }
    public int size(){
        Pnode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.prev;
        }
        return count;
    }
    public Patient searchbyContact(String contact){
        Pnode temp=head;
        while(temp!=null){
            if(temp.patient.getContact().equals(contact)){
                return temp.patient;
            }
            temp=temp.prev;
        }
        return null;
    }
    public void printData(){
        Pnode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            System.out.println(count+": "+temp.patient.toString());
            temp=temp.prev;
        }
    }
}   


