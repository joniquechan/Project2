package com.mycompany.project2algo;

import java.util.Arrays;

public class CoinPurse {
    // coins needed
    private int totalCoins;;
    private int[] coins;
    
    public CoinPurse(int numCoins) {
        coins = new int[numCoins];
        Arrays.fill(coins, 0);
        totalCoins = Integer.MAX_VALUE;
    }

    //adds coin to the index
    public void addCoin(int index){
        coins[index] = coins[index] + 1;
    }

    public void setTotalCoins(int total){
        totalCoins = total;
    }

    public int getTotalCoins(){
        return totalCoins;
    }

    public int[] getCoins(){
        return coins;
    }

    public void setCoins(int[] c){
        coins = c.clone();
    }
}
