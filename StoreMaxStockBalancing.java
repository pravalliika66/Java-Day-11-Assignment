package com.codegnan.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StoreMaxStockBalancing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();

        int[] stock = new int[n];
        System.out.println("Enter stock levels for each item:");
        for (int i = 0; i < n; i++) {
            stock[i] = scanner.nextInt();
        }
        System.out.print("Enter number of balancing operations: ");
        int m = scanner.nextInt();

        for (int op = 1; op <= m; op++) {
            System.out.println("\nOperation " + op + ":");
            System.out.print("Enter range (L R): ");
            int L = scanner.nextInt();
            int R = scanner.nextInt();

            // Convert to 0-based indices
            L--;
            R--;

            int[] range = Arrays.copyOfRange(stock, L, R + 1);
            Arrays.sort(range);

            int len = range.length;
            int median = range[(len - 1) / 2]; 

            for (int i = L; i <= R; i++) {
                stock[i] = median;
            }
        }

        // Display final stock levels
        System.out.println("\n--- Final Stock Levels ---");
        for (int val : stock) {
            System.out.print(val + " ");
        }
        System.out.println();

        scanner.close();
	}

}
