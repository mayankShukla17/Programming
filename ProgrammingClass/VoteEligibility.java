// Write a java program to read to read the age of a person and print that person is elegible to vote or not.
import java.util.Scanner;
	class VoteEligibility{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the age.");
			int age = sc.nextInt();
			
			if (age>=18) {
				System.out.println("Elegible to vote.");
			}
			else {
				System.out.println("Not elegible to vote.");
			}
		}
	}