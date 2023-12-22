/** Class that prints the Collatz sequence starting from a given number.
 *  @author Gediminas Pazera
 */
public class Collatz {

    /** Given a number n in the Collatz sequence, outputs the next number  */
    public static int nextNumber(int n) {
        if (n % 2 == 0) {
            return n/2;
        } else {
            return 3*n + 1;
        }
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

