package com.company;

import java.util.Scanner;

public class Main {
    public static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static char[] encoded = {'t', 'c', 'd', 'o', 'p', 'y', 'g', 'e', 'f', 'o', 'p', 'a', 'm',
            'p', 'l', 'p', 'q', 's', 't', 'e', 'f', 'v', 'w', 'x', 'y', 'z'};

    public static Scanner scanner = new Scanner(System.in);
    // kelajak - ppatotp

    public static void main(String[] args) {
        System.out.print("So'zni kiriting: ");
        String word = scanner.next();
        System.out.println(encode(word));
    }

    public static String encode(String text) {
        StringBuilder builder = new StringBuilder();

        for (char c : text.toCharArray()) {
            int index = getIndex(c, alphabet);
            builder.append(encoded[index]);
        }
        return builder.toString();
    }

    public static int getIndex(char c, char[] charArr) {
        for (int i = 0; i < charArr.length; ++i) {
            if (charArr[i] == c) {
                return i;
            }
        }
        return -1;
    }

}
