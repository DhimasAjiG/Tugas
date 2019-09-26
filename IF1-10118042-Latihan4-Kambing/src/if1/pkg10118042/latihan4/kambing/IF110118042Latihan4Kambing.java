/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan4.kambing;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk menbambahkan kamus lokal
 * 
 */
public class IF110118042Latihan4Kambing {

    public void tambahKambing() {
        //Deklarasi Variabel Lokal
        int JumlahKambing = 0;
        
        JumlahKambing = JumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah: "+JumlahKambing); 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IF110118042Latihan4Kambing kambingJantan = new IF110118042Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
