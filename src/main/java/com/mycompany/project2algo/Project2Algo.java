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
        
        sc.close();

        // 
    }
}
