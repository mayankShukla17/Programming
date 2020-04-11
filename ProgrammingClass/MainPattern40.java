/*Wajp to print the pattern 
	n=5 1 2 3 4 5 6 7 8 9 
		  1 2 3 4 5 6 7 
		    1 2 3 4 5 
		      1 2 3 
		      	1 
*/
import java.util.Scanner;
	class MainPattern40 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			
			for (int i=n;i>=1;i--) {
				
				for (int j=i;j<n;j++) {
					System.out.print(" ");
				}
				for (int k=1;k<=2*i-1;k++) {
					System.out.print(k);	
				}
				System.out.println();
			}
		}
	}