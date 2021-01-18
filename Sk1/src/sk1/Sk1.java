/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk1;

/**
 *
 * @author ASUS
 */
public class Sk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Segitiga tiga = new Segitiga();
        System.out.println("rumus : (alas*tinggi)/2");
        System.out.println("====================================");
        System.out.println("Diketahui ");
        tiga.input();
        
        System.out.println("rumus : ("+tiga.a()+"*"+tiga.t()+")/2");
        
        System.out.println("Hasil : "+tiga.hitung());
        System.out.println("=====================================");
        
    }
    
}
