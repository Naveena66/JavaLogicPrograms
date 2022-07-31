package darsan;

public class Demo3 {
	public static void main(String[] args) {
		//3,4,9,8,15,12,21,16,27,20,33,24,39,28,45,32,51,36,57,40
		for(int i=1; i<=20; i++) {
			System.out.println( i%2 == 0 ? i*2 : i*3);
		}
	}

}
