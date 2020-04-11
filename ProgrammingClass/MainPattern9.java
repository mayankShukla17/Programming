/*Wajp to print the pattern
	n=5 5 5 5 5 5 
		4 4 4 4 4 
		3 3 3 3 3 
		2 2 2 2 2
		1 1 1 1 1
*/

import java.util.Scanner;
	class MainPattern9{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n = sc.nextInt();
			for (int i=n;i>=1;i--) {
				for (int j=1;j<=n;j++) {
				System.out.print(i+" ");
				}
			System.out.println();
			}
		}
	}