public class For extends Seq {

    // members
    protected int first, last, step;

    // constructor
    public For(int first, int last, int step) {
        this.first = first;
        this.last = last;
        this.step = step;
    }

    // returns string
    public String toString() {
        return "{ " + first + " to " + last + " by " + step + " }";
    }
}