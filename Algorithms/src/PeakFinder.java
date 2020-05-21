
public class PeakFinder {
	
//by traversing the array linear method  
	
	public int peak(int arr[]) {
		int count=0;
		if(arr.length == 0) {
			System.out.println("Array is empty");
		}
		else if(arr.length == 1) {
			System.out.println("Peak is at position 0 with value "+arr[0]+" with single value" );
			count++;
		}else if(arr.length == 2) {
			if(arr[0]>arr[1]) {
			System.out.println("Peak is at position 0 with value "+arr[0]);
			count++;
			}else {
				System.out.println("Peak is at position 1 with value "+arr[0]);
				count++;
			}
		}else{
			
			if(arr[0]>arr[1]) {
				System.out.println("Peak is at position 0 with value "+arr[0]);
				count++;
			}
				
			for(int i=1; i<arr.length-1; i++) {
			//	System.out.println(i);
				if(arr[i]>arr[i-1]  && arr[i]>arr[i+1]) {
					System.out.println("Peak is at position "+i+" with value "+arr[i]);
					count++;
				}
			}
			
			if(arr[arr.length-1]>arr[arr.length-2]) {
				System.out.println("Peak is at position "+(arr.length-1)+" with value "+arr[arr.length-1]);
				count++;
				}
		}
	return count;	
	}
	
	
	public static void main(String[] args) {
		
		//int arr[] = new int[10];
		
		PeakFinder pf = new PeakFinder();
		
		int[] arr = {2,5,3,67,3,89,3,8,0,4,2,67,9,6,8,43,678,34,76,32,76,23,76,98,5,32,32,54,657,32,32};
		
		System.out.println(arr.length);
		
		//pf.peak(arr);
		
		System.out.println("So the array has "+pf.peak(arr)+ " peaks");
		
	}

}
