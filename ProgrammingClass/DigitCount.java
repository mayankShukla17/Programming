/*Wajp to count how many digits present in a no.
3658/10=365/10=36/10=3/10=0

do{
	Initilisation
	Increment/Decrement
}while(condition);
*/

import java.util.Scanner;
	class DigitCount{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			int count=0;
			do{
				count++;
				n=n/10;
			}while(n!=0);
			System.out.println("No of digits" +count);			
		}
	}