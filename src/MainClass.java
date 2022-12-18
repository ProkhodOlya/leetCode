import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int[] array = {45, 1, 92, 3, 100, 22, 5, 6, 57, 8, 11};
        inverseArray(array);
    }

    private static void inverseArray(int[] array) {
        int x;
        for (int i = 0; i < array.length / 2; i++) {
            x = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = x;
        }
        System.out.println(Arrays.toString(array));
    }
}
