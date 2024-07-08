package com.zipcodewilmington.assessment1.part1;

import com.zipcodewilmington.assessment1.part2.StringUtils;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String result = str.substring(0, 1).toUpperCase() + str.substring(1);
        return result;
//        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String result = new StringBuilder(str).reverse().toString();
        return result;
//        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        String result = reverse.substring(0, 1).toUpperCase() + reverse.substring(1);
        return result;
//        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String answer = str.substring(1, str.length()-1);
        return answer;
//        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++){
            char c = chars[i];
            if (Character.isUpperCase(c)){
                chars[i] = Character.toLowerCase(c);
            }else if (Character.isLowerCase(c)){
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);

//        int length = str.length();
//
//        for (int i = 0; i < length; i++){
//            Character c = str.charAt(i);
//            if (Character.isLowerCase(c))
//                str.replace(i, i + 1, Character.toUpperCase(c) + "");
//            else
//        }
//        return null;
    }
}
