/*Wajp to print the pattern
	n=5 		1 
			  0 1 0 
			1 0 1 0 1 
		  0 1 0 1 0 1 0 
		1 0 1 0 1 0 1 0 1 
*/

import java.util.Scanner;
	class MainPattern36 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			int l=1;
			for (int i=1;i<=n;i++) {
				for (int j=i;j<n;j++) {
					System.out.print(" ");
				}
				for (int k=1;k<=2*i-1;k++) {
					System.out.print(l%2);	
					l++;
				}
				System.out.println();
			}
		}
	}