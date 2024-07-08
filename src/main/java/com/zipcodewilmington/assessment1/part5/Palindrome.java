package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {
        int n = input.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            count++;
        }
        for (int i = 0; i < n - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                dp[i][i + 1] = true;
                count++;
            }
        }
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (input.charAt(i) == input.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    count++;
                }
            }
        }
        return count;
    }
}
//        return null;

