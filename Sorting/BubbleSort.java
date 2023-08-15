package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            boolean swap=false;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap)
                break;
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{5,2,8,1,0,4})));
    }
    
}
