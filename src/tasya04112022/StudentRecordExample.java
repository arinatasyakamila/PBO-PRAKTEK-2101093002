/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasya04112022;

/**
 *
 * @author User
 */
public class StudentRecordExample {
   public static void main(String[] args) {
        studentRecord student1 = new studentRecord();
        student1.setName("Afi");
        student1.setAddress("Padang");
        student1.setAge(20);
        student1.setmathGrade(70);
        student1.setenglishGrade(80);
        student1.setscienceGrade(90);
       
        System.out.println("Nama                : " +student1.getName());
        System.out.println("Alamat              : " +student1.getAddress());
        System.out.println("Umur                : " +student1.getAge());
        System.out.println("Matematika          : " +student1.getmathGrade());
        System.out.println("B.inggris           : " +student1.getenglishGrade());
        System.out.println("Pengetahuan         : " +student1.getscienceGrade());
        System.out.println("Rata-rata           : " +student1.getaverage());
        System.out.println("Nilai Maximum       : " +student1.getMaximum());
        
         System.out.println("");
        
        studentRecord student2 = new studentRecord("Tasya" , "Padang");
        student2.setAge(19);
        student2.setmathGrade(80);
        student2.setenglishGrade(90);
        student2.setscienceGrade(70);
        
        System.out.println("Nama                : " +student2.getName());
        System.out.println("Alamat              : " +student2.getAddress());
        System.out.println("Umur                : " +student2.getAge());
        System.out.println("Matematika          : " +student2.getmathGrade());
        System.out.println("B.inggris           : " +student2.getenglishGrade());
        System.out.println("Pengetahuan         : " +student2.getscienceGrade());
        System.out.println("Rata-rata           : " +student2.getaverage());
        System.out.println("Nilai Maximum       : " +student2.getMaximum());
    }

        
       
        
    }
    
}
