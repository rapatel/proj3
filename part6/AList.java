import java.util.ArrayList;

public class AList {
    // members
    protected ArrayList<Object> ObjList;

    // Constructor
    public AList() {
        this.ObjList = new ArrayList<Object>();
    }

    // ----------
    // Methods
    // ----------

    public void add(Seq s) {
        ObjList.add(s);
    }

    public void add(AList a) {
        ObjList.add(a);
    }

    public void add(int i) {
        ObjList.add(new Integer(i));
    }

    public String toString() {
        boolean isEmpty = true;
        String myStr = "[ ";
        for (Object o : ObjList) {
            myStr += o + " ";
            isEmpty = false;
        }
        if (isEmpty) {
            myStr += " ]";
        } else {
            myStr += "]";
        }
        return myStr;
    }
}