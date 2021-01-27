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
public class ClassA {
     int TPA;
     int BahasaInggris;
     
    void  nilai(){
        //scanner
        Scanner masukan = new Scanner (System. in) ;
        //input
    System.out.print("Masukkan nilai TPA :");
    TPA = masukan.nextInt ();
    System.out.print("Masukkan nilai Bahasa Inggris : ");
    BahasaInggris = masukan.nextInt();
    }
    void grade(){
       
    if ((TPA > 85) && (BahasaInggris > 50))
        System.out.println("Siswa dapat Beasiswa");
    else
        System.out.println("Siswa tidak dapat Beasiswa");
    }
    }

