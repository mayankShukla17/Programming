/*Wajp to print the pattern
	n=5 5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
*/

import java.util.Scanner;
	class MainPattern8{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n = sc.nextInt();
			for (int i=1;i<=n;i++) {
				for (int j=n;j>=1;j--) {
				System.out.print(j+" ");
				}
			System.out.println();
			}
		}
	}