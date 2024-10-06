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

    // TODO: create print function
    public static void main(String[] args) {
        
        /*
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
        
        */
        // print results <- testing for now
        int amt = 11;
        int[] coi = {1, 7};
        makeChange.BottomUp(amt, coi);

        /* for (int i = 0; i < CoinPurse.denom.length; i++) {
            System.out.println("coins used: " + CoinPurse.denom[i]);
        }
        */
        
    }
}
