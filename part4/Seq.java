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

    // ---------------
    // Methods
    // ---------------
    public static int getCount() {
        return Count;
    }
}
