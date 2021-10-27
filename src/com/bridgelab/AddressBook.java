package com.bridgelab;

import java.util.Scanner;


public class AddressBook {

    public static void main(String[] args) {
        System.out.println("WELCOME IN ADDRESS BOOK PROGRAM");
        System.out.println("Add new contact details to Address_Book");
        Contact_info contact_info = new Contact_info();

        Scanner sc = new Scanner(System.in);

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

        System.out.println(" First Name: "+contact_info.getName()+
                "\n Email-id: "+contact_info.getEmail()+
                "\n Cell Num: "+contact_info.getPhoneNumber()+
                "\n City: "+contact_info.getCity()+
                "\n State: "+contact_info.getState()+
                "\n Pin: "+contact_info.getZip());

    }
}
