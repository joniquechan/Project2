/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project2algo;
import java.util.*;

/**
 * This class is the main file.
 *
 * @author Roni Ebenezer, Jonique Chan
 * @version 1.0
 * File: Project2Algo.java
 * Created: Oct 2024
 * ©Copyright Cedarville University, its Computer Science faculty, 
 * and the authors. All rights reserved.
 *
 * Description: This class is the main file that reads the input in and initializes the problems and corresponding solutions. 
 */

public class Project2Algo {

    public static void main(String[] args) {
        
        System.out.println("input:");
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

        sc.close();
        
        // print results
        for (int i = 0; i < k; i++) {
            makeChange.BottomUp(problems[i], coinDenoms);
            System.out.println("\n");
        }

        // testings
        /* 
        int amt = 11;
        int[] coi = {1, 2, 5};
        System.out.println("Bottom Up: " );
        makeChange.BottomUp(amt, coi);
        System.out.println("\nRecursive with Memoization: ");
        // true = memo, false = no memo
        makeChange.Recursive(amt, coi, true);
        System.out.println("\nRecursive without Memoization: ");
        makeChange.Recursive(amt, coi, false);
        */
        
    }
}
