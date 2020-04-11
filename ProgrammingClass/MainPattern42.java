/*Wajp to print the pattern 
	n=5 * * * * * * * * * 
		* * * *   * * * * 
	    * * *	    * * * 
	    * * 		  * * 
	    *  				* 
*/
import java.util.Scanner;
	class MainPattern42 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			
			
			/*for (int i=1;i<=n;i++) {
				int m=0;
				for (int j=n;j>=i;j--) {
					System.out.print("*");
					m++;
				}
				for (int k=2;k<2*i-1;k++) {
					System.out.print(" ");	
					m++;
				}
				for (int l=i;l<=n;l++) {
					System.out.print("*");
					m++;
					if (m>=2*n-1) {
						break;
					}
				}
				System.out.println();
			}*/

			for (int i=n;i>=1;i--) {
				for (int j=1;j<=i;j++) {
					System.out.print("*");
				}
				for (int k=1;k<2*n-2*i;k++) {
					System.out.print(" ");	
				}
				for (int l=1;l<=i;l++) {
					if (l<n) 
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}