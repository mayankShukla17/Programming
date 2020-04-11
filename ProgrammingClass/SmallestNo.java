//Write a java program to read two floating point values from the user and print smallest among those two no by using ifelse.
import java.util.Scanner;
	class SmallestNo{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number");
			float n1 = sc.nextFloat();
			System.out.println("Enter the second number");
			float n2 = sc.nextFloat();
			
			if (n1<n2) {
				System.out.println(n1 + " is smallest");
			}
			else {
				System.out.println(n2 + " is smallest");
			}
		}
	}