package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first and last name. You may also include your middle name. Name: ");
        String fullName = scanner.nextLine().trim();
    }
}
