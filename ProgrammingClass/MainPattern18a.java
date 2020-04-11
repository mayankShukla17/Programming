/*Wajp to prunt the pattern 
	n=5 A 		a. 	1 
		B C 		2 3
		C D E 		3 4 5
		D E F G 	4 5 6 7
		E F G H I 	5 6 7 8 9
*/
import java.util.Scanner;
	class MainPattern18a{
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();

			for (int i=1;i<=n;i++) {
				int k=i;
				for (int j=1;j<=i;j++) {
					System.out.print(k+" ");
					k++;
				}
				System.out.println();
			}

			/*for (int i=1;i<=n;i++) {
				for (int j=i;j<2*i;j++) {
					System.out.print((char)(j+64)+" ");
				}
				System.out.println();
			}*/
		}
	}