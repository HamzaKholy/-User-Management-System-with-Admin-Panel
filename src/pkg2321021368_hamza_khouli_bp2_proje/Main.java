/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2321021368_hamza_khouli_bp2_proje;
import java.io.FileInputStream;
import java.io.IOException;



/**
 *
 * @author gonul
 */
public class Main {
      public static void main(String[] args) {
 byte okunacak[]=new byte[100];
        int deger;
        System.out.println("Bir metin girin:");
        try {
            deger=System.in.read(okunacak);
            //System.out.println("Okunan karakter:" +deger);
        } catch (IOException ex) {
            System.out.println("Okunmadi");
        }
        
        String metin=new String(okunacak);
        System.out.println(metin);       
      }
}
