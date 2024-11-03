
public class Swap_two_String_using_Substring {

	public static void main (String [] args) {
		
		String s = "Hello World";
		int index = 0 ;
		for(int i=0 ; i< s.length() ; i++) {
			if(s.charAt(i)==' ') {
				index=i ;
			}
		}
		
		String ns[] = new String[2];
		ns[0]= s.substring(index);
		System.out.println(ns[0]);
		System.out.println(s);
	}

}
