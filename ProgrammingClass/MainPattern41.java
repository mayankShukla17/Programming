/*Wajp to print the pattern
	n=5 * 				* 
		* * 		  * * 
		* * *		* * * 
		* * * *   * * * * 
		* * * * * * * * * 
*/
import java.util.Scanner;
	class MainPattern41 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			
			/*for (int i=1;i<=n;i++) {
				int m=0;
				for (int j=1;j<=i;j++) {
					System.out.print("*");
					m++;
				}
				for (int k=i;k<2*n-(i+1);k++) {
					System.out.print(" ");	
					m++;
				}
				for (int l=1;l<=i;l++) {
					System.out.print("*");
					m++;
					if (m>=2*n-1) //OR (m<n+(n-1))
						break;
				}
				System.out.println();
			}*/

			for (int i=1;i<=n;i++) {
				for (int j=1;j<=i;j++) {
					System.out.print("*");
				}
				for (int k=1;k<2*n-2*i;k++) {
					System.out.print(" ");	
				}
				for (int l=1;l<=i;l++) {
					if (i==n && l==1) 
						continue;
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}