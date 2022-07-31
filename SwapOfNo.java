package darsan;

public class SwapOfNo {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//before swaping
		System.out.println(a+" "+b);
		System.out.println("----");
		int temp=a;
		a=b;
		b=temp;
		//after swapping
		System.out.println(a+" "+b);
	}

}
