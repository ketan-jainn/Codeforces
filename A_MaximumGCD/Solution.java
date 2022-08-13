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
            System.out.println(n / 2);

        }
        sc.close();
    }
}
