/*Wajp to print the pattern
n=5         *
	      * *
	    * * *
	  * * * *
	* * * * *
*/
import java.util.Scanner;
	class MainPattern31{
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();

			for (int i=1;i<=n;i++) {
				for (int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				for (int j=1;j<=i;j++) {
					System.out.print("*");	
				}
				System.out.println();
			}
		}
	}