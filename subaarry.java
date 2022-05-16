import java.util.Arrays;

public class subaarry {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        sub_array(arr);
        System.out.println("__________");
        sumss(arr);
        System.out.println("__________");
        maxsumss(arr);
    }

    public static void sub_array(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i; j <= arr.length - 1; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }

    public static void sumss(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int sum = 0;
            for (int j = i; j <= arr.length - 1; j++) {
                sum += arr[j];
                System.out.println(sum);
            }
        }

    }

    public static void maxsumss(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            int sum = 0;
            for (int j = i; j <= arr.length - 1; j++) {
                sum += arr[j];
                if (sum > max)
                    max = sum;
            }
        }
        System.out.println(max);
    }
}
