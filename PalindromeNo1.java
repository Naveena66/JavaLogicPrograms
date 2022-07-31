package darsan;

public class PalindromeNo1 {
	public static void main(String[] args) {
		//n=12021 is a palindrome no
		//n=1202 is a not a palindrome no
		int n=12021;
		int temp=n;
		int rem=0,res=0;
		for(int i=n; i!=0; ) {//using for loop
			rem=n%10;
			res=(res*10)+rem;
			i=n/10;
			n=i;
		}
		if(temp==res) {
			System.out.println("given no is palindrome:"+temp);
		}
		else {
			System.out.println("given no is not palindrome:"+temp);
		}
	}
}
