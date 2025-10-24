package com.codegnan.arrays;

import java.util.*;

public class AquavillewaterSystem {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter number of stations: ");
		        int n = scanner.nextInt();

		        int[] usage = new int[n];
		        System.out.println("Enter initial water usage for each station:");
		        for (int i = 0; i < n; i++) {
		            usage[i] = scanner.nextInt();
		        }
		        System.out.print("Enter number of maintenance operations: ");
		        int m = scanner.nextInt();

		        for (int op = 1; op <= m; op++) {
		            System.out.println("\nOperation " + op + ":");
		            System.out.print("Enter range (L R): ");
		            int L = scanner.nextInt();
		            int R = scanner.nextInt();
		            System.out.print("Enter adjustment value (can be negative or positive): ");
		            int value = scanner.nextInt();

		            // Convert to 0-based indexing
		            L--;
		            R--;

		            // Apply adjustment
		            for (int i = L; i <= R; i++) {
		                usage[i] += value;
		                if (usage[i] < 0) {
		                    usage[i] = 0; // reset to 0 if negative
		                }
		            }
		        }

		        // Display final water usage
		        System.out.println("\n--- Final Water Usage at All Stations ---");
		        for (int i = 0; i < n; i++) {
		            System.out.print(usage[i] + " ");
		        }
		        System.out.println();

		        scanner.close();
		    }
		

	}


