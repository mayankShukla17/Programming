/*
Wajp to count how many even and odd digits present in the no
*/

import java.util.Scanner;
	class EvenOddDigits{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();
			
			int countEven=0;
			int countOdd=0;
			int count=0;
			
			do{
				count++;
				n=n/10;
				if(count%2==0){
					countEven++;
				}
				else{
					countOdd++;
				}
			}while(n!=0);
			System.out.println(" No of even digits " +countEven);	
			System.out.println(" No of odd digits " +countOdd);	
		}
	}