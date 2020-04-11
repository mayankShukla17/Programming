/*Wajp to print the pattern
	n=5	1 1 1 1 1	n=3 1 1 1
		0 0 0 0 0 		0 0 0
		1 1 1 1 1		1 1 1
		0 0 0 0 0 		
		1 1 1 1 1
*/

import java.util.Scanner;
	class MainPattern3{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n = sc.nextInt();
			for (int i=1;i<=n;i++) {
				for (int j=1;j<=n;j++) {
				System.out.print(i%2+" ");
				}
			System.out.println();
			}
		}
	}
