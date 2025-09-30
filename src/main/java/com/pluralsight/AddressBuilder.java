package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        //Name
        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim() + " ";
        System.out.print("Last name: ");
        String lastName = scanner.nextLine() + "\n";

        String fullName = firstName + lastName;
        stringBuilder.append("\n");
        stringBuilder.append(fullName);
        stringBuilder.append("\n");

        //Billing street
        System.out.print("Billing street: ");
        String billStreet = scanner.nextLine() + "\n";
        System.out.print("Billing city: ");
        String billCity = scanner.nextLine().trim() + ", ";
        System.out.print("Billing state: ");
        String billState = scanner.nextLine().trim().toUpperCase() + " ";
        System.out.print("Billing zip: ");
        String billZip = scanner.nextLine().trim() + "\n\n";

        stringBuilder.append("Billing Address: \n");
        stringBuilder.append(billStreet);
        stringBuilder.append(billCity);
        stringBuilder.append(billState);
        stringBuilder.append(billZip);

        //Shipping street
        System.out.print("Shipping street: ");
        String shipStreet = scanner.nextLine() + "\n";
        System.out.print("Shipping city: ");
        String shipCity = scanner.nextLine().trim() + ", ";
        System.out.print("Shipping state: ");
        String shipState = scanner.nextLine().trim().toUpperCase() + " ";
        System.out.print("Shipping zip: ");
        String shipZip = scanner.nextLine().trim() + "\n\n";

        stringBuilder.append("Shipping Address: \n");
        stringBuilder.append(shipStreet);
        stringBuilder.append(shipCity);
        stringBuilder.append(shipState);
        stringBuilder.append(shipZip);


        System.out.println(stringBuilder);
    }
}
