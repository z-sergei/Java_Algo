package Chapter_2_Sorting.ElementarySorts;

/**
 * Created by Sergei Zarochentsev on 07.10.2015.
 */
public class Shell extends Example {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;

        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }

            h = h / 3;
        }
    }

    public static void main(String[] args) {
        new Shell(){}.test();
    }
}
