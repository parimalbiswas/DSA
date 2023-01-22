// In Selection Sort -->
// We find the lowest Element in the array and put it on Front
//  We run one Loop start to end and find the smallest element and then at last we swap (but no swapping happen every time like Bubble Sort)
// 1 swap per one iteration




package Sorting.SelectionSort;

public class SelectionSorting {
    //TIME COMPLEXITY --> O(n^2)
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int arr[] = {7,8,3,1,2};

        //Selection Sort
        for (int i = 0; i < arr.length-1; i++)
        {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++)
            {
                    if(arr[smallest]>arr[j])
                    {
                            smallest =j;
                    }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }



        printArray(arr);
    }
}
