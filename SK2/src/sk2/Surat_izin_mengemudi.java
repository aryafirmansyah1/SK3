/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk2;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Surat_izin_mengemudi {
    String nama;
    String alamat;
    String tempattgllahir;
    int tinggi;
    String pekerjaan;
    int noSim;
    String masaberlaku;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Alamat : ");
        alamat = input.nextLine();
        System.out.print("Tempat,Tgl Lahir : ");
        tempattgllahir = input.nextLine();
        System.out.print("Tinggi :");
        tinggi = input.nextInt();
        System.out.print("pekerjaan : ");
        pekerjaan = input.next();
        System.out.print("No.SIM : ");
        noSim = input.nextInt();
        System.out.print("Masa Berlaku : ");
        masaberlaku = input.next();
    }
    
    String a(){
       return nama; 
    }
    String b(){
        return alamat;
    }
    String c(){
        return tempattgllahir;
    }
    int d(){
        return tinggi;
    }
    String e(){
        return pekerjaan;
    }
    int f(){
        return noSim;
    }
    String g(){
        return masaberlaku;
    }
}
