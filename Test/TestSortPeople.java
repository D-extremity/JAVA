package Test;
import org.junit.Assert;
import org.junit.Test;

import ExtraStuff.SortThePeopleLeet;
public class TestSortPeople extends SortThePeopleLeet {
@Test
public void peopleTest1(){
    String name[]={"Satyam","Sarthak","Nitin","Yatharth","Kartikey"};
    int height[]={456,4567,45667,7803874,1234};
    String[] s=sortPeople(name, height);
    Assert.assertArrayEquals(new String[]{"Yatharth","Nitin","Sarthak","Kartikey","Satyam"},s);
}
    
}
