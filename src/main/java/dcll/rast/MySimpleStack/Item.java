package dcll.rast.MySimpleStack;

/**
 * Created by 21207776 on 04/03/2015.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }


    public Object getValues(){
        return value;
    }

    public void setValue(Object value){
        this.value=value;
    }

}
