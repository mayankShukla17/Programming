/*Wajp to print the pattern
n=7 		1 
	      2 1 2  
	    3 2 1 2 3 
	  4 3 2 1 2 3 4  
	  	3 2 1 2 3  
	  	  2 1 2  
	  	    1 
*/
import java.util.Scanner;
	class MainPattern54 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the no ");
			int n=sc.nextInt();
			int sp=n/2,st=1;
			for (int i=1;i<=n;i++) {
				for (int j=1;j<=sp;j++) {
					System.out.print("  ");
				}
				int l=st/2+1;
				for (int k=1;k<=st;k++) {
					System.out.print(l+" ");
					if (k<=st/2)
						
						l--;	
					else
						l++;
				}
					if (i<=n/2){
						sp--;
						st=st+2;
					} 
					else {
						sp++;
						st=st-2;
					}
				System.out.println();
			}
		}
	}