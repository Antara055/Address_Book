package com.bridgelab;

import java.util.ArrayList;
import java.util.Scanner;
/*@ArrayList has used to save the data
/@iterator class used to get the content from the object one by one
*/
public class AddressBook {
    //main method executed
    public static void main(String[] args) {
        //System.out.println("WELCOME IN ADDRESS BOOK PROGRAM");
        String firstName=null;
        String lastName=null;
        String email=null;
        long phone_no=0;
        String city=null;
        String state=null;
        int zip=0;
        Contact_info contact_info=new Contact_info(firstName, lastName, email, phone_no,city, state, zip);
        ArrayList<Contact_info> contactsAdd=new ArrayList<>();

        Scanner userInput=new Scanner(System.in);


        int choice;
        while (true) {
            System.out.println("1: ADD");
            System.out.println("2: DISPLAY");
            System.out.println("3:EDIT");
            System.out.println("4:DELETE");

            System.out.println("ENTER YOUR CHOICE :");
            choice = userInput.nextInt();
            //switch statements are used to choose a perticular oparation
            switch (choice) {
                case 1:
                    contact_info.addContact();
                    break;
                case 2:
                    contact_info.display();
                    break;
                case 3:
                    contact_info.edit();
                    break;
                case 4:
                    contact_info.delete();
                    break;
            }
        }
    }
}
