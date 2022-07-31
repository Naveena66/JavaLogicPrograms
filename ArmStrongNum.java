package darsan;

public class ArmStrongNum {
	public static void main(String[] args) {
		//n1=153 is a ArmStrong no
		//n1=154 is not a ArmStrong no
		int n1=153,n2=n1,n3=n1,c=0;
		while(n1 != 0) {
			n1=n1/10;
			c++;
		}
		int sum=0,rem=0;
		while(n2 != 0) {
			rem=n2%10;
			int ans=1;
			for(int i=1; i<=c; i++) {
				ans=ans*rem;
			}
			sum=sum+ans;
			n2=n2/10;
			
		}
		
		System.out.println( n3==sum ? "ArmStrong no" : "Not a ArmStrong no");
	}

}
