package com.weekofcode35;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Sharon wants to buy a laptop for programming. She plans on buying a laptop whose price is made of digits 4 and 7 only.
 * The number of 4s and 7s in the price should be equal.
 * You are given laptop brand names and their prices.
 * Find and print the name of the laptop brand that satisfies the above criteria.
 * If there are multiple brands that meet the criteria, print the name of the one with the minimum price.
 * If none of the laptops meet the criteria print -1.
 * If Sharon has a choice between laptops 'BestBook' priced at 444777 and 'LapBook' priced at 7744.
 * The solution should indicate ideal choice to be 'LapBook'.
 * Failing test case 4
 */

public class LuckyPurchase {
    // Constructs an empty HashMap with the default initial capacity (16) and the default load factor (0.75).
    private static Map<String, Integer> laptops = new HashMap<String, Integer>();

    public static void whichLaptopToChoose() {

        Iterator<Map.Entry<String, Integer>> itr = laptops.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<String, Integer> entry = itr.next();

            // get length of the integer
            int len = String.valueOf(entry.getValue()).length();

            // You can use the modulus operator, but that can be slow.
            // This is because the low bit will always be set on an odd number.
            if (len != 1 && (len & 1) == 0) {
                String priceStr = String.valueOf(entry.getValue());

                if (!is4Or7(priceStr)) {
                    itr.remove();
                }

                // number of 4s not equal to number of 7s
                if (appearNTimes(priceStr, '4') != appearNTimes(priceStr, '4')) {
                    itr.remove();
                }
            } else {
                // Does not have even number of digits
                itr.remove();
            }
        }

        if (laptops.size() > 0) {
            Map.Entry<String, Integer> min = null;
            for (Map.Entry<String, Integer> entry : laptops.entrySet()) {
                if (min == null || min.getValue() > entry.getValue()) {
                    min = entry;
                }
            }
            System.out.println(min.getKey().trim());
        } else {
            System.out.println("-1");
        }
    }

    public static long appearNTimes(String str, char c) {
        return str.chars().filter(num -> num == c).count();
    }

    public static boolean is4Or7(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if (c == '7' || c == '4') {
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        // Sample input
        laptops.put("HackerBook", 4477);
        laptops.put("RankBook", 4747);
        laptops.put("TheBook", 777);
        laptops.put("BestBook", 407);
        laptops.put("BestBookf", 47);
        laptops.put("BestBookr", 047);
        laptops.put("abacab", -1);

        whichLaptopToChoose();
    }
}
