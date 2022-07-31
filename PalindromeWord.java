package darsan;

import java.util.Scanner;

public class PalindromeWord {
	public static void main(String[] args) {
		System.out.println("Enter string to be reverse:");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String reverse="";
		for(int i=str.length()-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
			
		}
		System.out.println("Reversed string is:"+reverse);
		if(reverse.equals(str)) {
			System.out.println("Word  is palidrome");
		}
		else {
			System.out.println("word is not palindrome ");
		}
		scan.close();
	}

}
