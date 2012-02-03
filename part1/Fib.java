public class Fib extends Seq {

    // members
    protected int first1, first2, last;

    // constructor
    public Fib(int first1, int first2, int last) {
        this.first1 = first1;
        this.first2 = first2;
        this.last = last;
    }

    // returns string
    public String toString() {
        return "< " + first1 + ", " + first2 + " to " + last + " >";
    }
}