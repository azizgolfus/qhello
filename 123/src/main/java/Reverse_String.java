import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse_String {

	public Reverse_String() {
		// TODO Auto-generated constructor stub
					
		}
		
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		
		
		ArrayList<Character> nsal = new ArrayList<Character>(); 
		
		for(int i =0 ; i< c.length ; i++) {
			nsal.add(c[i]);
		}
		
		System.out.println(nsal);
		System.out.println(c);
		Collections.reverse(nsal);
		
		System.out.println(nsal);
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		System.out.println(s);
//		
//		String nstr = "";
//		
//		for (int i =0 ; i< s.length() ; i++) {
//			nstr = s.charAt(i) + nstr;		
//			
//		}
//		System.out.println(nstr);
		
		
//		String s = "This is a string";
//		char c [] = s.toCharArray();
//		char p [] = new char[c.length];
//		
//		for (int i=0 ;i< c.length ; i++ ) {
//			p[c.length-1-i] =c[i];
//		}
//		System.out.println(String.valueOf(p));

		
		
		
		
		
		
		
//	String s = "This is a string";
//	StringBuilder sbr = new StringBuilder(s) ;
//	System.out.println(sbr.reverse());
	
	
	
	}

}
