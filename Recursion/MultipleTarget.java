import java.util.ArrayList;

public class MultipleTarget {
    //{1,2,3,4,4,5,6,7};
    //target is 4
    // O/P-->4 ,5
    // public ArrayList<Integer> index=new ArrayList<>();
    /*
     * METHOD !
     */
    public ArrayList<Integer> multiple(int[] arr , int target,int start,ArrayList<Integer> index)
{
    if(start>=arr.length)
        return index;
    if(arr[start]==target)
        index.add(start+1);
    return multiple(arr,target,start+1,index);
}


/*
 * METHOD 2
 */

 public final ArrayList<Integer> index=new ArrayList<>();
  public ArrayList<Integer> multiple(int[] arr , int target,int start)
{
    if(start>=arr.length)
        return index;
    if(arr[start]==target)
        index.add(start+1);
    return multiple(arr,target,start+1);
}
}
