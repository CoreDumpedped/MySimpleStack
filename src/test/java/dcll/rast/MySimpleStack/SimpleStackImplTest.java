package dcll.rast.MySimpleStack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackImplTest {
    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception {
        simpleStack=new SimpleStackImpl();
        System.out.println("je suis");

    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true,simpleStack.isEmpty());
        String element1= "toto";
        simpleStack.push(new Item(new String(element1)));
    }

    @Test
    public void testGetSize() throws Exception {
        Assert.assertEquals(0,simpleStack.getSize());
        String element1="toto";
        simpleStack.push(new Item(new String(element1)));
        simpleStack.push(new Item(new String(element1+"2")));
        Assert.assertEquals(2,simpleStack.getSize());
    }

    @Test
    public void testPush() throws Exception {

    }

    @Test
    public void testPeek() throws Exception {

    }

    @Test
    public void testPop() throws Exception {

    }
}