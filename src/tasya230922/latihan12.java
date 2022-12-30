/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasya230922;

/**
 *
 * @author User
 */
public class latihan12 {
     public static void main( String[] args ){
        
        int number_1 = 10;
        int number_2 = 23;
        int number_3 = 5;
        int nilai= (number_1>number_2)?number_1:(number_2>number_3)?number_2:(number_3>number_1)?number_3:number_1;
        
       
        
        System.out.println("Number_1 =" +number_1 );
        System.out.println("Number_2 =" +number_2 );
        System.out.println("Number_3 =" +number_3 );
        System.out.println("Nilai Terbesar = " +nilai );
    }
    
}
