import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (System.getProperty("ONLINE_JUDGE") == null) {
            try {
                System.setOut(new PrintStream(new FileOutputStream("output.txt")));
                sc = new Scanner(new File("input.txt"));
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

        // Your Code Starts Here
        int count = sc.nextInt();
        while (count-- > 0) {
            int n = sc.nextInt();
            // int k = sc.nextInt();
            long sum = 0;
            int max = 0;
            int k = 0;
            long ans;
            for (int i = 1; i <= n; i++) {
                int a = sc.nextInt();
                while (a % 2 == 0) {
                    k++;
                    a /= 2;
                }
                max = Math.max(a, max);
                sum += a;
            }
            sum = sum - max;
            ans = (long) Math.pow(2, k) * max + sum;
            System.out.println(ans);
        }
        sc.close();
    }
}
