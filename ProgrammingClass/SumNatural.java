/*Wajp to calc the sum first n natural no.
while(Condition){
	Initilisation
	Increment/Decrement
}
*/
import java.util.Scanner;
	class SumNatural{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			int i=1,sum =0;
			
				for (i=1;i<=n;i++){
					sum = sum +i;
			}
			/*
			 while(i<=n){
			 	sum = sum +i;
			 	i++;
			 	//break;
			 }*/
			System.out.println("  Sum " + sum);
		}
	}