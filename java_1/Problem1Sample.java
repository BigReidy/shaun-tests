import java.util.Arrays;

public class Problem1Sample {
    public static void main(String[] args) {

        int[] original = { 5, 71, 13, 9, 4, 5};

        System.out.println(Arrays.toString(original));
        int[] result = Problem1.orderAndDeDupJSONArray(original);
        System.out.println(Arrays.toString(result));
    }
}
