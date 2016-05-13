/**
 * Created by Зая on 09.05.2016.
 */
public class Selection {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++)
                if (Example.less(a[j], a[min]))
                    min = j;
            Example.exch(a, i, min);


        }
    }
}
