package darsan;

public class CountOfDigits {
	public static void main(String[] args) {
		int n=10242563;
		int c=0;
		int rem=0;
		int sumEven=0;
		int sumOdd=0;
		System.out.println(" reverse order digits:");
		while(n!=0) {
			rem=n%10;
			
			System.out.println(rem);
			if(rem%2==0) {
				sumEven += rem;
			}
			if(rem%2!=0) {
				sumOdd += rem;
			}
			n=n/10;
			c++;
		}
		System.out.println("count of digits:"+c);
		System.out.println("sum of even digits:"+sumEven);
		System.out.println("sum of odd digits:"+sumOdd);
	}

}
