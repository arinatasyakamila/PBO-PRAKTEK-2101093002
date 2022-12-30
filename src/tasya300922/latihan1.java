/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasya300922;

import java.io.*;

/**
 *
 * @author User
 */
public class latihan1 {
    public static void main( String[] args ){ 
 
        BufferedReader dataIn = new BufferedReader( 
            new InputStreamReader( System.in) ); 
        String name = ""; 
        String addres = "";
        String jurusan = "";
        

        try{
            System.out.print("Please Enter Your Name:");
            name = dataIn.readLine(); 
            System.out.print("Please Enter Your Addres:");
            addres = dataIn.readLine(); 
            System.out.print("Please Enter Your Jurusan:");
            jurusan = dataIn.readLine(); 
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        } 
            System.out.println("Hello " + name +"!"); 
            System.out.println("Hello " + addres +"!"); 
            System.out.println("Hello " + jurusan +"!"); 
        }
    
}
