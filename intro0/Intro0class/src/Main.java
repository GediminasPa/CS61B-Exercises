public class Main{
    public static void drawTriangle(int N) {
        int i = 0; int j = 0;
        while (i < N) {
            i = i + 1;
            while (j < i) {
                System.out.printf("*");
                j = j + 1;
            }
            System.out.println();
            j = 0;
        }
    }

    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int i = 0;
        int max =0;
        while(i < m.length){
            if(m[i]>max){
                max = m[i];
            }
            i = i + 1;
        }
        return max;
    }
    /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m) {
        int max = 0;
        for(int i = 0; i < m.length; i = i +1){
            if(m[i]>max){
                max = m[i];
            }
        }
        return max;
    }

    public static void windowPosSum(int[] a, int n) {
        int[] atemp = new int[a.length];
        for(int i = 0; i < a.length; i = i + 1) {
            if(a[i] < 0) {
                atemp[i] = a[i];
                continue;
            }
            for(int j = i; j < n + i + 1; j = j + 1){
                if(j == a.length - 1) {
                    atemp[i] = atemp[i] + a[j];
                    break;
                }
                else {
                    atemp[i] = atemp[i] + a[j];
                }
            }
        }
        for(int k = 0; k < a.length; k = k + 1){
            a[k] = atemp[k];
        }
        System.out.println(java.util.Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));

        String[] b = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

        for (String s : b) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(s);
                if (s.contains("horse")) {
                    break;
                }
            }
        }
    }
}