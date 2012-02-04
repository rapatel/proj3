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

    // expands an AList recursively
    public AList expand() {
        AList eList = new AList();
        for (Object o : this.ObjList) {
            if (o instanceof Seq) {
                SeqIt it = ((Seq) o).createSeqIt();
                while (it.hasNext()) {
                    eList.ObjList.add(new Integer(it.next()));
                }
            } else if (o instanceof AList) {
                eList.ObjList.add(((AList) o).expand());
            } else {
                eList.ObjList.add(o);
            }
        }
        return eList;
    }

    // flatten AList recursively
    public AList flatten() {
        AList eList = new AList();

        for (Object o : this.ObjList) {
            if (o instanceof AList) {
                AList tList = ((AList) o).flatten();
                for (Object t : tList.ObjList) {
                    eList.ObjList.add(t);
                }
            } else {
                eList.ObjList.add(o);
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