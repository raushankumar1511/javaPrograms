import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (i <= n) {
            sum = sum + i;
            i +=1;
        }
        System.out.println(sum);
    s.close();
    }
}
