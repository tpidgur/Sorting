/**
 * Created by Зая on 09.05.2016.
 */
public class Bubble {
    public static void sort(Comparable[] data) {
        for (int barrier = data.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (Example.less(data[index + 1], data[index])) {
                    Comparable tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }
        }
    }
}
