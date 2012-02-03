public class Fib extends Seq {

    // members
    protected int first1, first2, last;
    protected static int Count = 0;

    // constructor
    public Fib(int first1, int first2, int last) {
        this.first1 = first1;
        this.first2 = first2;
        this.last = last;

        Count++;
    }

    // ---------------
    // Methods
    // ---------------

    // find upper bound
    public int upperBound() {
        return last;
    }

    // return the number of instances
    public static int getCount() {
        return Count;
    }

    // return FibIt object
    public SeqIt createSeqIt() {
        return (SeqIt) new FibIt(this);
    }

    // returns string
    public String toString() {
        return "< " + first1 + ", " + first2 + " to " + last + " >";
    }
}