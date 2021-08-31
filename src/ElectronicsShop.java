import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ElectronicsShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = 0, sum = 0;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                sum  = keyboards[i] + drives[j];

                if (sum >= max && sum <= b){
                    max = sum;

                }
            }
        }

        if (max == 0) return -1;
        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        int n = scanner.nextInt();

        int m = scanner.nextInt();

        int[] keyboards = new int[n];

        for (int i = 0; i < n; i++) {
            keyboards[i] = scanner.nextInt();
        }

        int[] drives = new int[m];

        for (int i = 0; i < m; i++) {
            drives[i] = scanner.nextInt();
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);

        System.out.println(String.valueOf(moneySpent));
        scanner.close();
    }
}
