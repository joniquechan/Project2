package com.mycompany.project2algo;

import java.util.Arrays;

public class makeChange {
    public static void BottomUp(int amount, int[]coins) {
        // make array to store min number of coins, dp[0]...dp[amount]
        int[] dp = new int[amount + 1];
        // track which coin was last used to make the amount
        int[] lastCoinUsed = new int[amount + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        
        // base case
        dp[0] = 0;
        // check if coin can be used to make curr amount starting from 1
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                // check if non-negative and no valid solution yet
                if (coins[j] <= i && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    if (dp[i] > dp[i - coins[j]] + 1) {
                        dp[i] = dp[i -coins[j]] + 1;
                        lastCoinUsed[i] = coins[j];
                    }
                }
            }
        }

        // fix thiss
        for (int i = 0; i < lastCoinUsed.length; i++) {
            if (lastCoinUsed[i] == 1) {
                CoinPurse.denom[i]++;
            }
        }
        
    }

    public static int Recursive(int amount) {
        int result = amount;
        // int bestTotal = 1000000000;
        // for k
        // k = n - denom;
        // best subchild
        // clone purse
        return result;
    }

    public static int Memoization(int amount) {
        int result = amount;
        return result;
    }
}
