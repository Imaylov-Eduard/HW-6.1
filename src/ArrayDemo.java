import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
