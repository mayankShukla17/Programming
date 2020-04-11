/*Wajp to print the pattern
	n=5 a b c d e 
		f g h i j 
		k l m n o 
		p q r s t 
		u v w x y
*/

import java.util.Scanner;
	class MainPattern6{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n = sc.nextInt();
			char ch='a';
			for (int i=1;i<=n;i++) {
				for (int j=1;j<=n;j++) {	
					System.out.print(ch+" ");
					ch++;
				}
			System.out.println();
			}
		}
	}
