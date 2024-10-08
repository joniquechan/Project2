package com.mycompany.project2algo;

import java.io.*;

public class Graph {
    public Graph() {
        int[] problems = new int[87];

        for (int i = 0; i < 87; i++) {
            problems[i] = i; 
        }

        int[] coins = {1, 7, 12};

        try {
            createCSV(graphRecursiveNonMemo(problems, coins));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String[] graphBottomUp(int[] problems, int[] coins) {
        String[] list = new String[problems.length];
        for (int i = 1; i < problems.length; i++) {
            long startTime = System.nanoTime();
            makeChange.BottomUp(i, coins);
            long endTime = System.nanoTime();
            list[i - 1] = Long.toString(endTime - startTime);
        }
        return list;
    }

    private static String[] graphRecursive(int[] problems, int[] coins) {
        String[] list = new String[problems.length];
        for (int i = 1; i < problems.length; i++) {
            long startTime = System.nanoTime();
            makeChange.Recursive(i, coins, true);
            long endTime = System.nanoTime();
            list[i - 1] = Long.toString(endTime - startTime);
        }
        return list;
    }

    private static String[] graphRecursiveNonMemo(int[] problems, int[] coins) {
        String[] list = new String[problems.length];
        for (int i = 1; i < problems.length; i++) {
            long startTime = System.nanoTime();
            makeChange.Recursive(i, coins, false);
            long endTime = System.nanoTime();
            list[i - 1] = Long.toString(endTime - startTime);
        }
        return list;
    }

    public static void createCSV(String[] list) throws IOException {
        FileWriter writer = new FileWriter("data.csv");
        BufferedWriter bw = new BufferedWriter(writer);
        for (int i = 1; i < list.length; i++) {
            bw.write(i + ", " + list[i -1]);
            bw.newLine();
        }
        bw.close();
    }

}
