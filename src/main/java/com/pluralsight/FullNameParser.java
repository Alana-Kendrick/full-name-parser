package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();
        String[] nameList = fullName.split(" ");

        String firstName = nameList[0];
        String middleName = "";
        String lastName = "";

        if (nameList.length == 2) {
            middleName = "(none)";
            lastName = nameList[1];
        } else if (nameList.length == 3) {
            middleName = nameList[1];
            lastName = nameList[2];
        }
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: "+ middleName);
        System.out.println("Last name: " + lastName);

        scanner.close();
    }
}
