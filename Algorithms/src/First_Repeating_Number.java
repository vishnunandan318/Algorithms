
public class First_Repeating_Number {

	
	public int repeat(int[] arr) {
		// to find first repeating value  	
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0;j<i; j++) {
				
				System.out.println(i+" "+ arr[i]+"  "+j+" "+arr[j]);
				if (arr[i]==arr[j] && i!=j) {
					return arr[i];
				}
			}
		}
		
		return 0;
	}
	
	
	public int repeat_efficient(int[] arr) {
		// to find first occurred repeating value  
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i;j<arr.length; j++) {
				
				System.out.println(i+" "+ arr[i]+"  "+j+" "+arr[j]);
				if (arr[i]==arr[j] && i!=j) {
					return arr[i];
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		First_Repeating_Number obj = new First_Repeating_Number();
		
		int[] arr = { 10, 9, 2, 3, 2, 9, 8}; 
		//System.out.println(obj.repeat(arr));
		System.out.println(obj.repeat_efficient(arr));
	}

}
