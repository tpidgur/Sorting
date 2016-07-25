import java.util.Arrays;

/**
 * Created by  on 09.05.2016.
 */
public class Bubble implements Sorting {
    public  void sort(int [] arr) {
        System.out.println("Bubble sort");
        System.out.println("Before:\t" + Arrays.toString(arr));
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int i = 0; i < barrier; i++) {
                if (arr[i]>arr[i+1]) {
                    swap(arr,i+1,i);
                }
            }
        }
        System.out.println("After:\t" + Arrays.toString(arr));
    }
}
