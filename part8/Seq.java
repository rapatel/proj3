// the Seq base class

public abstract class Seq implements ExpFlat {

    // members
    protected static int Count = 0;

    public Seq() {
        Count++;
    }

    // ----------------------
    // Abstract Methods
    // ----------------------
    public abstract int upperBound();

    public abstract SeqIt createSeqIt();

    // ---------------
    // Methods
    // ---------------
    public static int getCount() {
        return Count;
    }

    public void expand(AList eList) {
        SeqIt it = this.createSeqIt();
        while (it.hasNext()) {
            eList.ObjList.add(new MyInteger(it.next()));
        }
    }

    public AList flatten() {
        AList eList = new AList();
        eList.ObjList.add(this);
        return eList;
    }
}
