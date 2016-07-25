import java.util.Arrays;

/**
 * Created by on 25.06.2016.
 */
public class Insertion implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Insertion  sort");
        System.out.println("Before:\t" + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            for (int j=i;j>0 && (arr[j]<arr[j-1]);j--){
                swap(arr,j,j-1);
            }
        }
        System.out.println("After:\t" + Arrays.toString(arr));
    }
}
