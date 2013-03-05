/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class13lab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aquimby1
 */
public class Class13Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Question 1
        List hobbyItems = new ArrayList();
        hobbyItems.add("Computer");
        hobbyItems.add("Laptop");
        hobbyItems.add("Movies");
        hobbyItems.add("Laptop");
        
        for(int i=0; i < hobbyItems.size(); i++){
            String x = (String)hobbyItems.get(i);
            System.out.println(x);    
        }  
        
        //Question 2
        Employee e1 = new Employee("Bob","Programer","100");
        Employee e2 = new Employee("Jon","Janitor","200");
        Employee e3 = new Employee("Larry","Boss","300");        
        
        List<Employee> employ = new ArrayList<Employee>();
        employ.add(e1);
        employ.add(e2);
        employ.add(e3);
        
        for(Employee y: employ){
           System.out.println("Name: "+y.getName()+" Job: "+y.getJob()+" ID Num: "+y.getId());
            
        }
        //Question 3
        System.out.println("--------------");
        Dog d1 = new Dog("Fido","312");
        
        List things = new ArrayList();
        things.add(e1);
        things.add(e2);
        things.add(e3);
        things.add(d1);
        
        for(int i=0; i < things.size(); i++){
           if(things.get(i) instanceof Employee){
               Employee emp = (Employee)things.get(i);    
                              
               System.out.println("Name: "+emp.getName()+" Job: "+emp.getJob()+" ID Num: "+emp.getId());
           }
           if(things.get(i) instanceof Dog){
               Dog dog = (Dog)things.get(i);
               System.out.println("Dog Name: "+dog.getName()+" Rabies Id: "+dog.getRabiesId());
           } 
            
            
        }
        
        
        
    }
}
