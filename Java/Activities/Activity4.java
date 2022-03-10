package Activity4;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,2,10,12,1,5,6};
		
		ascendingSort(arr);
		
	}

	private static void ascendingSort(int[] arr) {
		// TODO Auto-generated method stub
		int size = arr.length,i;
		//int size1=size-1;
	
		System.out.println(size);
		for(i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("Sorted order is\n" + Arrays.toString(arr));
	}


}
