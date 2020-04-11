/*Wajp to print the pattern 
	n=5 		1  
			  2 1 
			3 2 1 
		  4 3 2 1 
		5 4 3 2 1 
*/
import java.util.Scanner;
	class MainPattern44 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			
			for (int i=1;i<=n;i++) {
				for (int j=i;j<n;j++) {
					System.out.print(" ");
				}
				for (int k=i;k>=1;k--) {
					System.out.print(k);	
				}
				System.out.println();
			}
		}
	}