import java.util.ArrayList;
import java.util.Arrays;


public class Simple<T> {

    private T[] obj;

    public Simple(T[] obj) {
        this.obj = obj;
    }

    public T[] getObj() {
        return obj;
    }

    public void showType() {
        System.out.println(obj.getClass().getName());
    }

    public ArrayList<T> createArrayList() {
        ArrayList<T> arrayList = new ArrayList<T>(Arrays.asList(obj));
        System.out.println(arrayList);
        return arrayList;
    }

    public void changePosition() {
        T x = obj[0];
        obj[0] = obj[1];
        obj[1] = x;
        System.out.println(Arrays.toString(obj));
    }
}
