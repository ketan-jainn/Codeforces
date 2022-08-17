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
            int p = sc.nextInt();
            System.out.println(String.format("2 %s", p - 1));

        }
        sc.close();
    }
}
