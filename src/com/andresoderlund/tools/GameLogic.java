package com.andresoderlund.tools;

public class GameLogic {
	public static boolean CheckWinner(char[][] MyArray) {
		boolean winner = false;
		if (CheckVerticalX(MyArray)) {
			return true;
		}
		if (CheckVerticalO(MyArray)) {
			return true;
		}
		if (CheckHorizontalX(MyArray)) {
			return true;
		}
		if (CheckHorizontalO(MyArray)) {
			return true;
		}
		if (CheckDiagonalX(MyArray)) {
			return true;
		}
		if(CheckDiagonalO(MyArray)) {
			return true;
		}
		return winner;
	}

	public static boolean CheckVerticalX(char[][] MyArray) {
		boolean win = false;

		for (int i = 0; i < MyArray.length; i++) {
			int counter = 0;
			for (int j = 0; j < MyArray[0].length; j++) {
				if (MyArray[i][j] == 'X') {
					counter += 1;
				} else if (counter == 4) {
					win = true;
					System.out.println("Spelare X har vunnit spelet vertikalt!");
					counter = 0;
				} else
					counter = 0;
			}

		}
		return win;
	}

	public static boolean CheckVerticalO(char[][] MyArray) {

		boolean win = false;
		int counter = 0;
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 7; j++) {
				if (MyArray[i][j] == 'O') {
					counter += 1;
				} else if (counter == 4) {
					win = true;
					System.out.println("Spelare O har vunnit spelet vertikalt!");
					counter = 0;
				} else
					counter = 0;
			}

		}
		return win;
	}

	public static boolean CheckHorizontalX(char[][] MyArray) {
		boolean win = false;
		int counter = 0;
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 7; j++) {
				if (MyArray[j][i] == 'X') {
					counter += 1;
				} else if (counter == 4) {
					win = true;
					System.out.println("Spelare X har vunnit spelet horisontellt!");
					counter = 0;
				} else
					counter = 0;
			}

		}
		return win;
	}

	public static boolean CheckHorizontalO(char[][] MyArray) {
		boolean win = false;
		int counter = 0;
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 7; j++) {
				if (MyArray[j][i] == 'O') {
					counter += 1;
				} else if (counter == 4) {
					win = true;
					System.out.println("Spelare O har vunnit spelet horisontellt!");
					counter = 0;
				}

				else
					counter = 0;
			}

		}
		return win;
	}

	public static boolean CheckDiagonalX(char[][] MyArray) {
		boolean win = false;
		int counter = 0;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				for (int u = 0; u < 4; u++) {
					if (i < 4 && j < 4) {
						if (MyArray[i + u][j + u] == 'X') {
							counter++;
						} 
						else if (counter == 4) {
							win = true;
							System.out.println("Spelare X har vunnit spelet diagonalt!");
							counter = 0;
						}
						else {
							counter = 0;
						}
					}
				}
				for (int y = 0; y < 4; y++) {
					if (i < 4 && j >= 3) {
						if (MyArray[i + y][j - y] == 'X') {
							counter++;
						} 
						else if (counter == 4) {
							win = true;
							System.out.println("Spelare X har vunnit spelet diagonalt!");
							counter = 0;
						}
						else {
							counter = 0;
						}
					}
				}
			}
		}
		return win;
	}
	public static boolean CheckDiagonalO(char[][] MyArray) {
		boolean win = false;
		int counter = 0;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				for (int u = 0; u < 4; u++) {
					if (i < 4 && j < 4) {
						if (MyArray[i + u][j + u] == 'O') {
							counter++;
						} 
						else if (counter == 4) {
							win = true;
							System.out.println("Spelare O har vunnit spelet diagonalt!");
							counter = 0;
						}
						else {
							counter = 0;
						}
					}
				}	
				for (int y = 0; y < 4; y++) {
					if (i < 4 && j >= 3) {
						if (MyArray[i + y][j - y] == 'X') {
							counter++;
						} 
						else if (counter == 4) {
							win = true;
							System.out.println("Spelare O har vunnit spelet diagonalt!");
							counter = 0;
						}
						else {
							counter = 0;
						}
					}
				}
			}
		}
		return win;
	}
}
