/*
Wajp to print the pattern
I/P =  6
O/P = 1 3 6 10 15 21

I/P = 3
O/P = 1 3 6

*/

import java.util.Scanner;
	class NoPattern{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n = sc.nextInt();
			int k=0;
			for (int i=1;i<=n;i++) {
				k=k+i;
				System.out.print(k+" ");
			}
			/*for (int i=1;i<=n;i++) {
				System.out.print(i*(i+1)/2+" ");
			}*/
		}
	}