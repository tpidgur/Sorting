import java.util.Arrays;

/**
 * Created by on 25.06.2016.
 */
public class Shaker implements Sorting {

    @Override
    public void sort(int[] arr) {
        System.out.println("Shaker sort");
        System.out.println("Before:\t" + Arrays.toString(arr));
        for (int k=arr.length-1;k>0;k--){
            boolean swapped=false;
            for (int i=k;i>0;i--){
                if (arr [i]<arr[i-1]){
                    swap(arr,i,i-1);
                    swapped=true;
                }
            }
            for (int i=0;i<k;i++){
                if (arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
        System.out.println("After:\t" + Arrays.toString(arr));
    }
}
