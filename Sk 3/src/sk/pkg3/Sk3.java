/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.pkg3;

import static sk.pkg3.ClassC.harga;
import static sk.pkg3.ClassC.kamera;

/**
 *
 * @author ASUS
 */
public class Sk3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("progam beasiswa");
       ClassA a = new ClassA();
       a.nilai();
       a.grade();
       
       System.out.println("\n======================================\n");
        
       ClassB b = new ClassB();
       b.inputbola();
       System.out.print(b.bola());
       
       System.out.println("\n======================================\n");
       
       kamera();
       harga();
    }
    
}
