/* Author : Ariana Rahmawati
 * Date   : September 27th 2022
 * Lesson : Object, Class, Encapsulation
 * Course : Object Oriented Programming (OOP)
 * Program ini merupakan hasil revisi dan pengembangan dari modul yang diberikan oleh dosen
 */

package Kasus2;

import java.util.Scanner;

public class KantinMain {
   
    public static void main(String[] args) {
        Kantin menu = new Kantin();
        Scanner input = new Scanner(System.in);
        String decision = "Y";
	menu.tambahMenuMakanan("Donat          ", 5_000, 10);
        Kantin.nextId();
	menu.tambahMenuMakanan("Nasi+Ayam Popcorn", 12_000, 20);
		Kantin.nextId();
	menu.tambahMenuMakanan("Nasi Campur", 10_000, 20);
		Kantin.nextId();
	menu.tambahMenuMakanan("Nasi+Ayam Geprek", 12_000, 20);
		Kantin.nextId();
	menu.tambahMenuMakanan("Nasi Goreng", 12_000, 20);
		Kantin.nextId();
	menu.tambahMenuMakanan("Pisang Aroma", 1_000, 30);
		Kantin.nextId();
	menu.tambahMenuMakanan("Susu Ultramilk", 5_000, 20);
		Kantin.nextId();
	menu.tambahMenuMakanan("Air Mineral", 3_000, 40);
		Kantin.nextId();
	menu.tambahMenuMakanan("Teh Kotak", 5_000, 20);
		Kantin.nextId();
	menu.tambahMenuMakanan("Kopi", 3_000, 20);
	menu.pesan();
        
        while(decision.equals("Y") || decision.equals("y")){
            System.out.println("Apakah ingin memesan kembali ? (Y/N)  ");
            decision = input.next();
            if (decision.equals("Y") || decision.equals("y")){
                menu.pesan();
            }
            else{
                System.out.println("Terima Kasih");
                break;
            } 
        }

    }
    
}