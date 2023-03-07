import java.util.Arrays;

public class Kata {
    public static int findEvenIndex(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int sumLeft = 0;
            for (int j = 0; j < i; j++) sumLeft += arr[j];
            int sumRight = 0;
            for (int j = i + 1; j < arr.length; j++) sumRight += arr[j];
            if (sumLeft == sumRight) return i;
        }
        return -1;
    }
}