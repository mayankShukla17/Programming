/*Wajp to print the pattern
	n=5 A B C D E
		F G H I
		J K L
		M N 
		O
*/

import java.util.Scanner;
	class MainPattern27 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			int k=1;
			for (int i=n;i>=1;i--) {
				for (int j=i;j>=1;j--) {
					System.out.print((char)(k+64)+" ");
					k++;
				}
				System.out.println();
			}
		}
	}