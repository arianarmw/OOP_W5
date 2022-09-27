/* Author : Ariana Rahmawati
 * Date   : September 27th 2022
 * Lesson : Object, Class, Encapsulation
 * Course : Object Oriented Programming (OOP)
 * Program ini merupakan hasil revisi dan pengembangan dari modul yang diberikan oleh dosen
 */

package Kasus1;

public class RestaurantMain {
	public static void main (String[] args) {
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		
		menu.tampilMenuMakanan();
	}
}
