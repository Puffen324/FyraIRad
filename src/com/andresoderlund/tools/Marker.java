package com.andresoderlund.tools;

public class Marker {
	public static char[][] PlaceMarker(char[][] MyArray, int inputFromUser, int turn){
		char playerMarker = 'O';
		if(turn == 0) {
			playerMarker = 'X';
		}
		for(int i = inputFromUser; i <= inputFromUser; i++) {
			for(int j = 0; j < 7; j++) {
				if(MyArray[i][j] == ' ') {
					MyArray[i][j] = playerMarker;
					break;
				}
			}
		}
		return MyArray;
	}
}
