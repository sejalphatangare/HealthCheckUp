/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import com.mycompany.healthcheckupsystem.info.CheckUpList;
import com.mycompany.healthcheckupsystem.info.PatientList;
import com.mycompany.healthcheckupsystem.info.DoctorList;
import com.mycompany.healthcheckupsystem.model.Doctor;
import com.mycompany.healthcheckupsystem.info.Doctor_info;
import com.mycompany.healthcheckupsystem.info.Patient_info;
import com.mycompany.healthcheckupsystem.model.CheckUp;
import com.mycompany.healthcheckupsystem.model.Patient;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author jdpha
 */
public class HealthCheckupSystem {
    
    public static void main(String[] args) throws IOException {
        
          InputStreamReader ir=new InputStreamReader(System.in);
          BufferedReader br=new BufferedReader(ir);
          Scanner sc=new Scanner(System.in);
//        Patient p1=new Patient("1","Sayali","8794561213");
//        Patient p2=new Patient("2","Mayuri","7456121346");
//        Patient p3=new Patient("3","Umesh","9875461210");
//        
//        
//        
//        plist.InsertPatient(p1);
//        plist.InsertPatient(p2);
//        plist.InsertPatient(p3);
//
//        System.out.println("Searched by id: "+plist.searchbyId("2").getName());
//        Doctor d1=new Doctor("1","Shiva","7845612346","Eyes",8000);
//        Doctor d2=new Doctor("2","Bill Smith","7418529631","Ear",4500);
//        Doctor d3=new Doctor("3","Umesh","9875461210","Nose",1000);
//        
//        dlist.InsertDoctor(d1);
//        dlist.InsertDoctor(d2);
//        dlist.InsertDoctor(d3);
//
//        dlist.allDoctorInfo();
//        System.out.println(dlist.searchbyId("2").getName()+" "+dlist.searchbyId("2").getFees());
//        
//        CheckUp c1=new CheckUp(d1, p1, 3, "A", "12");
//        CheckUp c2=new CheckUp(d2, p2, 2, "B", "30");
//        CheckUp c3=new CheckUp(d3, p3, 1, "C", "1");
//        CheckUp c4=new CheckUp(d1, p1, 2, "E", "4");
//
//        CheckUpList clist=new CheckUpList();
//        clist.Enqueue(c1);
//        clist.Enqueue(c2);
//        clist.Enqueue(c3); 
//        clist.Enqueue(c4);
//        clist.Print();
    
          PatientList plist=new PatientList();
          DoctorList dlist=new DoctorList();
          Doctor_info dinfo=new Doctor_info();
          Patient_info pinfo=new Patient_info();
          
          int choice=0;
          do{
              System.out.println("\n\n-------------- Health CheckUp --------------");
              System.out.println("\n1)Add a Doctor: \n2)Add a patient: \n3)Print all Doctors: \n4)Print all Patient: \n5)View CheckUp Menu: \n6)Exit:" );
              System.out.println("Enter your Choice: ");
              choice=sc.nextInt();
              switch(choice){
                  case 1:{
                      Doctor d=dinfo.Data();
                      dlist.InsertDoctor(d);
                      break;
                  }
                  case 2:{
                      Patient p=pinfo.Data();
                      plist.InsertPatient(p);
                      break;
                  }
                  case 3:{
                      dlist.allDoctorInfo();
                      break;
                  }
                  case 4:{
                      plist.printData();
                  }
                  case 5:{
                      System.out.println("\n------------CheckUp--------------");
                      CheckUpList[] clist=new CheckUpList[dlist.size()];
                      for(int i=0;i<clist.length;i++){
                          clist[i] =new CheckUpList();
                          Doctor doctor=dlist.getAtIndex(i);
                          System.out.println("\n\nEnter Patient for Doctor: ");
                          System.out.println("Name: "+doctor.getName());
                          System.out.println("Speciality: "+doctor.getSpeciality());
                          System.out.println("Fees:"+doctor.getFees());
                          
                          System.out.println("All Patients: ");
                          plist.printData();
                            do{
                              System.out.println("Enter the id of Patient: ");
                              String id=br.readLine();
                              System.out.println("Enter the Priority");
                              System.out.println("\n1]Priority 3 for Emergency: \n2]Priority 2 for Intermediate\n4]Press Any key for Normal:");
                              int ch=sc.nextInt();
                              int priority=1;
                              switch(ch){
                                  case 1:{
                                      priority=3;
                                      break;
                                  }
                                  case 2:{
                                      priority=2;
                                      break;
                                  }
                                  default:priority=1;
                              }
                              Patient patient=plist.searchbyId(id);
                              if(patient==null){
                                  System.out.println("Invalid Patient id");
                              }else{
                                  CheckUp cup=new CheckUp(doctor, patient, priority, " ", " "+java.util.Calendar.getInstance().getTime().toString());
                                  clist[i].Enqueue(cup);
                              }
                              System.out.println("Do you want to continue operating?");
                            }while(sc.nextInt()==1);
                            
                  }
          
            System.out.println("Do you want to continue? "); 
            break;
                 
    
                  }
              
          
   }
        System.out.println("Do you want to continue? ");
                 
}while(sc.nextInt()==1);
    }
}

