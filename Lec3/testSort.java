import static org.junit.jupiter.api.Assertions.*;

public class testSort {

    /** Test the Sort.sort method */
    public static void testSort() {
        String[] input = {"i", "have", "an","egg"};
        String[] expected = {"an", "egg", "have", "i"};

        Sort.sort(input);
        assertArrayEquals(expected,input);
    }



    /** Test the Sort.findSmallest method */
    public static void testFindSmallest() {
        String[] input = {"i", "have", "an","egg"};
        int expected = 2;

        int actual = Sort.findSmallest(input,0);
        assertEquals(expected,actual);

        String[] input2 = {"there", "are", "many","pigs"};
        int expected2 = 2;

        int actual2 = Sort.findSmallest(input2,2);
        assertEquals(expected2,actual2);
    }

    /** Test the Sort.swap method*/
    public static void testSwap() {
        String[] input = {"i", "have", "an","egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an", "have", "i", "egg"};

        Sort.swap(input,a,b);
        assertArrayEquals(expected,input);
    }
    public static void main(String[] args) {
        testFindSmallest();
        testSwap();
        testSort();
    }
}
