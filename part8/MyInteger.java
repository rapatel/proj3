public class MyInteger implements ExpFlat {

    protected int myint;

    MyInteger(int i) {
        this.myint = i;
    }

    public void expand(AList eList) {
        eList.ObjList.add(this);
    }

    public AList flatten() {
        AList eList = new AList();
        eList.ObjList.add(this);
        return eList;
    }

    public String toString() {
        return "" + myint;
    }
}