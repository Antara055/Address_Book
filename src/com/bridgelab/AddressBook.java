package com.bridgelab;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
/*@ArrayList has used to save the data
/@iterator class used to get the content from the object one by one
*/
public class AddressBook {
    //main method executed
    public static void main(String[] args) {
        System.out.println("WELCOME IN ADDRESS BOOK PROGRAM");
        ArrayList<Contact_info> addContacts = new ArrayList<>();
        //Scanner class is used to take input from user
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);


        int choice;
        while (true) {
            System.out.println("1: ADD");
            System.out.println("2: DISPLAY");
            System.out.println("3:EDIT");
            System.out.println("4:DELETE");
            System.out.println("0: EXIT");
            System.out.println("ENTER YOUR CHOICE :");
            choice = s.nextInt();
            //switch statements are used to choose a perticular oparation
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
                    //addContact.add function is used to add the object type data to the ArrayList object
                    addContacts.add(new Contact_info(name, email, phone, city, state, zip));
                    break;
                case 2:
                    Iterator<Contact_info> display = addContacts.iterator();
                    while (display.hasNext()) {
                        Contact_info show = display.next();
                        System.out.println(show);
                    }
                    break;
                case 3:
                    boolean found = false;
                    Iterator<Contact_info> edit = addContacts.iterator();
                    System.out.println("Enter the Name who's details you want to edit");
                    name = sc.nextLine();
                    while (edit.hasNext()) {
                        Contact_info newdata = edit.next();
                         if ((newdata.name).equals(name)) {
                        
                            int index = addContacts.indexOf(newdata);
                            System.out.println("ENTER THE NEW EMAIL ID");
                            email = sc.nextLine();

                            System.out.println("ENTER THE NEW PHONE NUMBER");
                            phone = sc.nextInt();
                             sc.nextLine();

                            System.out.println("ENTER THE NEW CITY");
                            city = sc.nextLine();

                            System.out.println("ENTER THE NEW STATE");
                            state = sc.nextLine();

                            System.out.println("ENTER THE NEW ZIP CODE");
                            zip = sc.nextInt();

                            addContacts.set(index,new Contact_info(name, email, phone, city, state, zip));

                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("not found");
                    } else
                        System.out.println("edited successfully");
                    break;
                case 4:
                    boolean deleteItemFound=false;
                    Iterator <Contact_info> delete=addContacts.iterator();

                    System.out.println("ENTER THE NAME TO DELETE");
                    String nameSearch=sc.nextLine();
                    while(delete.hasNext()){
                        Contact_info dataDel=delete.next();
                        if(nameSearch.equals(dataDel.name)){
                            delete.remove();
                            deleteItemFound=true;
                        }
                    }
                    if(!deleteItemFound){
                        System.out.println("not found");
                    }
                    else
                        System.out.println("deleted successfully");
                    break;
            }
        }
    }
}
