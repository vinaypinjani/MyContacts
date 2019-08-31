package com.vinaypinjani;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Contacts> contacts = new ArrayList<Contacts>();
        MobilePhone mobilePhone = new MobilePhone("03363347380", contacts);
        welcomeScreen();
        boolean quit =  false;
        String userChoice;
        while (!quit) {
            System.out.println("Enter your choice: ");
            userChoice = scanner.next();
            switch (userChoice) {
                case "1":
                    System.out.println("Enter contact name: ");
                    String name = scanner.next();
                    System.out.println("Enter contact number: ");
                    String number = scanner.next();
                    mobilePhone.storeContact(new Contacts(name, number));
                    break;
                case "2":
                    System.out.println("Enter contact name to modify: ");
                    String prevName = scanner.next();
                    System.out.println("Enter updated contact number: ");
                    String newNumber = scanner.next();
                    mobilePhone.modifyContact(prevName, newNumber);
                    break;
                case "3":
                    System.out.println("Enter contact name to remove: ");
                    String removeName = scanner.next();
                    mobilePhone.removeContact(removeName);
                    break;
                case "4":
                    System.out.println("Enter contact name to search: ");
                    String searchName = scanner.next();
                    mobilePhone.searchContact(searchName);
                    break;
                case "5":
                    mobilePhone.printAll();
                    break;
                case "0":
                    quit = true;
                    break;
                case "6":
                    welcomeScreen();
                    break;
                default:
                    System.out.println("Enter valid number!");
            }
        }

    }

    public static void welcomeScreen() {
        System.out.println("Welcome!");
        System.out.println("Press 1 to store new contact");
        System.out.println("Press 2 to modify an existing contact");
        System.out.println("Press 3 to remove an existing contact");
        System.out.println("Press 4 to search for a contact");
        System.out.println("Press 5 to print all contacts");
        System.out.println("Press 6 to repeat menu");
        System.out.println("Press 0 to quit");
    }
}
