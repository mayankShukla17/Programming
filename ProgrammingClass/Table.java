/*
Wajp to display the multiplication table for user entered no
for(Initilisation;Condition;Increment/Decrement){
	
}
*/
import java.util.Scanner;
	class Table{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			
			for(int i = 1; i<=10;i++)
				System.out.println(n+"x"+i+ "="+n*i);		
		}
	}