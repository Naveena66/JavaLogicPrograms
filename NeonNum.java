package darsan;

import java.util.Scanner;

public class NeonNum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		int sq=n*n;
		int sum=0;
		int rem=0;
		while(sq!=0) {
			rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if(sum==n) {
			System.out.println("Neon Num");
		}
		else {
			System.out.println("Not a Neon Num");
		}
		scan.close();
	}

}
