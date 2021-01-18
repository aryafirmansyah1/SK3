/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk2;

/**
 *
 * @author ASUS
 */
public class SK2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Surat_izin_mengemudi sim = new Surat_izin_mengemudi();
        System.out.println("**Silahkan Masukan Data Dibawah Ini**");
        sim.input();
        System.out.println("==========================================");
        System.out.println("SIM telah Berhasil Dibuat");
        System.out.println("==========================================");
        System.out.println("Nama : "+sim.a());
        System.out.println("Alamat : "+sim.b());
        System.out.println("Tempat,Tgl Lahir : "+sim.c());
        System.out.println("Tinggi :"+sim.d());
        System.out.println("pekerjaan : "+sim.e());
        System.out.println("No.SIM : "+sim.f());
        System.out.println("Masa Berlaku : "+sim.g());
    }
    
}
