/*
Define a method to return the factorial of n
*/
import java.util.Scanner;
	class FactorialMethod{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int no = sc.nextInt();
			FactorialMethod fm = new FactorialMethod();
			int f = fm.factorial(no);
			
			System.out.println("Factorial of " + no + " is " + f);
		}
		
		int factorial(int x){
				int fact = 1;
				while(x>1){
					fact=fact*x;
					x--;
				}
				return fact;
		}
		
		/*int factorial(int x){
			int fact=1;
			for(;x>1;x--){
				fact=fact*x;
			}
			return fact;
		}
		*/
	}