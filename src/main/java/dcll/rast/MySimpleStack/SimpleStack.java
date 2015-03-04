package dcll.rast.MySimpleStack;

import java.util.EmptyStackException;

/**
 * Created by 21207776 on 04/03/2015.
 */
public interface SimpleStack {

    public boolean isEmpty();

    public int getSize();

    public void push(Item item);

    public Item peek() throws EmptyStackException;

    public Item pop() throws EmptyStackException;
}
