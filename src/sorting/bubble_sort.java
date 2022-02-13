package sorting;

public class bubble_sort 
{
	void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
	void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
	public static void main(String[] args) 
	{
		bubble_sort object= new bubble_sort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
        object.bubbleSort(arr);
        System.out.println("Sorted array");
        object.printArray(arr);
	}

}
