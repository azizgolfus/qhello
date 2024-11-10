
public class SecondLargestNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,1,25,10,3,15,16,28};
		int largest=-1 ,ans =-1 ;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				ans=largest ;
				largest=a[i];
			}
			else if(largest>a[i] && a[i]>ans) {
				ans=a[i];
				
				
			}
		}
		System.out.println(ans);
	
	}

}
