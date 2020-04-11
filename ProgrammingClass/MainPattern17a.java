/*Wajp to print the pattern
	n=5 A B C D E 	a.	1 2 3 4 5 
		B C D E 		2 3 4 5
		C D E 			3 4 5
		D E 			4 5
		E 				5

*/
import java.util.Scanner;
	class MainPattern17a{
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();

			for (int i=1;i<=n;i++) {
				for (int j=i;j<=n;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
	}