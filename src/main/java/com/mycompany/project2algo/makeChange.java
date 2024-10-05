package com.mycompany.project2algo;

public class makeChange {
    public static void BottomUp(int amount, int[]coins) {
        // make array to store
        int[] dp = new int[amount + 1];
        int[] lastCoinUsed = new int[amount + 1];

        // base case
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    if (dp[i] > dp[i - coins[j]] + 1) {
                        dp[i] = dp[i -coins[j]] + 1;
                        lastCoinUsed[i] = coins[j];
                    }
                }
            }

        }
        CoinPurse.total = dp[amount];
        CoinPurse.denom = lastCoinUsed[amount];
        CoinPurse.lastCoin = dp[amount];
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
