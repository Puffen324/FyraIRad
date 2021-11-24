package com.andresoderlund.tools;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
	static Scanner sc = new Scanner(System.in);

	public static int PlaceMarker(int turn) {
		boolean correctInput = false;
		
		int rad = 0;
		
		String player = "Spelare X";
		if(turn == 1) {
			player = "Spelare O";
		}
		System.out.println(player + " välj var du vill placera din bricka!");
		do {
			try {
				System.out.println("Ange en siffra mellan 1 - 7");
				rad = sc.nextInt();
				if (rad > 7 || rad < 1) {
					System.out.println("Felaktig inmatning, testa igen!");
					sc.nextLine();
				} else
					correctInput = true;
			} catch (InputMismatchException ex) {
				System.out.println("Felaktig inmatning, testa igen!");
				sc.nextLine();
			}
		} while (!correctInput);
		
		return rad-1;
	}
}
