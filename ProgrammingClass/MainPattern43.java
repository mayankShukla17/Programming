/*Wajp to print the pattern 
	n=5 1 2 3 4 5 
		  2 3 4 5 
		    3 4 5 
		      4 5 
		        5 
*/ 
import java.util.Scanner;
	class MainPattern43 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			
			for (int i=1;i<=n;i++) {
				for (int j=1;j<i;j++) {
					System.out.print(" ");
				}
				for (int k=i;k<=n;k++) {
					System.out.print(k);	
				}
				System.out.println();
			}
		}
	}