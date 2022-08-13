import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static int distinct(String s) {
        HashSet<Character> ans = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            ans.add(s.charAt(i));

        }
        return ans.size();
    }

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
        // int count = sc.nextInt();
        // while (count-- > 0) {

        // }
        String s = sc.next();
        int result = distinct(s);
        if (result % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
