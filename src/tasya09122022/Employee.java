/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasya09122022;

/**
 *
 * @author User
 */
public class Employee extends Person {
    @Override
     public String getName(){ 
        System.out.println("Parent: getName");
        return name; 
     } 
    
}
