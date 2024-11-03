import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.google.common.collect.Sets;

public class Remove_Duplicate_Character {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.out.println("Remove Duplicate Character");
		
		String input = "hachkerearth";
		char a[] = input.toCharArray();
		
		LinkedHashSet<Character> hset = new LinkedHashSet<>();
		
		
		for(int i=0 ;i<a.length ; i++) {			
			hset.add(a[i]);			
		}
		System.out.println(hset);
				
		
		StringBuilder sb = new StringBuilder() ;
		for (char ch:hset){

				sb.append(ch);
		}

		System.out.println(sb);
		
		
		
		
		
		
		
		
//		ANOTHEER METHOD		
//		System.out.println("Remove Duplicate Character");
//		
//		String input = "hachkerearth";
//		char a[] = input.toCharArray();
//		Set<Character> hset = new HashSet<>();
//		
//		
//		for(int i=0 ;i<a.length ; i++) {			
//			hset.add(a[i]);			
//		}
//		System.out.println(hset);
//				
//		
//		StringBuilder sb = new StringBuilder() ;
//		for (char ch:a){
//			if (hset.contains(ch)) {
//				sb.append(ch);
//				hset.remove(ch);
//			}
//			
//		}
//		
//		System.out.println(sb);
//		
//		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("Another Method");
//		String input = "hackerearth";
//		
//		char arrinput [] = input.toCharArray();
//		System.out.println(arrinput) ;
//		
//		boolean flag = true ;
//		int count=0 ;
//		char tempArr[] = new char[arrinput.length] ;
//		
//		for (int i=0 ; i< arrinput.length ; i++){
//		    flag=true ;
//		    for (int j =0 ; j<arrinput.length ; j++){
//		        
//		        if (arrinput[i]==tempArr[j] && i!=j){
//		            flag = false ;
//		           
//		        }
//		        
//		    }
//		    if(flag){
//		            tempArr[count] = arrinput[i] ; 
//		            count++ ;
//		        }
//	 
//		}
//		
//		System.out.println(tempArr);
//		
		
		
		
		
		

		
		
		
		
		
		
	}

}
