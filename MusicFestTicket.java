package com.codegnan.arrays;

import java.util.Scanner;

public class MusicFestTicket {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input number of seats
        System.out.print("Enter number of seats: ");
        int n = scanner.nextInt();

        int[] tickets = new int[n];
        System.out.println("Enter ticket values for each seat:");
        for (int i = 0; i < n; i++) {
            tickets[i] = scanner.nextInt();
        }

        // Input number of rotation operations
        System.out.print("Enter number of rotations: ");
        int q = scanner.nextInt();

        for (int op = 1; op <= q; op++) {
            System.out.println("\nRotation " + op + ":");
            System.out.print("Enter range (L R): ");
            int L = scanner.nextInt();
            int R = scanner.nextInt();

            // Convert to 0-based indexing
            L--;
            R--;

            // Perform left rotation on the range [L, R]
            int first = tickets[L];
            for (int i = L; i < R; i++) {
                tickets[i] = tickets[i + 1];
            }
            tickets[R] = first;
        }

        // Display final ticket allocation
        System.out.println("\n--- Final Ticket Arrangement ---");
        for (int t : tickets) {
            System.out.print(t + " ");
        }
        System.out.println();

        scanner.close();
	}

}
