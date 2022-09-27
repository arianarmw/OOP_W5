/* Author : Ariana Rahmawati
 * Date   : September 27th 2022
 * Lesson : Object, Class, Encapsulation
 * Course : Object Oriented Programming (OOP)
 * Program ini merupakan hasil revisi dan pengembangan dari modul yang diberikan oleh dosen
 */


package Kasus2;

public class Menus {
	private String[] nama_makanan; //variabel array nama_makanan dengan tipe data string
	private double[] harga_makanan; //variabel array harga_makanan dengan tipe data double
	private int [] stok; //variabel array stok dengan tipe data integer
	
	Menus() {
		this.nama_makanan = new String[10];
		this.harga_makanan = new double[10];
		this.stok = new int [10];
	}

	public String getNama_makanan(int id) {
		return nama_makanan[id];
	}

	public void setNama_makanan(String nama_makanan, int id) {
		this.nama_makanan[id] = nama_makanan;
	}

	public double getHarga_makanan(int id) {
		return harga_makanan[id];
	}

	public void setHarga_makanan(double harga_makanan, int id)  {
		this.harga_makanan[id] = harga_makanan;
	}

	public int getStok(int id) {
		return stok[id];
	}

	public void setStok(int stok, int id) {
		this.stok[id] = stok;
	}	
	
	public void removeStok(int id, int jumlah) {
		this.stok[id] -= jumlah;
	}
        

}

