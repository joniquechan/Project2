package com.mycompany.project2algo;

import java.util.Arrays;

/**
 * This class contains the CoinPurse object that represents the optimal solution to making change for an amount.
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
    // coins needed to make target amount
    private int totalCoins;
    // array to keep count of coin denomination
    private int[] coinTracker;
    
    // constructor that initializes the coinTracker array to 0 and total coins to a large value
    public CoinPurse(int numCoins) {
        coinTracker = new int[numCoins];
        Arrays.fill(coinTracker, 0);
        totalCoins = Integer.MAX_VALUE;
    }

    // method to adds coin to the index of the coinTracker
    public void addCoin(int index){
        coinTracker[index] = coinTracker[index] + 1;
    }

    // method to set total number of coins needed to make the target amount
    public void setTotalCoins(int total){
        totalCoins = total;
    }

    // method to return total number of coins used currently
    public int getTotalCoins(){
        return totalCoins;
    }

    // method to return coinTracker array
    public int[] getCoins(){
        return coinTracker;
    }

    // method to set coinTracker by copying contents of an array
    public void setCoins(int[] c){
        coinTracker = c.clone();
    }
}
