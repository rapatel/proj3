// the Seq base class

public abstract class Seq {

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
}
