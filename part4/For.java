public class For extends Seq {

    // members
    protected int first, last, step;
    protected static int Count = 0;

    // constructor
    public For(int first, int last, int step) {
        this.first = first;
        this.last = last;
        this.step = step;

        Count++;
    }

    // ---------------
    // Methods
    // ---------------

    // find upper bound
    public int upperBound() {
        return (step > 0) ? last : first;
    }

    // return the number of instances
    public static int getCount() {
        return Count;
    }

    // returns string
    public String toString() {
        return "{ " + first + " to " + last + " by " + step + " }";
    }
}