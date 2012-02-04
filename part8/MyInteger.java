// Class for a "integer" object to be stored
// in the AList ArrayList

public class MyInteger implements ExpFlat {
    // memebers
    protected int myint;

    // constructor
    MyInteger(int i) {
        this.myint = i;
    }

    // methods
    public void expand(AList eList) {
        eList.ObjList.add(this);
    }

    // "flatten" integer and return as an AList
    public AList flatten() {
        AList eList = new AList();
        eList.ObjList.add(this);
        return eList;
    }

    public String toString() {
        return "" + myint;
    }
}