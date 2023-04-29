/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcheckupsystem.info;

import com.mycompany.healthcheckupsystem.model.CheckUp;
import com.mycompany.healthcheckupsystem.model.Patient;

/**
 *
 * @author jdpha
 */
class Cnode{
    CheckUp cu;
    Cnode next,prev;

    public Cnode(CheckUp cu) {
        this.cu = cu;
        next=prev=null;
    }
    
}
public class CheckUpList {
    Cnode head,tail;
    

    public CheckUpList() {
        head=tail=null;
    }
    
    public void Enqueue(CheckUp cu){
        Cnode node =new Cnode(cu);
        
        if(head==null || tail==null){
            head=node;
            tail=node;
        }else if(head.cu.getPriority()<cu.getPriority()){
            head.next=node;
            node.prev=head;
            head=node;
        }else if(tail.cu.getPriority()>=cu.getPriority()){
            tail.prev=node;
            node.next=tail;
            tail=node;
        }else{
            Cnode temp=tail;
            while(temp!=null){
             if(temp.cu.getPriority()>=cu.getPriority()){
                 break;
             }  
             temp=temp.next;
            }
            node.next=temp;
            node.prev=temp.prev;
            temp.prev.next=node;
            temp.prev=node;
        }
    }
    public CheckUp Dequeue(){
        if(head==null){
            return null;
        }
        Cnode checkup=head;
        head=head.next;
        return checkup.cu;
    }
    
    public void Print(){
        Cnode temp=head;
        while(temp!=null){
            System.out.println("Priority: "+temp.cu.getPriority()+" Recommendation: "+temp.cu.getRecommendation());
            temp=temp.prev;
        }
    }
    public void addRecommendation(int index,String rec){
        Cnode temp=head;
        int i=0;
        while(temp!=null){
            if(index==i){
                temp.cu.setRecommendation(rec);
                break;
            }
            i++;
            temp=temp.prev;
        }
    }
    public Patient getPatient(int index){
        Cnode temp=head;
        int i=0;
        while(temp!=null){
            if(index==i){
                break;
            }
            i++;
            temp=temp.prev;
        }
        return temp.cu.getPatient();
        
    }
}
