import java.util.Arrays;

/**
 * Created by  on 30.06.2016.
 */
public class QuickSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Quick Sort");
        System.out.println("Before:\t" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After:\t" + Arrays.toString(arr));
    }

    public void quickSort(int[] arr, int low, int hi) {
        int index = partition(arr, low, hi);
        if (low < index - 1) {
            quickSort(arr, low, index - 1);
        }
        if (index < hi) {
            quickSort(arr, index, hi);
        }
    }

    public int partition(int[] arr, int low, int hi) {
        int pivot = arr[(low + hi) / 2];
        int i = low;
        int j = hi;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return i;
    }
}
