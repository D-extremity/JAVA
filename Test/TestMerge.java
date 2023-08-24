package Test;
import org.junit.*;

// import java.beans.Transient;
// import java.util.Arrays;

import ExtraStuff.InPlaceMerge;

public class TestMerge extends InPlaceMerge{

@Test
public void test1(){
    int arr[]={5,2,3,1,4};
    divide(arr,0,4);
    
    Assert.assertArrayEquals(new int[]{1,2,3,4,5},arr);

}
@Test
public void test2(){
    int arr[]={12,34,754,234,6754,0,13,-23,-3432234,546567,45,443,-9,-9,-34,54};
    divide(arr,0,15);
    Assert.assertArrayEquals(new int[]{-3432234, -34, -23, -9, -9, 0, 12, 13, 34, 45, 54, 234, 443, 754, 6754, 546567},arr);
}



    
    // public static void main(String[] args) {
        //     int[] arr={5,1,4,2,3};
        //   divide(arr,0,4);
        //   System.out.println(Arrays.toString(arr));
        // }
 }