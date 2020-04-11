/*Wajp to define a method to return how many armstrong no within 1 to n
*/

import java.util.Scanner;
	class ArmStrongCount{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = sc.nextInt();
			
			int count=0;
			for(int i=2;i<=n;i++){
				boolean rs=isArmStrong(i);
				if(rs==true){
					count++;
					System.out.println(i);
				}
			}
			System.out.println(count);
		}
		
		static boolean isArmStrong(int n){
			int sum=0,t=n;
			int dc=countDigits(n);
			do{
				int r = n%10;
				sum=sum+(int)Math.pow(r,dc);
				n=n/10;
			}while(n!=0);
			return sum==t;
		}
		
		static int countDigits(int x){
			int count =0;
			do{
				count++;
				x=x/10;
			}while(x!=0);
			return count;
		}
	}