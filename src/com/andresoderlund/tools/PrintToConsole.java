package com.andresoderlund.tools;

public class PrintToConsole {
	public static void PrintBoard(char MyArray[][]) {
		System.out.println("= - = - = - = - = - = - = - =");
		System.out.println("| " + MyArray[0][5] +  " | " + MyArray[1][5] + " | " + MyArray[2][5] +" | "+  MyArray[3][5] + " | " + MyArray[4][5]+  " | " + MyArray[5][5] + " | " + MyArray[6][5] +" | " );
		System.out.println("| " + MyArray[0][4] +  " | " + MyArray[1][4] + " | " + MyArray[2][4] +" | "+  MyArray[3][4] + " | " + MyArray[4][4]+  " | " + MyArray[5][4] + " | " + MyArray[6][4] +" | " );
		System.out.println("| " + MyArray[0][3] +  " | " + MyArray[1][3] + " | " + MyArray[2][3] +" | "+  MyArray[3][3] + " | " + MyArray[4][3]+  " | " + MyArray[5][3] + " | " + MyArray[6][3] +" | " );
		System.out.println("| " + MyArray[0][2] +  " | " + MyArray[1][2] + " | " + MyArray[2][2] +" | "+  MyArray[3][2] + " | " + MyArray[4][2]+  " | " + MyArray[5][2] + " | " + MyArray[6][2] +" | " );
		System.out.println("| " + MyArray[0][1] +  " | " + MyArray[1][1] + " | " + MyArray[2][1] +" | "+  MyArray[3][1] + " | " + MyArray[4][1]+  " | " + MyArray[5][1] + " | " + MyArray[6][1] +" | " );
		System.out.println("| " + MyArray[0][0] +  " | " + MyArray[1][0] + " | " + MyArray[2][0] +" | "+  MyArray[3][0] + " | " + MyArray[4][0]+  " | " + MyArray[5][0] + " | " + MyArray[6][0] +" | " );
		System.out.println("= 1 = 2 = 3 = 4 = 5 = 6 = 7 =");
	}
}
