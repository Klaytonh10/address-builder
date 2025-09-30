package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        //Name
        System.out.println("First name: ");
        String firstName = scanner.nextLine().trim() + " ";
        System.out.println("Last name: ");
        String lastName = scanner.nextLine() + "\n";

        String fullName = firstName + lastName;
        stringBuilder.append("Full name: ");
        stringBuilder.append(fullName);
        stringBuilder.append("\n");

        //Billing street
        System.out.println("Billing street: ");
        String billStreet = scanner.nextLine() + "\n";
        System.out.println("Billing city: ");
        String billCity = scanner.nextLine().trim() + ", ";
        System.out.println("Billing state: ");
        String billState = scanner.nextLine().trim().toUpperCase() + " ";
        System.out.println("Billing zip: ");
        String billZip = scanner.nextLine().trim() + "\n";

        stringBuilder.append("Billing Address: ");
        stringBuilder.append(billStreet);
        stringBuilder.append(billCity);
        stringBuilder.append(billState);
        stringBuilder.append(billZip);

        //Shipping street
        System.out.println("Shipping street: ");
        String shipStreet = scanner.nextLine() + "\n";
        System.out.println("Shipping city: ");
        String shipCity = scanner.nextLine().trim() + ", ";
        System.out.println("Shipping state: ");
        String shipState = scanner.nextLine().trim().toUpperCase() + " ";
        System.out.println("Shipping zip: ");
        String shipZip = scanner.nextLine().trim() + "\n";

        stringBuilder.append("Billing Address: ");
        stringBuilder.append(shipStreet);
        stringBuilder.append(shipCity);
        stringBuilder.append(shipState);
        stringBuilder.append(shipZip);


        System.out.println(stringBuilder);
    }
}
