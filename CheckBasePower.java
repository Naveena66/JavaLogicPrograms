package darsan;

public class CheckBasePower {
	public static void main(String[] args) {
		//2*2*2 internally done
		int base=2;
		int power=4;
		int ans=1;
		for(int i=1; i<=power; i++) {
			ans=ans*base;
		}
		System.out.println(ans);
	}

}
