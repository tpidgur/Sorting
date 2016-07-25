/**
 * Created by  on 25.06.2016.
 */
public class Main2 {
    public static void main(String[] args) {
        StrategyClient c = new StrategyClient();
     //   int[] arr0 = {1, 3, 2, 1, 5, 6, 7, 8, 9, 11, 12, 10, 7, 5, 2};
        int[] arr0 = {5, 3, 4, 1, 2};
//        c.setStrategy(new Bubble());
//        c.executeStrategy(arr0);

//        c.setStrategy(new Shaker());
//        c.executeStrategy(arr0);

//        c.setStrategy(new Selection());
//        c.executeStrategy(arr0);

//        c.setStrategy(new Insertion());
//        c.executeStrategy(arr0);

//        c.setStrategy(new Shell());
//        c.executeStrategy(arr0);

        c.setStrategy(new QuickSort());
        c.executeStrategy(arr0);
    }
}
