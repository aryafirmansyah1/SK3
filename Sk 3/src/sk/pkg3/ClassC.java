/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.pkg3;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class ClassC {
    static int jumlah;
    static int harga;
    static void kamera(){
        Scanner input = new Scanner (System.in);
        System.out.println("masukan nama :");
        String nama = input.nextLine();
        System.out.println("masukan merk kamera :");
        String kamera = input.nextLine();
        System.out.println("Jumlah :");
        jumlah = input.nextInt();
    }
    static void harga(){
        harga = jumlah*50000;
        System.out.println("tottal Harga : "+harga);
    } 
}
