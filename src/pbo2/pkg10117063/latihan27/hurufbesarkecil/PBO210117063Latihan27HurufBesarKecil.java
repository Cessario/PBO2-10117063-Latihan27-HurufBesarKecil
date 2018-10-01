/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author DEADPOOL
 */
public class PBO210117063Latihan27HurufBesarKecil {

    /*Nama : Cessario Sheva Lakita Purwa Adidjaya
        NIM  : 10117063
        Kelas : IF-2
        Deskripsi Program : Menampilkan huruf UpperCase dan Lower Case
     */
    public static void main(String[] args) {
        String kalimat ;
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat\t : ");
        kalimat = scanner.nextLine();
        
        System.out.println("\n===Hasil Formatting===");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Hurud Kecil : " + kalimat.toLowerCase());
        
    }
    
}
