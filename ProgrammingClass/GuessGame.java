/*
Wajp to design guess game within two/the range.
*/


import java.util.Scanner;
import java.util.Random;

	class GuessGame{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Guess number between 0 to 9.");
			int un=sc.nextInt();
			
			Random rd = new Random();
			int rn = rd.nextInt(10);
			
			if(rn==un)
				System.out.println("You won the game.");
			else 
				System.out.println("You loss the game." + rn);
		}
	}
