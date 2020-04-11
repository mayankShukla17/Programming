/*Wajp to print the pattern
	n=5	1 2 3 4 5	n=3 1 2 3  
		1 2 3 4 5 		1 2 3 
		1 2 3 4 5 		1 2 3 
		1 2 3 4 5 
		1 2 3 4 5 
*/


import java.util.Scanner;
	class MainPattern2{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n = sc.nextInt();
			for (int i=1;i<=n;i++) {
				for (int j=1;j<=n;j++) {
				System.out.print(j+" ");
				}
			System.out.println();
			}
		}
	}