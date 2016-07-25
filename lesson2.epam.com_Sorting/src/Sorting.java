/**
 * Created by  on 25.06.2016.
 */
public interface Sorting {
    void sort(int []arr);

    default void swap (int [] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
