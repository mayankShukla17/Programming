/*Wajp to print the pattern 
	n=5 		1 
			  1 * 2 
			1 * 2 * 3 
		  1 * 2 * 3 * 4 
		1 * 2 * 3 * 4 * 5 
*/
import java.util.Scanner;
	class MainPattern37 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			
			/*for (int i=1;i<=n;i++) {
				for (int j=i;j<n;j++) {
					System.out.print(" ");
				}
				for (int k=1;k<=i;k++) {
					System.out.print(k);	
					if (k<i) 
						System.out.print("*");
				}
				System.out.println();
			}*/

			for (int i=1;i<=n;i++) {
				for (int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				for (int k=1;k<=i;k++) {
					System.out.print(k);	
					if (k!=i) 
						System.out.print("*");
				}
				System.out.println();
			}
		}
	}