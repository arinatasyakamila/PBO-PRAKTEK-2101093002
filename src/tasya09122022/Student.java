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
public class Student extends Person {
    public Student() {
        super();
        System.out.println("Inside Student:Constructor");
    }
    
    public String getName(){ 
        System.out.println("Parent: getName");
        return name; 
    } 
    //Override
    
    public static void main( String[] args ){ 
        Student student = new Student(); 
        System.out.println(student.getName());
        System.out.println(student.getAddress());
    } 
}
