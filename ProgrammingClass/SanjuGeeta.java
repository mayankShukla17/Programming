//Wajp to print sanju if no is divisible by 3 print geeta if no is divisible by 5 print sanju weds geeta if no is divisible by 3&5 both otherwise breakup.

import java.util.Scanner;
	class SanjuGeeta{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			
			if(n%3==0 && n%5==0){
				System.out.println("Sanju weds Geeta");
			}
			else if(n%3==0){
				System.out.println("Sanju ");
			}
			else if(n%5==0){
				System.out.println("Geeta");
			}
			else{
				System.out.println("Break Up");
			}
		}
	}	