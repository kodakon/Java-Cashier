package TugasCashier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Food implements FoodInterface{

	private int harga, choice, choice2;
	double totalHarga;
	private String makanan, minuman;
	
	
	Scanner input = new Scanner(System.in);
	ArrayList<Food> paket = new ArrayList<>();
	
	public Food(int harga, String makanan, String minuman) {
		super();
		this.harga = harga;
		this.makanan = makanan;
		this.minuman = minuman;
	}
	

	public Food() {
		// TODO Auto-generated constructor stub
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public String getMakanan() {
		return makanan;
	}

	public void setMakanan(String makanan) {
		this.makanan = makanan;
	}

	public String getMinuman() {
		return minuman;
	}

	public void setMinuman(String minuman) {
		this.minuman = minuman;
	}
	
	@Override
	public void getPaket() {
		// TODO Auto-generated method stub
		
		do {
			System.out.println("Daftar Paket");
			System.out.println("1. Paket A (Ayam Goreng + Coca Cola), Harga 20000");
			System.out.println("2. Paket B (Ayam Bakar + Fanta), Harga 30000");
			System.out.println("0. Exit");
			System.out.println("Select Paket:  ");
			choice = input.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1: 
				paket.add(new Food(20000, "Ayam Goreng", "Coca Cola"));
				harga = 20000;
				totalHarga += harga;
				break;
			case 2:
				paket.add(new Food(30000, "Ayam Bakar", "Fanta"));
				harga = 30000;
				totalHarga += harga;
				break;
				
			}
		} while (choice != 0);
		
		System.out.println();
		
	}

	@Override
	public void getSingle() {
		// TODO Auto-generated method stub
		do {
			System.out.println("Daftar Makanan");
			System.out.println("1. Ayam Goreng, Harga 15000");
			System.out.println("2. Ayam Bakar, Harga 17000");
			System.out.println();
			System.out.println("Daftar Minuman");
			System.out.println("3. Fanta, Harga 8000");
			System.out.println("4. Coca Cola, Harga 7000");
			System.out.println();
			System.out.println("0. Exit");
			System.out.println("Select food / beverages");
			choice2 = input.nextInt();
			System.out.println();
			
			switch(choice2) {
			case 1:
				paket.add(new Food(15000, "Ayam Goreng", null));
				harga = 15000;
				totalHarga += harga;
				break;
			case 2:
				paket.add(new Food(17000, "Ayam Bakar", null));
				harga = 17000;
				totalHarga += harga;
				break;
			case 3:
				paket.add(new Food(8000, null, "Coca Cola"));
				harga = 8000;
				totalHarga += harga;
				break;
			case 4:
				paket.add(new Food(7000, null, "Fanta"));
				harga = 7000;
				totalHarga += harga;
				break;
			}
		} while (choice != 0);
		
		System.out.println();
	}

	@Override
	public void getRecipt() {
		// TODO Auto-generated method stub
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a");
		String formatted = dateTime.format(formatter);
		
		System.out.println("Tanggal & waktu saat ini: " + formatted);
		System.out.println("Print Recipt");
		System.out.println("Pesanan: ");
		
		if(totalHarga != 0) {
			for (int i = 0; i < paket.size(); i++) {
				System.out.print((i+1) + ". ");
				System.out.println("Makanan: " + paket.get(i).getMakanan());
				System.out.println("Minuman: " + paket.get(i).getMinuman());
				System.out.println("Harga: " + paket.get(i).getHarga());
				System.out.println();
			}
			System.out.println("Total Harga sebelum ppn: " + (totalHarga));
			totalHarga = totalHarga * 1.1;
			System.out.println("Total Harga: " + (totalHarga));
			System.out.println();
			System.out.println();
		} else {
			System.out.println("No data");
		}
		
	}
}
