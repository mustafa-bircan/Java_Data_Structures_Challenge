package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static  boolean checkForPalindrome(String string) {
        if (string == null) return false;

        List<Character> list = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                ch = Character.toLowerCase(ch);
                list.add(ch);
            }
        }

        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String convertDecimalToBinary(int num) {
        if (num == 0) return "0";

        List<Integer> binaryList = new ArrayList<>();

        while (num > 0) {
            binaryList.add(num%2);
            num /= 2;
        }

        Collections.reverse(binaryList);
        List<String> binaryString = new ArrayList<>();
        for (int bit : binaryList) {
            binaryString.add(String.valueOf(bit));
        }
        return String.join("", binaryString);
    }
    public static void main(String[] args) {
    }

}