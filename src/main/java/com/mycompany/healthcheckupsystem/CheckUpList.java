/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcheckupsystem;

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
        }
    }
}
