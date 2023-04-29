/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcheckupsystem.info;

import com.mycompany.healthcheckupsystem.model.Doctor;

/**
 *
 * @author jdpha
 */
class Dnode{
    Doctor doctor;
    Dnode next,prev;

    public Dnode() {
    }

    public Dnode(Doctor doctor) {
        this.doctor = doctor;
        next=null;
        prev=null;
    }
}
public class DoctorList {
    Dnode head,tail;

    public DoctorList() {
        head=null;
        tail=null;
    }
    
    public void InsertDoctor(Doctor d){
        Dnode node=new Dnode(d);
        if(head==null || tail==null){
            head=node;
            tail=node;
        }else{
            head.next=node;
            node.prev=head;
            head=node;
        }
    }
    
    public Doctor searchbyId(String id){
        Dnode temp=head;
        while(temp!=null){
            if(temp.doctor.getId().equals(id)){
                return temp.doctor;
            }
            temp=temp.prev;
        }
        return null;
    }
    public Doctor searchbyContact(String contact){
        Dnode temp=head;
        while(temp!=null){
            if(temp.doctor.getContact().equals(contact)){
                return temp.doctor;
            }
            temp=temp.prev;
        }
        return null;
    }
    public void allDoctorInfo(){
        Dnode temp=head;
        while(temp!=null){
            System.out.println("Doctor Id: "+temp.doctor.getId()+" Speciality: "+temp.doctor.getSpeciality());
            temp=temp.prev;
        }
    }
}
