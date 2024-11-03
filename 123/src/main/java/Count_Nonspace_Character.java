import java.util.Scanner;

public class Count_Nonspace_Character {

	public static void main(String args[]) {
		
//		String count of non-space chracter: Write a program to calculate the count of non-space characters in a string.
//		Input: This is a string
//		Output: 13

		
		String s = "This is a String";
		int count =0 ;
		for(int i=0 ; i<s.length() ; i++) {
			int av = (int)s.charAt(i);
			if(65 <= av && av<=90 || 97<=av    && av <=123) {
				count ++;
				
			
			}
		
		}
		System.out.println(count);
			
		
		
		
		
		
		
		
		
		
		
		
		

//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		
//		char ch[] = s.toCharArray();
//		int count =0 ;
//		for (char c : ch) {
//			if(c != ' ') {
//				count++ ;
//				
//			}
//		}
//		
//		System.out.println(count) ;
		
		
		
		
		
		
	}

}
