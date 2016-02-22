package Array;

public class SelectSort {

	public void selectSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int k = i;
			for(int j=i+1;i<arr.length;j++)
			{
				if(arr[j]<arr[k]) k=j;
			}
			if(k!=i)
			{
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
