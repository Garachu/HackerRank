package com.emailed.substring;

import java.util.Scanner;

/**
 * Created by meg on 7/30/17.
 */
public class Solution {

    public static void solution(){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));


    }
}
