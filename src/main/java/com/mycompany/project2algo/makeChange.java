package com.mycompany.project2algo;

import java.util.Arrays;

// TO DO: printing results + how to update coin purse

public class makeChange {
    public static void BottomUp(int amount, int[]coins) {
        // make array to store min number of coins, dp[0]...dp[amount]
        CoinPurse[] dp = new CoinPurse[amount + 1];

        for(int i = 0; i <= amount; i++){
            dp[i] = new CoinPurse(coins.length);
        }
        
        // base case
        dp[0].setTotalCoins(0);
        // check if coin can be used to make curr amount starting from 1
        int bestCoin = 0;
        int curr;
        int prev;
        for (int i = 1; i <= amount; i++) {
            //check all coins
            for (int j = 0; j < coins.length; j++) {
                // check if non-negative
                if (coins[j] <= i) {
                    curr = dp[i].getTotalCoins();
                    prev = dp[i - coins[j]].getTotalCoins();
                    if (curr > prev + 1) {
                        dp[i].setTotalCoins(prev + 1);
                        bestCoin = j;
                    }
                }
            }
            dp[i].setCoins(dp[i - coins[bestCoin]].getCoins());
            dp[i].addCoin(bestCoin);
        }

        // test for now
        int[] result = dp[amount].getCoins();
        System.out.print(amount + " cents = ");
        for(int i = coins.length - 1; i >= 0; i--){
            if(result[i] != 0){
                System.out.print(coins[i] + ":" + result[i] + " ");
            }
        }
    }

    private static int Recursive(int amount, int[] coins, int[] cache) {
        // base case
        if (amount == 0) {
            return 0;
        }
        // if lesser = impossible
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }
    
        // check if problem has been solved alr
        if (cache[amount] != -1) {
            return cache[amount];
        }
        
        int bestTotal = Integer.MAX_VALUE;

        for (int c : coins) {
            if (amount >= c) {
                int newAmount = amount - c;
                // find bestTotal for remaining amounts
                int subCoin = Recursive(newAmount, coins, cache);
                // inc total number of coins needed to make curr amount
                if (subCoin != Integer.MAX_VALUE) {
                    bestTotal = Math.min(bestTotal, subCoin + 1);
                }
            }
        }

        cache[amount] = bestTotal;
        /* for (int i = 0; i < cache.length; i++) {
            System.out.println("cache: " + cache[i]);
        }
            */
        return bestTotal;
    }

    // overloaded func
    public static void Recursive(int amount, int[] coins) {
        // cache array
        int[] cache = new int[amount + 1];
        Arrays.fill(cache, -1);
        // call recursive
        int result = Recursive(amount, coins, cache);
        System.out.println("total coins: " + result);
    }

    public static void RecursiveNonMemo(int amount) {
        int result = amount;

    }
}
