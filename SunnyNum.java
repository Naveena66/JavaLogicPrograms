package darsan;

import java.util.Scanner;

public class SunnyNum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a num:");
		int n=scan.nextInt()+1;
		int flag=0;
		for(int i=1; i<=n; i++) {
			if(i*i==n) {
				flag=1;
				break;
			}
		}
			if(flag==1) {
				System.out.println("sunny num");
			}
			else {
				System.out.println("not a sunny num");
			}
			scan.close();
	}

}
