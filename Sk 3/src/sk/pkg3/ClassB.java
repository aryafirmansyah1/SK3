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
public class ClassB {
    int jarijari;
    double permukaan;
    
    void inputbola(){
         Scanner input = new Scanner(System.in);
        System.out.println("Program untuk perhitungan bola ");
        System.out.print("Masukkan Jari - jarinya : ");
        jarijari=input.nextInt();
    }
    double bola(){
        System.out.print ("Luas permukaannya = "+((3.14*jarijari*jarijari)*4));
        return permukaan;
    }
    
    
}

