package com.codegnan.arrays;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input number of books
        System.out.print("Enter number of books: ");
        int n = scanner.nextInt();

        int[] fines = new int[n];
        System.out.println("Enter daily fines for each book:");
        for (int i = 0; i < n; i++) {
            fines[i] = scanner.nextInt();
        }

        // Input threshold limit
        System.out.print("Enter fine threshold (T): ");
        int threshold = scanner.nextInt();

        // Input number of queries
        System.out.print("Enter number of fine range queries: ");
        int q = scanner.nextInt();

        System.out.println("\n--- Total Fine Calculations ---");
        for (int query = 1; query <= q; query++) {
            System.out.print("Enter range (L R): ");
            int L = scanner.nextInt();
            int R = scanner.nextInt();

            // Adjust for 0-based indexing
            L--;
            R--;

            int totalFine = 0;
            for (int i = L; i <= R; i++) {
                totalFine += fines[i];
            }

            // Apply threshold cap
            if (totalFine > threshold) {
                totalFine = threshold;
            }

            System.out.println("Query " + query + ": Total Fine = " + totalFine);
        }

        scanner.close();
	}

}
