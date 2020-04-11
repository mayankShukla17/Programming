/*Wajp to print the pattern
	n=5 A B C D E
		A B C D E
		A B C D E
		A B C D E
		A B C D E
*/

import java.util.Scanner;
	class MainPattern5{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n = sc.nextInt();
			for (int i=1;i<=n;i++) {
				for (int j=1;j<=n;j++) {	
					System.out.print((char)(j+64)+" ");
				}
			System.out.println();
			}
		}
	}
