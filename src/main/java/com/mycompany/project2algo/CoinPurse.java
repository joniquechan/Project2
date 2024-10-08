package com.mycompany.project2algo;

import java.util.Arrays;

/**
 * This class contains the CoinPurse object.
 *
 * @author Roni Ebenezer, Jonique Chan
 * @version 1.0
 * File: CoinPurse.java
 * Created: Oct 2024
 * ©Copyright Cedarville University, its Computer Science faculty, 
 * and the authors. All rights reserved.
 *
 * Description: This class contains a constructor that creates an array of coins with the value 0 and initializes the total amount of coins to a large value.
 * It also contains a helper function that adds coins, two setters, and two getters. 
 */

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
