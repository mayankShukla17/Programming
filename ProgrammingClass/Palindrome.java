/*
Wajp to method return true if the no is palindrom otherwise return false.
*/
import java.util.Scanner;
	class Palindrome{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int no = sc.nextInt();
			
			boolean rs = isPalindrome(no); //Calling statement if method is static no need to create object
			
			if(rs==true)
				System.out.println( no + " Is Palindrome ");
			else
				System.out.println( no + " Is Not Palindrome");
			
		}
		static boolean isPalindrome(int x){
			int rev= 0,t=x;
			while(x!=0){
				int r = x%10;
				rev=rev*10+r;
				x=x/10;
				}
				return rev==t;
				
				/*
				if(t==rev)
					return true;
				else
					return false;
				*/
		}
	}