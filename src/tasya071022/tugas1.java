/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasya071022;

import java.io.*;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
/**
 *
 * @author User
 */
public class tugas1 {
    public static void main( String[] args ) throws IOException 
    { 
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        DecimalFormat formatdata = new DecimalFormat("#.###");
        int gaji, jumlah_anak, lama_kerja, tunjangan_senior;
        double pajak, total_gaji = 0;
        int pil,jam_kerja, jam_lembur,gaji_lembur, gaji_pokok, gaji_perjam,tunjangan_anak;
        System.out.println("Pogram hitung total gaji pegawai");
        System.out.println("no\tgol\t\tgaji pokok\t\tgaji perjam");  
        System.out.println("1\t1A\t\t500000\t\t\t2000");
        System.out.println("2\t2A\t\t600000\t\t\t3000");
        System.out.println("3\t1B\t\t700000\t\t\t4000");
        System.out.println("4\t2B\t\t800000\t\t\t5000");
        System.out.println("5\t3B\t\t900000\t\t\t6000");
       
        try{
            System.out.print("Pilihan Golongan :");
            pil = Integer.parseInt(dataIn.readLine());
            switch(pil){
                case 1 :{
                    System.out.println("---Anda Memilih Golongan 1A--- ");
                    System.out.print("Jam Kerja = ");
                    jam_kerja = Integer.parseInt(dataIn.readLine());
                    System.out.print("Jumlah Anak = ");
                    jumlah_anak = Integer.parseInt(dataIn.readLine());
                    
                    if(jam_kerja > 160){
                        jam_lembur = jam_kerja - 160;
                        gaji_lembur = jam_lembur * 3500;
                        System.out.println("Anda mendapatkan gaji lembur sebesar =Rp."+ gaji_lembur);   
                    }
                    else{
                        gaji_lembur = 0;   
                    }
                    
                    
                    if(jumlah_anak <= 2){
                        tunjangan_anak = jumlah_anak * 25000;
                        System.out.println("Anda Mendapatkan Tunjangan Anak Sebesar =Rp."+ tunjangan_anak);
                    }
                    else{
                        tunjangan_anak = 0;
                    }
                    
                    gaji_pokok = 500000;
                    gaji_perjam = 160 * 2000;
                    gaji = gaji_pokok + gaji_perjam + gaji_lembur + tunjangan_anak;
                    pajak = gaji * 0.1;
                    total_gaji = gaji - pajak;
                    
                    
                }break;
                
                case 2 :{
                    System.out.println("---Anda Memilih Golongan 2A--- ");
                    System.out.print("Jam Kerja = ");
                    jam_kerja = Integer.parseInt(dataIn.readLine());
                    System.out.print("Jumlah Anak = ");
                    jumlah_anak = Integer.parseInt(dataIn.readLine());
                    System.out.print("Lama Bekerja = ");
                    lama_kerja = Integer.parseInt(dataIn.readLine());
                    
                    if(jam_kerja > 160){
                        jam_lembur = jam_kerja - 160;
                        gaji_lembur = jam_lembur * 3500;
                        System.out.println("Anda mendapatkan gaji lembur sebesar = Rp."+ gaji_lembur);   
                    }
                    else{
                        gaji_lembur = 0;   
                    }
                    
                    
                    if(jumlah_anak <= 2){
                        tunjangan_anak = jumlah_anak * 25000;
                        System.out.println("Anda Mendapatkan Tunjangan Anak Sebesar = Rp."+ tunjangan_anak);
                    }
                    else{
                        tunjangan_anak = 0;
                    }
                    
                   
                    if(lama_kerja > 5){
                        tunjangan_senior = 100000;
                        System.out.println("Anda Mendapatkan Tunjangan Senior Sebesar = Rp."+ tunjangan_senior);
                    }
                    else{
                        tunjangan_senior = 0;
                    }
                    
                    gaji_pokok = 600000;
                    gaji_perjam = 160 * 3000;
                    gaji = gaji_pokok + gaji_perjam + gaji_lembur + tunjangan_anak + tunjangan_senior;
                    pajak = gaji * 0.1;
                    total_gaji = gaji - pajak;
                    
                    
                }break;
                
                case 3 :{
                    System.out.println("---Anda Memilih Golongan 1B--- ");
                    System.out.print("Jam Kerja = ");
                    jam_kerja = Integer.parseInt(dataIn.readLine());
                    System.out.print("Jumlah Anak = ");
                    jumlah_anak = Integer.parseInt(dataIn.readLine());
                    
                    if(jam_kerja > 160){
                        jam_lembur = jam_kerja - 160;
                        gaji_lembur = jam_lembur * 3500;
                        System.out.println("Anda mendapatkan gaji lembur sebesar = Rp."+ gaji_lembur);   
                    }
                    else{
                        gaji_lembur = 0;   
                    }
                    
                    
                    if(jumlah_anak <= 2){
                        tunjangan_anak = jumlah_anak * 25000;
                        System.out.println("Anda Mendapatkan Tunjangan Anak Sebesar = Rp."+ tunjangan_anak);
                    }
                    else{
                        tunjangan_anak = 0;
                    }
                    
                    gaji_pokok = 700000;
                    gaji_perjam = 160 * 4000;
                    gaji = gaji_pokok + gaji_perjam + gaji_lembur + tunjangan_anak;
                    pajak = gaji * 0.1;
                    total_gaji = gaji - pajak;
                    
                    
                }break;
                
                 case 4 :{
                    System.out.println("---Anda Memilih Golongan 2B--- ");
                    System.out.print("Jam Kerja = ");
                    jam_kerja = Integer.parseInt(dataIn.readLine());
                    System.out.print("Jumlah Anak = ");
                    jumlah_anak = Integer.parseInt(dataIn.readLine());
                    System.out.print("Lama Bekerja = ");
                    lama_kerja = Integer.parseInt(dataIn.readLine());
                    
                    if(jam_kerja > 160){
                        jam_lembur = jam_kerja - 160;
                        gaji_lembur = jam_lembur * 3500;
                        System.out.println("Anda mendapatkan gaji lembur sebesar = Rp."+ gaji_lembur);   
                    }
                    else{
                        gaji_lembur = 0;   
                    }
                    
                    
                    if(jumlah_anak <= 2){
                        tunjangan_anak = jumlah_anak * 25000;
                        System.out.println("Anda Mendapatkan Tunjangan Anak Sebesar = Rp."+ tunjangan_anak);
                    }
                    else{
                        tunjangan_anak = 0;
                    }
                    
                   
                    if(lama_kerja > 5){
                        tunjangan_senior = 100000;
                        System.out.println("Anda Mendapatkan Tunjangan Senior Sebesar = Rp."+ tunjangan_senior);
                    }
                    else{
                        tunjangan_senior = 0;
                    }
                    
                    gaji_pokok = 800000;
                    gaji_perjam = 160 * 5000;
                    gaji = gaji_pokok + gaji_perjam + gaji_lembur + tunjangan_anak + tunjangan_senior;
                    pajak = gaji * 0.1;
                    total_gaji = gaji - pajak;
                    
                    
                }break;
                
                case 5 :{
                    System.out.println("---Anda Memilih Golongan 3B--- ");
                    System.out.print("Jam Kerja = ");
                    jam_kerja = Integer.parseInt(dataIn.readLine());
                    System.out.print("Jumlah Anak = ");
                    jumlah_anak = Integer.parseInt(dataIn.readLine());
                    
                    if(jam_kerja > 160){
                        jam_lembur = jam_kerja - 160;
                        gaji_lembur = jam_lembur * 3500;
                        System.out.println("Anda mendapatkan gaji lembur sebesar = Rp."+ gaji_lembur);   
                    }
                    else{
                        gaji_lembur = 0;   
                    }
                    
                    
                    if(jumlah_anak <= 2){
                        tunjangan_anak = jumlah_anak * 25000;
                        System.out.println("Anda Mendapatkan Tunjangan Anak Sebesar = Rp."+ tunjangan_anak);
                    }
                    else{
                        tunjangan_anak = 0;
                    }
                    
                    gaji_pokok = 900000;
                    gaji_perjam = 160 * 6000;
                    gaji = gaji_pokok + gaji_perjam + gaji_lembur + tunjangan_anak;
                    pajak = gaji * 0.1;
                    total_gaji = gaji - pajak;
                    
                    
                }break;
                
                
            }
                
            
          
        
        
        
        
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        } 
        
            System.out.println("~~~Total Gaji Pegawai = Rp." + total_gaji); 
        
}    
        
            
        
        
        
        
                
      
 }
    

