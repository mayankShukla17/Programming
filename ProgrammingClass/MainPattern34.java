/*Wajp to print the pattern
	n=5 * * * * * * * * *
		  * * * * * * * 
		  	* * * * * 
		  	  * * * 
		  	  	* 
*/
import java.util.Scanner;
	class MainPattern34 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			int st=2*n-1;
			for (int i=1;i<=n;i++) {
				for (int j=1;j<i;j++) {
					System.out.print(" ");
				}
				for (int k=1;k<=st;k++) {
					System.out.print("*");	
				}
				st=st-2;
				System.out.println();
			}
		}
	}