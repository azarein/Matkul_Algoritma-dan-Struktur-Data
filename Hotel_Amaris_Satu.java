/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.amaris.satu;

/**
 *
 *@author Yamin
 */
public class Hotel_Amaris_Satu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String[][] ruang = {
          {"1", "2", "3", "4", "X"}, 
          {"1", "2", "3", "4", "5"},
          {"1", "2", "3", "4", "5"},
          {"1", "2", "3", "X", "5"},
      };
      
      int kamarkosong = 0;
      for (int j = 0; j < ruang.length; j++){
       for (int i = 0; i < ruang[j].length; i++) {
          if ("X".equals(ruang[j][i])) {
           System.out.println(" Tamu Berada Dilantai " + (j+1) + " Kamar " + (i+1) );
       }else {
                   kamarkosong += 1;
                   }                 
      }
      } System.out.println("");
      System.out.println("Kamar Yang Tersedia Ada " + kamarkosong);
    } 
}
