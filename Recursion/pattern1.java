public class pattern1 {
    /*
     *   ooooo
     *   oooo
     *   ooo
     *   oo
     *   o
     */
    public static void startPattern1(int n)
    {
        if(n<0)
            return;
        rowPattern(n);
        System.out.println();
        startPattern1(n-1);
        
    }
    public static void rowPattern(int n)
    {
        if(n==0)
            return;
        System.out.print("*");
        rowPattern(n-1);
      
    }


    /*
     * Method 2
     */

     public static void pattern(int r,int c)
     {
        if(r==0)
            return;
        else if(c<=r)
        {
            pattern(r,c+1);
            System.out.print("*");
        }
        else if(c>r)
        {   
            pattern(r-1,1);
            System.out.println();
        }
     }

    public static void main(String[] args) {
        // startPattern1(5);
        pattern(5,1);
    }



public void triangle(int r,int c )
{

}

}
