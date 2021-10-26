package com.bridgelab;
import java.util.ArrayList;
import java.util.Scanner;
public class AddContact{
   String firstName, lastName,email,city, state;
   int zip; long phone;
    public void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first-name : ");
        String firstName=sc.next();

        System.out.println("Enter last-name : ");
        String lastName=sc.next();

        System.out.println("Enter E-mail : ");
        String email=sc.next();

        System.out.println("Enter Phone number :");
        long phone = sc.nextLong();

        System.out.println("Enter city : ");
        String city =sc.nextLine();

        System.out.println("Enter state : ");
        String state =sc.nextLine();

        System.out.println("enter Zip-code : ");
        int zip =sc.nextInt();
       Contact_info contact_info= new Contact_info(firstName,lastName,email,phone,city,state,zip);

    }

}