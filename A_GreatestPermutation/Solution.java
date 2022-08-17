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
            int k = sc.nextInt();
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                int p = sc.nextInt();
                if (i <= k && p > k) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
