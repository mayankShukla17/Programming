/*
wajp to define a method to return sum of n natural no
*/

import java.util.Scanner;
	class SumNaturalMethod{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			
			int s=sumNatural(n);
			/*	for (int i =1;i<=n;i++){
					sum = sum +i;
			}
			*/
			
			System.out.println(" Sum " + s);
		}
		
		static int sumNatural(int x){
			int sum =0,i=1;
			
			while(i<=x){
				sum = sum +i;
				i++;
			}
			return sum;
		}
		
	}