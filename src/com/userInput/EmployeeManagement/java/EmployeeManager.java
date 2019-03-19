package com.userInput.EmployeeManagement.java;

import java.util.*;
import java.util.Scanner;

//import com.exmaple.core.java.EmployeeManage;

//import com.exmaple.core.java.EmployeeManage;

public class EmployeeManager {

    static int key;
    static TreeMap<Integer,Object> empObj=new TreeMap<Integer,Object>();
     static void showEmp(Collection<Object> col) {
        for(Object emp:col) {
            System.out.println(emp);
        }
     }
     static void displayAll(Collection<Map.Entry<Integer, Object>> col) {
            Iterator<Map.Entry<Integer, Object>> itr = col.iterator();
            while (itr.hasNext()) {
                Map.Entry<Integer, Object> entry = itr.next();
                System.out.println(entry.getKey() + " " + entry.getValue() + " ");
                
            }
            System.out.println();
    }
    
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        //empObj.put(1, new Employee<Number>("abc",30000.50));
        //empObj.put(2, new Employee<Number>("xyz",30000));
        //empObj.put(3, new Employee<Number>("mnp",5000.6765));
        
        showEmp(empObj.values());
        System.out.println("with key");
        displayAll(empObj.entrySet());
        
         boolean res=empObj.replace(3, "mnp", "braja");
         System.out.println(res);
        
        
        EmployeeManager.editEmp();
        
        
        
        serchEmp(empObj.get(3));
        
        int i=1;
        
        
        int type;
        while(true) {
            System.out.println("\n 1. Add Employee \n 2. Edit Employee \n 3. delete Employee \n 4. Display all employee \n 5. Exit");
            type=sc.nextInt();
        switch(type){
        case 1:
            System.out.println("enter employee name: ");
            String name=sc.next();
            System.out.println("enter employee salary: ");
            int salary=sc.nextInt();
            empObj.put(++key, new Employee<Employee>(name,salary));
            System.out.println("Employee successfully added");
            break;
            
        case 2:
            System.out.println("Enter key value :");
            int editKey=sc.nextInt();
            System.out.println("Editable record : "+empObj.get(editKey));
            while(true) {
                System.out.println("\n 1. edit name \n 2. edit salary");
                int editType=sc.nextInt();
                switch(editType) {
                case 1:
                    System.out.println("Enter updated name : ");
                    String updatedName=sc.next();
                    
                }
            }
            
        case 3:
            System.out.println("Enter key value :");
            int delKey=sc.nextInt();
            System.out.println("deleted emp : "+ empObj.remove(delKey));
            break;
            
        case 4:
            System.out.println("Employee details");
            displayAll(empObj.entrySet());
            break;
            
        case 5:
            System.exit(0);
        }
        
        }
        
    }
    
    
    private static void editEmp() {
        // TODO Auto-generated method stub
        System.out.println("after edit");
        empObj.replace(3, "mnp", "braja");
        displayAll(empObj.entrySet());
        
    }
    public static void deleteEmp() {
        // TODO Auto-generated method stub
        System.out.println("deleted emp : "+ empObj.remove(2));
        displayAll(empObj.entrySet());

    }
    private static void serchEmp(Object ob) {
        // TODO Auto-generated method stub
        System.out.println("search by key");
        System.out.println(ob);
    }
    
    
    

}
