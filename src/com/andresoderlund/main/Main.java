package com.andresoderlund.main;

import com.andresoderlund.tools.UserInput;
import com.andresoderlund.tools.PrintToConsole;
import com.andresoderlund.tools.GameLogic;
import com.andresoderlund.tools.Marker;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hejhej");
		System.out.println("Hejhej");
		
		System.out.println("Testar �ndra lite!");
		
		boolean winner = false;
		int turn = 0;
		int inputFromUser = 0;
		char[][] MyArray = { { ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ' } };

		while (!winner) {
			turn = 0; // Spelare X's tur
			PrintToConsole.PrintBoard(MyArray); // Skriver ut spelbr�dan
			
			inputFromUser = UserInput.PlaceMarker(turn); // Spelare X f�r v�lja vart han vill placera sin bricka
			MyArray = Marker.PlaceMarker(MyArray, inputFromUser, turn); // Placerar brickan enligt valet ovan
			PrintToConsole.PrintBoard(MyArray); // Skriver ut spelbr�dan med uppdaterade brickor
			winner = GameLogic.CheckWinner(MyArray); // Kollar kritererna f�r vinst, ropar upp vinnare och avslutar programmet.
			if(winner)
				break;
			
			turn = 1; // Spelare O's tur
			inputFromUser = UserInput.PlaceMarker(turn); // Spelare O f�r v�lja vart han vill placera sin bricka
			MyArray = Marker.PlaceMarker(MyArray, inputFromUser, turn); // Placerar brickan enligt valet ovan
			PrintToConsole.PrintBoard(MyArray); // Skriver ut spelbr�dan med uppdaterade brickor
			winner = GameLogic.CheckWinner(MyArray);// Kollar kritererna f�r vinst, ropar upp vinnare och avslutar programmet.

		}
	}
}
