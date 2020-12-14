package TugasCashier;

import java.util.Scanner;

public class App {

public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Food food = new Food();
		int c;
		
		do {
			System.out.println("Ayam Bakar Mas Mono");
			System.out.println();
			System.out.println("Menu");
			System.out.println("1. Pilih paket");
			System.out.println("2. Pilih alacarte");
			System.out.println("3. Recipt");
			System.out.println("0. Exit");
			
			System.out.println("Pilih menu: ");
			c = s.nextInt();
			System.out.println();
			
			switch(c) {
			case 1:
				food.getPaket();
				break;
			case 2:
				food.getSingle();
				break;
			case 3:
				food.getRecipt();
				break;
			
			}
			
		} while (c != 0);
	}
}
