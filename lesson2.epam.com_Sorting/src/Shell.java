import java.util.Arrays;

/**
 * Created by on 25.06.2016.
 */
public class Shell implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Shell sort");
        System.out.println("Before:\t" + Arrays.toString(arr));
        int h;
        for (h = 1; h <= arr.length / 3; h = 3 * h + 1) ;
        while (h > 0) {
            for (int i = 0; i < arr.length; i++) {
                int key = arr[i];
                int j = i;
                while ((j > h - 1) && (arr[j - h] >= key)) {
                    arr[j] = arr[j - h];
                    j -= h;
                }
                arr[j] = key;
            }
            h /= 3;
        }
//        int N = arr.length;
//        int h = 1;
//        while (h < N / 3) {
//            h = 3 * h + 1;
//        }
//        while (h >= 1) {
//            for (int i = h; i < N; i++) {
//                for (int j = i; j >= h && (arr[j] < arr[j - h]); j -= h) {
//                    swap(arr, j, j - h);
//                }
//                h = h / 3;
//            }
//        }
        System.out.println("After:\t" + Arrays.toString(arr));
    }
}
