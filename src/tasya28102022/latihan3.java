/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasya28102022;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class latihan3 {
    public static void main (String[]args){
    int [] Tampung = new int [11] ;
    int ukuranLarik = 10;
    int i = 1 ;
    while (i<=10) {
        
        Tampung[i]= Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Ke-"+i));
        //Tampung [i]  = Integer.valueOf(x).intValue();
        i++;
    }
    int maximum = Tampung [0];
    for (int max = 0; max < ukuranLarik; max++){
         if(maximum < Tampung[max]){
            maximum = Tampung[max];
        }
    }
    String St12 =”Angka Terbesar Anda Adalah:”+ maximum;
    JOptionPane.showMessageDialog(null,St12);

    }

    
}
