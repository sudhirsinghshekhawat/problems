package com.eductive.grokking75.warmingup;

/**
 * Add two binary String
 */
public class AddBinary {
    public static String addBinary(String str1, String str2) {
        if (str1 == null)
            return str2;
        if (str2 == null)
            return str1;

        var ptr1 = str1.length() - 1;
        var ptr2 = str2.length() - 1;

        StringBuilder result = new StringBuilder();

        var carry = 0;
        while (ptr1 >= 0 || ptr2 >= 0) {
            var digit1 = (ptr1 >= 0) ? Character.getNumericValue(str1.charAt(ptr1)) : 0;
            var digit2 = (ptr2 >= 0) ? Character.getNumericValue(str2.charAt(ptr2)) : 0;
            var totalSum = digit1 + digit2 + carry;
            var currentDigit = totalSum % 2;
            carry = totalSum / 2;
            result.append(currentDigit);
            ptr1--;
            ptr2--;
        }

        if (carry != 0)
            result.append(carry);
        return result.reverse().toString();
    }
}
