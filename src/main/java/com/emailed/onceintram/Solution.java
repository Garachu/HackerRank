package com.emailed.onceintram;

/**
 * Created by meg on 11/11/17.
 */
public class Solution {
    static String onceInATram(int x) {
        // convert int to string
        String s = String.valueOf(x);

        // get first 3 integers
        String first3 = s.substring(0, 3);
        String last3 = s.substring(3);

        System.out.println("First 3: " + first3);
        System.out.println("Last 3: " + last3);

        // get sum of first 3 integers
        sum(first3);

        int t = Integer.parseInt(last3);
        last3 = String.valueOf(++t);

        System.out.println("First 3: " + first3);
        System.out.println("Last 3: " + last3);

        while (sum(first3) != sum(last3)) {
            int i = Integer.parseInt(last3);
            last3 = String.valueOf(++i);
        }

        return first3 + last3;
    }

    public static int sum(String str) {
        int sum = str.chars().map(Character::getNumericValue).sum();
        System.out.println("Sum: " + sum);
        return sum;
    }

    public static void solution() {
        //Scanner in = new Scanner(System.in);
        //int x = in.nextInt();
        String result = onceInATram(555555);
        System.out.println("Result: " + result);
    }
}
