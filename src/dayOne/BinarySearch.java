package dayOne;

public class BinarySearch {
	
	public static int binarySearch(int[] arr ,int ele,int left,int right) {
		
		if(left > right) 
			return -1;
		int mid = left+(right-left)/2;
		if(arr[mid] == ele) {
			return mid;
		}
		else if(arr[mid] > ele){
			return binarySearch(arr,ele,left,mid-1);
		}else 
				return binarySearch(arr,ele,mid+1,right); //element not found
	}
	
	public static void main(String [] args) {
		int[] sortedarray = {1,3,5,6,8,10}; //need to give sorted array
		int ele = 6; //to search element
		int result = binarySearch(sortedarray, ele,0,sortedarray.length-1);
		if(result == -1) {
			System.out.println("Element Not found");
		}else 
		{
			System.out.println("Element "+ele+ " found at index : "+result);
		}
	}
}
