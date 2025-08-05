package dayTwo;

public class MergeSort {
	public static void main(String[] args) {
	int[] arr= {6,3,4,5,2,1};
	int n =arr.length;
	Divide(arr,0,n-1);
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	}

	//Divide and conquer
	
	public static void Divide(int[] arr,int si,int ei) {
		if(si >= ei) {
			return;
		}
		int mid = si +(ei-si)/2;
		Divide(arr, si, mid);
		Divide(arr, mid+1,ei);
		Conquer(arr, si,mid, ei);
	}
	public static void Conquer(int[] arr,int si,int mid,int ei) {
		int[] merged = new int[ei-si+1];
		int in=si,in2=mid+1;
		
		int x=0;
		while(in <= mid && in2<=ei) {
			if(arr[in] <= arr[in2]) {
				merged[x++]=arr[in++];
			}
			else{
				merged[x++]=arr[in2++];
			}
		}while(in <= mid) {
			merged[x++]=arr[in++];
		}while(in2 <= ei) {
			merged[x++]=arr[in2++];
		}
		for(int i=0;i<merged.length;i++) {
			arr[si+i] =merged[i];
		}
	}
}
