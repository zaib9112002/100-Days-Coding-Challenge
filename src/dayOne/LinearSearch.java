package dayOne;

public class LinearSearch {
	public static void main(String [] args) {
		int[] numbers = {5,3,8,6,1};
		int ele = 6;
		int result = LinearSea(numbers,ele, 0);
		if(result == -1) {
			System.out.println("Element not found");
		}else 
		{
			System.out.println("Element "+ele+" found at index: "+result);
		}
	}
	
	public static int LinearSea(int[] arr,int ele, int index) {
		if(index >= arr.length)
			return -1;
		if (arr[index] == ele)
			return index;
		return LinearSea(arr, ele, index+1);
	}
}
