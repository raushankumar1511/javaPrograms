public class maxsumsubarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        kadanes(arr);
    }

    public static void kadanes(int[] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);
    }

}
