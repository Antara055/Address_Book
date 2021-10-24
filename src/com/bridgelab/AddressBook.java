package com.bridgelab;

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {

    public static void main(String[] args){
        System.out.println("WELCOME IN ADDRESS BOOK PROGRAM");
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact_info> contacts=new ArrayList<Contact_info>();

        System.out.println("Add new contact details to Address_Book");

        System.out.println("Enter first-name : ");
        String firstname = sc.nextLine();

        System.out.println("Enter last-name : ");
        String lastname = sc.nextLine();

        System.out.println("Enter e-mail : ");
        String email = sc.nextLine();

        System.out.println("Enter Phone number : ");
        long phone = sc.nextLong();

        System.out.println("Enter city : ");
        String city = sc.nextLine();

        System.out.println("Enter state : ");
        String state = sc.nextLine();

        System.out.println("enter Zip-code : ");
        int zip = sc.nextInt();

        Contact_info contact=new Contact_info(firstname,lastname,email,phone,city,state,zip);
        System.out.println(contacts);
    }

}

