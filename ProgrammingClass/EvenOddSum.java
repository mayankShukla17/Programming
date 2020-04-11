/*
Wajp to calc the sum of even no and odd no between n
*/

import java.util.Scanner;
	class EvenOddSum{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();
			
			int sumEven=0;
			int sumOdd=0;
			int i=1;
			
			/*for(i=1;i<=n;i++){
				if(i%2==0){
					sumEven=sumEven+i;
				}
				else{
					sumOdd=sumOdd+i;
				}
			}*/
			
			
			while(i<=n){
				if(i%2==0){
					sumEven=sumEven+i;
				}
				else{
					sumOdd=sumOdd+i;
				}
				i++;
			}
			
			System.out.println("Sum of even no " + sumEven);
			System.out.println("Sum of odd no " + sumOdd);
		}
	}