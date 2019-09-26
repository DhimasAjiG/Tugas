/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan3.input;
import java.util.Scanner;


/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk Memasukkan input
 */
public class IF110118042Latihan3Input {

    
    public static void main(String[] args) {
        System.out.print("Masukkan Nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String Nama = scanner.next();
        System.out.println("Nama Anda Adalah : "+Nama);
        
    }
    
}
