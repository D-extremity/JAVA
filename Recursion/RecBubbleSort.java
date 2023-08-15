import java.util.Arrays;

public class RecBubbleSort {

    public static int[] sort(int arr[],int i) {
        int len = arr.length - 1;
        int j = 0;
        if(check(arr,false,j,len-i)==true)
            {
                return sort(arr,i+1); 
            }
            return arr;
    }

    public static boolean check(int arr[], boolean swap,int j,int len) {
        if(j+1>len)
            return swap;
        if(arr[j]>arr[j+1])
        {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            swap=true;
        }
        return check(arr,swap,j+1,len);
    }

    public static void main(String[] args) {
       
        System.out.println(Arrays.toString( sort(new int[] { 88,5, 1, 8, 2, 0, 3,-88 },0)));
    }
}
