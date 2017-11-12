package com.advanced.lambdaexpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by meg on 7/27/17.
 */


public class Solution {

    private static final int EVEN_ODD = 1;
    private static final int PRIME = 2;
    private static final int PALINDROME = 3;

    static Scanner scanner = new Scanner(System.in);


    public static void primeSolution() throws IOException{

        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }


//    public static void solution() {
//
//        System.out.println("Application Started");
//        int noTestCases = scanner.nextInt();
//        int condition;
//        int numberToCheck;
//
//        for (int i = 0; i < noTestCases; i++) {
//            condition = scanner
//                    .nextInt();
//            numberToCheck = scanner.nextInt();
//            System.out.println("Condition \t" + condition + "\t" + numberToCheck);
//            switch (condition) {
//                case EVEN_ODD:
//                    //System.out.println("EVEN_ODD");
//                    MyMath.checker(a -> {
//                        //This is because the low bit will always be set on an odd number.
//                        boolean yes = (a & 1) == 0;
//                        if (yes) {
//                            System.out.println("EVEN");
//                        } else {
//                            System.out.println("ODD");
//                        }
//                        return yes;
//                    }, numberToCheck);
//                    break;
//                case PRIME:
//                    //System.out.println("PRIME");
//                    MyMath.checker(a -> {
//                        boolean isPrime = isPrime(a);
//                        if (isPrime) {
//                            System.out.println("PRIME");
//                        } else {
//                            System.out.println("COMPOSITE");
//                        }
//                        return isPrime;
//                    }, numberToCheck);
//                    break;
//                case PALINDROME:
//                    MyMath.checker(a -> {
//                                boolean yes = isPalindrome(a);
//                                if (yes)
//                                    System.out.println("PALINDROME");
//                                return yes;
//                            }
//                            , numberToCheck);
//                    break;
//            }
//
//        }
//    }
//
//
//
//    public static boolean isPrime(int n) {
//        // fast even test.
//        if (n > 2 && (n & 1) == 0)
//            return false;
//        // only odd factors need to be tested up to n^0.5
//        for (int i = 3; i * i <= n; i += 2)
//            if (n % i == 0)
//                return false;
//        return true;
//    }
//
//    public static boolean isPalindrome(int x) {
//        if (x < 0)
//            return false;
//        int div = 1;
//        while (x / div >= 10) {
//            div *= 10;
//        }
//        while (x != 0) {
//            int l = x / div;
//            int r = x % 10;
//            if (l != r)
//                return false;
//            x = (x % div) / 10;
//            div /= 100;
//        }
//        return true;
//    }


}
