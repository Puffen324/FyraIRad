package com.andresoderlund.main;

import com.andresoderlund.tools.UserInput;
import com.andresoderlund.tools.PrintToConsole;
import com.andresoderlund.tools.GameLogic;
import com.andresoderlund.tools.Marker;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hejhej");
		System.out.println("Hejhej");
		
		System.out.println("Testar ändra lite!");
		
		boolean winner = false;
		int turn = 0;
		int inputFromUser = 0;
		char[][] MyArray = { { ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ' } };

		while (!winner) {
			turn = 0; // Spelare X's tur
			PrintToConsole.PrintBoard(MyArray); // Skriver ut spelbrädan
			
			inputFromUser = UserInput.PlaceMarker(turn); // Spelare X får välja vart han vill placera sin bricka
			MyArray = Marker.PlaceMarker(MyArray, inputFromUser, turn); // Placerar brickan enligt valet ovan
			PrintToConsole.PrintBoard(MyArray); // Skriver ut spelbrädan med uppdaterade brickor
			winner = GameLogic.CheckWinner(MyArray); // Kollar kritererna för vinst, ropar upp vinnare och avslutar programmet.
			if(winner)
				break;
			
			turn = 1; // Spelare O's tur
			inputFromUser = UserInput.PlaceMarker(turn); // Spelare O får välja vart han vill placera sin bricka
			MyArray = Marker.PlaceMarker(MyArray, inputFromUser, turn); // Placerar brickan enligt valet ovan
			PrintToConsole.PrintBoard(MyArray); // Skriver ut spelbrädan med uppdaterade brickor
			winner = GameLogic.CheckWinner(MyArray);// Kollar kritererna för vinst, ropar upp vinnare och avslutar programmet.

		}
	}
}
