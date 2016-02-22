package Array;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {11,21,23,6,8,3,5,7,9,2,4,6,8};
		
		mergeSort(a,0,a.length-1);
		
		for(int i:a)
			System.out.print(i+" ");
		
	}
	
	public static void mergeSort(int[] arr,int first, int last)
	{
		if(first>=last)
			return;
		int mid = (first+last)/2;
		
		mergeSort(arr,first,mid);
		mergeSort(arr,mid+1,last);
		mergeArray(arr,first,mid,last);
	}
	
	public static void mergeArray(int[] arr, int first, int mid, int last)
	{
		int i = first;
		int j = mid+1;
		
		int[] temp = new int[last-first+1];
		
		int k = 0;
		while(i<=mid && j<=last)
		{
			temp[k++] = arr[i]<arr[j]? arr[i++]:arr[j++];
			
		}
		
		while(i<=mid)
		{
			temp[k++] = arr[i++];
		}
		while(j<=last)
		{
			temp[k++] = arr[j++];
		}
		
		for(int m=0;m<temp.length;m++)
			arr[first+m] = temp[m];
	}

}
