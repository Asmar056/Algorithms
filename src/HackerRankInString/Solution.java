package HackerRankInString;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


    public static String hackerrankInString(String s) {
        // Write your code here
        String hackerrank = "hackerrank";
        if (s.length() < hackerrank.length()){
            return "NO";
        }
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c < hackerrank.length() && s.charAt(i) == hackerrank.charAt(c))
                c++;
        }

        return (c == hackerrank.length() ? "YES" : "NO");
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.hackerrankInString(s);

                System.out.println(result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

