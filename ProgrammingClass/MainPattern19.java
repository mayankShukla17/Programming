/*Wajp to print the pattern
	n=5 a
		a b 
		a b c 
		a b c d
		a b c d e
*/
import java.util.Scanner;
	class MainPattern19{
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();

			for (int i=1;i<=n;i++) {
				for (int j=1;j<=i;j++) {
					System.out.print((char)(j+96)+" ");
				}
				System.out.println();
			}
		}
	}