package com.bridgelab;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {
<<<<<<< HEAD
    //main method executed
    public static void main(String[] args) {
        System.out.println("WELCOME IN ADDRESS BOOK PROGRAM");
        ArrayList<Contact_info> addContacts = new ArrayList<>();
        //Scanner userInput = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);


        int choice;
        while (true) {
            System.out.println("1: ADD");
            System.out.println("2: DISPLAY");

            System.out.println("ENTER YOUR CHOICE :");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.println("Enter Phone Number: ");
                    long phone = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Enter City: ");
                    String city = sc.nextLine();
                    System.out.println("Enter State: ");
                    String state = sc.nextLine();
                    System.out.println("Enter Zip Pin: ");
                    int zip = sc.nextInt();
                    addContacts.add(new Contact_info(name, email, phone, city, state, zip));
                    break;
                case 2:
                    Iterator<Contact_info> display = addContacts.iterator();
                    while (display.hasNext()) {
                        Contact_info show = display.next();
                        System.out.println(show);
                    }
                    break;
            }
        }
    }
}

=======
     //main method executed
    public static void main(String[] args) {
        System.out.println("WELCOME IN ADDRESS BOOK PROGRAM");
        System.out.println("Add new contact details to Address_Book");
        // By creating object we are Calling Contact from Contact_info
        Contact_info contact_info = new Contact_info();

        Scanner sc = new Scanner(System.in);
        //taking input from user through Scanner
        System.out.println("Enter Name: ");
        contact_info.setName(sc.nextLine());
        System.out.println("Enter Email: ");
        contact_info.setEmail(sc.nextLine());
        System.out.println("Enter Phone Number: ");
        contact_info.setPhoneNumber(sc.nextLong());
        System.out.println("Enter City: ");
        contact_info.setCity(sc.nextLine());
        System.out.println("Enter State: ");
        contact_info.setState(sc.nextLine());
        System.out.println("Enter Zip Pin: ");
        contact_info.setZip(sc.nextInt());
        
        //Displaying the details of user
        System.out.println(" First Name: "+contact_info.getName()+
                "\n Email-id: "+contact_info.getEmail()+
                "\n Phone Number: "+contact_info.getPhoneNumber()+
                "\n City: "+contact_info.getCity()+
                "\n State: "+contact_info.getState()+
                "\n Zip-Pin: "+contact_info.getZip());

    }
}
>>>>>>> 0ffd8bf0165b98b8e1a834b02f57721164c2a4b9
