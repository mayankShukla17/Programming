/*Wajp to print the pattern
	n=5 1 			n=4 1
		2 6 			2 5 
		3 7 10 			3 6 8 
		4 8 11 13 		4 7 9 10 
		5 9 12 14 15 
*/
import java.util.Scanner;
	class MainPattern35 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();

			for (int i=1;i<=n;i++) {
				int k=i;
				for (int j=1;j<=i;j++) {
					System.out.print(k+" ");
					k=k+n-j;
				}
				System.out.println();
			}
		}
	}