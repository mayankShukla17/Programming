//Wajp to read the length and breadth of a rectangle based on that calc the area and perimeter of rectangle
import java.util.Scanner;
	class Rectangle{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the length of rectangle.");
			int l = sc.nextInt();
			System.out.println("Enter the breadth of reactangle.");
			int b = sc.nextInt();
			int area = l*b;
			int perimeter = 2*(l+b);
			System.out.println("Area of reactangle " + area);
			System.out.println("Perimeter of rectangle " + perimeter);
		}
	}