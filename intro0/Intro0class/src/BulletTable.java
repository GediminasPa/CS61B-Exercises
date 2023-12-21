public class BulletTable {
    public static void main(String[] args) {
        int i = 0;
        int linenumber = 5;
        int j = 0;
        while (i < linenumber) {
            i = i + 1;
            while (j < i) {
                System.out.printf("*");
                j = j + 1;
            }
            System.out.println();
            j = 0;
        }
    }
}
