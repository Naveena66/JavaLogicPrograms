package darsan;

public class ReverseNo {
	public static void main(String[] args) {
		//n=12021 is a palindrome no
		//n=1202 is a not a palindrome no
		int n=123456789;
		int temp=n;
		int rem=0,res=0;
		while(n!=0) {
			rem=n%10;
			res=(res*10)+rem;
			n=n/10;
		}
		System.out.println("Reverse of given no is: "+res);
	}

}
