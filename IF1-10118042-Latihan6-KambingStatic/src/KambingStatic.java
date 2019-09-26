/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk menampilkan Jumlah kambing menggunakan 2 buah class
 * 
 */
public class KambingStatic {
    //Nama_Kambing Sebagai konstanta
        public static final String Nama_Kambing = "Midun";
        
        public static void main(String[] args){
           Mamalia.jumlahKambing = 485000;
           System.out.println(Nama_Kambing + " Memliliki Kambing Sebanyak " + Mamalia.jumlahKambing);
        }
}
