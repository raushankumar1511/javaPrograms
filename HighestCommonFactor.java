import java.util.Scanner;

public class HighestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 1;
        int hcf = 0;
        int small = a < b ? a : b;
        while (i <= small) {
            if ((a % i == 0) && (b % i == 0)) {
               
                hcf = i;
            }

            i = i + 1;
        }
        System.out.println(hcf);
        sc.close();
    }
}