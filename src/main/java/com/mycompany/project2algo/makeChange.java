package com.mycompany.project2algo;

/**
 * This class contains the algorithms for BottomUp, Recursive with Memoization and Recursive without Memoization.
 *
 * @author Roni Ebenezer, Jonique Chan
 * @version 1.0
 * File: makeChange.java
 * Created: Oct 2024
 * ©Copyright Cedarville University, its Computer Science faculty, 
 * and the authors. All rights reserved.
 *
 * Description: 
 */

public class makeChange {

    private static void printResults(int[] result, int amount, int[] coins) {
        System.out.print(amount + " cents =");
        for (int i = coins.length - 1; i >= 0; i--){
            if(result[i] != 0){
                System.out.print(" " + coins[i] + ":" + result[i]);
            }
        }
    }

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
        int[] result = dp[amount].getCoins();
        printResults(result, amount, coins);
    }

    // overloaded func
    public static void Recursive(int amount, int[] coins, boolean memo) {
        CoinPurse resultCoinPurse;
        // recursive with memoization
        if (memo == true) {
            // cache array
            CoinPurse[] cache = new CoinPurse[amount + 1];
            resultCoinPurse = Recursive(amount, coins, cache);
        } else {
            // recursive without memoization
        resultCoinPurse = RecursiveNonMemo(amount, coins);
        }
    
        // print results
        int[] result = resultCoinPurse.getCoins();
        printResults(result, amount, coins);
    }

    private static CoinPurse Recursive(int amount, int[] coins, CoinPurse[] cache) {
        // base case
        if (amount == 0) {
            return new CoinPurse(coins.length);
        }
        // if lesser = impossible
        if (amount < 0) {
            return null;
        }
    
        // check if problem has been solved alr
        if (cache[amount] != null) {
            return cache[amount];
        }
        
        CoinPurse bestCoinPurse = null;
        int bestTotal = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            if (amount >= coins[i]) {
                int newAmount = amount - coins[i];
                // find bestTotal for remaining amounts
                CoinPurse subCoin = Recursive(newAmount, coins, cache);
                // inc total number of coins needed to make curr amount
                if (subCoin != null && subCoin.getTotalCoins() + 1 < bestTotal) {
                    bestTotal = subCoin.getTotalCoins() + 1;
                    // clone coin purse
                    bestCoinPurse = new CoinPurse(coins.length);
                    bestCoinPurse.setCoins(subCoin.getCoins());
                    bestCoinPurse.addCoin(i);
                    bestCoinPurse.setTotalCoins(bestTotal);
                }
            }
        }

        cache[amount] = bestCoinPurse;
        return bestCoinPurse;
    }

    public static CoinPurse RecursiveNonMemo(int amount, int[] coins) {
        
        // base case
        if (amount == 0) {
            return new CoinPurse(coins.length);
        }

        // if lesser = impossible
        if (amount < 0) {
            return null;
        }
        
        CoinPurse bestCoinPurse = null;
        int bestTotal = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            if (amount >= coins[i]) {
                int newAmount = amount - coins[i];
                // find bestTotal for remaining amounts
                CoinPurse subCoin = RecursiveNonMemo(newAmount, coins);
                // inc total number of coins needed to make curr amount
                if (subCoin != null && subCoin.getTotalCoins() + 1 < bestTotal) {
                    bestTotal = subCoin.getTotalCoins() + 1;
                    bestCoinPurse = new CoinPurse(coins.length);
                    bestCoinPurse.setCoins(subCoin.getCoins());
                    bestCoinPurse.addCoin(i);
                    bestCoinPurse.setTotalCoins(bestTotal);
                }
            }
        }

        return bestCoinPurse;
    }
}
