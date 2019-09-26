/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan5.kambingglobal;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk Menggunakan Variabel Global
 * 
 */
  

public class IF110118042Latihan5KambingGlobal {

     //variabel jumlahkambing menjadi variabel instance

    int jumlahkambing = 88;
    
    //Method untuk Menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahkambing);
    }
    
    public void tambahKambing(){
        jumlahkambing = jumlahkambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahkambing);
    }    

    
    public static void main(String[] args) {
        IF110118042Latihan5KambingGlobal kambingSusu = new IF110118042Latihan5KambingGlobal();
        
        //Menampilkanjumlah kambing yang ada saat program pertama x dijalankan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
