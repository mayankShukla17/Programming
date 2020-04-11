/*Wajp to print the pattern
	n=5 a 
		b c 
		d e f
		g h i j
		k l m n o
*/

import java.util.Scanner;
	class MainPattern28 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			int k=1;
			for (int i=1;i<=n;i++) {
				for (int j=i;j>=1;j--) {
					System.out.print((char)(k+96)+" ");
					k++;
				}
				System.out.println();
			}
		}
	}