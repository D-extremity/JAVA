public class LinearSearch {
    public boolean search(int[] n,int target,int start)
    {
        if(n.length<=start)
                return false;
       return  n[start]==target || search(n,target,start+1);
            
    }
}
