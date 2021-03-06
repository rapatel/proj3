import java.util.ArrayList;

public class AList implements ExpFlat {
    // ArrayList can only hold objects of classes
    // that implement ExpFlat
    protected ArrayList<ExpFlat> ObjList;

    // Constructor
    public AList() {
        this.ObjList = new ArrayList<ExpFlat>();
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
        ObjList.add(new MyInteger(i));
    }

    // expands lists (Seq, AList, Int)
    public AList expand() {
        AList eList = new AList();
        for (Object o : this.ObjList) {
            ((ExpFlat) o).expand(eList);
        }
        return eList;
    }

    // overloaded expand method
    public void expand(AList tList) {
        AList eList = new AList();
        for (Object o : this.ObjList) {
            ((ExpFlat) o).expand(eList);
        }
        tList.ObjList.add(eList);
    }

    // Flatten AList
    public AList flatten() {
        AList eList = new AList();
        for (Object o : this.ObjList) {
            AList tmp = ((ExpFlat) o).flatten();
            for (Object t : tmp.ObjList) {
                eList.ObjList.add((ExpFlat) t);
            }
        }
        return eList;
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