package dcll.rast.MySimpleStack;

import java.util.Objects;
import java.util.Stack;

/**
 * Created by 21207776 on 04/03/2015.
 */
public class SimpleStackImpl implements SimpleStack {
Stack<Object> wrapperStack = new Stack<Object>();


    @Override
    public boolean isEmpty() {
        return wrapperStack.isEmpty();
    }

    @Override
    public int getSize() {
        return wrapperStack.size();
    }

    @Override
    public void push(Item item) {
        wrapperStack.push(item);
    }

    @Override
    public Item peek() {
        return (Item) wrapperStack.peek();
    }

    @Override
    public Item pop() {
        return (Item) wrapperStack.pop();
    }
}
