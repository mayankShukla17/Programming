/*Wajp to print the pattern(Pascal triangle)
n=5 		1 
	      1   1  
	    1   2   1 
	  1   3   3   1  
	1   4   6   4   1  
 
*/
import java.util.Scanner;
	class MainPattern57 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();

			for (int i=1;i<=n;i++) {
				for (int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				int l=1;
				for (int k=1;k<=i;k++) {
					System.out.print(l+" ");
					l=l*(i-k)/k;
				}
				System.out.println();
			}
		}
	}