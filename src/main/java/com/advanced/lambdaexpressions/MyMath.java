package com.advanced.lambdaexpressions;

/**
 * Created by meg on 7/27/17.
 */

class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation isPrime() {
        return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);
    }

    public static PerformOperation isPalindrome() {
        return (int a) -> Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
    }

    public PerformOperation isOdd() {
        return (int a) -> (a & 1) == 0;
    }


}