/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Segitiga {
    int alas;
    int tinggi;
    double luas;
    
    void input(){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Alas : ");
        alas = input.nextInt();
        System.out.print("tinggi : ");
        tinggi = input.nextInt();               
    }
    
    int a(){
        return alas;
    }
    int t(){
        return tinggi;
    }
    
    double hitung(){
        luas = (alas*tinggi)/2;
        return luas;
    }
    
    
}
