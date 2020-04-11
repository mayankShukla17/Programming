//Wajp to read principle amount rate of interest and time from user based on that calc n display simple interest.
import java.util.Scanner;
	class SimpleInterest{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the principle amount.");
			int p = sc.nextInt();
			System.out.println("Enter the rate of interest.");
			int r = sc.nextInt();
			System.out.println("Enter the time period.");
			int t = sc.nextInt();
			double si = (p*r*t)/100;
			System.out.println("Simple Interest is " + si);
		}
	}