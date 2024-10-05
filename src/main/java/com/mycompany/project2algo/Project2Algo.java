/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project2algo;
import java.util.*;

/**
 *
 * @author User
 */
public class Project2Algo {

    public static void main(String[] args) {

        System.out.println("input:");
        // get input
        Scanner sc = new Scanner(System.in);
        
        // denominations
        int n = sc.nextInt();
        int[] coinDenoms = new int[n];
        for (int i = 0; i < n; i++) {
            coinDenoms[i] = sc.nextInt();
        }

        // problems
        int k = sc.nextInt();
        int[] problems = new int[k];
        for (int i = 0; i < k; i ++) {
            problems[i] = sc.nextInt();
        }

        // check if parse is correct or nah
        System.out.println(Arrays.toString(coinDenoms));
        System.out.println(Arrays.toString(problems));
        sc.close();

        // print results
        // for loop to call
        /* for (int i = 0; i < problems.length; i++) {
            makeChange.BottomUp(problems[i], coinDenoms);
            System.out.println(problems[i] + " cents = " + CoinPurse.denom +":" + CoinPurse.lastCoin);
        }
        */
        
    }
}
