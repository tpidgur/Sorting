import java.util.Arrays;

/**
 * Created by  on 09.05.2016.
 */
public class Selection implements Sorting {

    public void sort(int[] arr) {
        System.out.println("Selection sort");
        System.out.println("Before:\t" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            swap(arr,min,i);
        }
        System.out.println("After:\t" + Arrays.toString(arr));
    }
}
