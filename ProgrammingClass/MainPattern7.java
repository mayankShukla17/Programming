/*Wajp to print the pattern
	n=5 1 2 3 4 5 
		6 7 8 9 1 
		2 3 4 5 6 
		7 8 9 1 2 
		3 4 5 6 7
*/

import java.util.Scanner;
	class MainPattern7{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n = sc.nextInt();
			int k=1;
			for (int i=1;i<=n;i++) {
				for (int j=1;j<=n;j++) {
					System.out.print(k+" ");
					k++;
					if(k==10)
						k=1;
				}
			System.out.println();
			}
		}
	}
