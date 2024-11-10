import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseNumberAndReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,10,4,15,7,20,30};
		int n = a.length ;
		System.out.println(Arrays.toString(a));
		int temp;
		
		for(int i =0 ;i<n/2 ;i++) {
			
			temp = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = temp;
					
		}
		System.out.println(Arrays.toString(a));
		
		
		
		
//		//REVERSE ARRAY
//		int a[] = {5,10,4,15,7,20,30};
//		System.out.println(Arrays.toString(a));
//		int b[] = new int [a.length];
//		for (int i =0 ; i< a.length ;i++) {
//			b[a.length-1-i]= a[i];
//		}
//		System.out.println(Arrays.toString(b));
//		
		
		//REVERSE NUMBER
//		int n=20501 ;
//		String strng = String.valueOf(n);
//		System.out.println(strng);
//		
//		StringBuilder sb = new StringBuilder(strng);
//		sb.reverse();
//		System.out.println(((Integer)n).getClass().getSimpleName());
//		String s1 = sb.toString();
//		int m = Integer.valueOf(s1);
//		System.out.println(m+1);
		
		
		
		//Another method
//		int n = 10502 ;
//		int m =0 ;
//		while(n!=0) {
//			m = n%10 + m*10 ;
//			n=n/10 ;
//		}	
//		System.out.println(m);

	}

}
