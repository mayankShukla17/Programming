/*WWajp to print the pattern
	string="RAGHU"	R 		 a. R 		b.  R A G H U		
					R A 		A A 		R A G H
					R A G   	G G G 		R A G 
					R A G H 	H H H H 	R A
					R A G H U 	U U U U U 	R

*/
import java.util.Scanner;
	class MainPattern20 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the String ");
			String st=sc.next();

			for (int i=0;i<st.length();i++) {
				for (int j=0;j<=i;j++) {
					System.out.print(st.charAt(j)+" ");
				}
				System.out.println();
			}
		}
	}