package com.bridgelab;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


public class Contact_info {
    Scanner takingInput=new Scanner(System.in);
    //Variables
    String firstName;
    String lastName;
    String email;
    long phone_no;
    String city;
    String state;
    int zip;

    public Contact_info(String firstName, String lastName, String email,
                        long phone_no, String city, String state, int zip) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email = email;
        this.phone_no = phone_no;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    ArrayList<Contact_info> insertContact=new ArrayList<>();
    public void addContact() {
        System.out.println("How many person's details you want to entered?");
        int noOfPerson=takingInput.nextInt();
        for (int i=0;i<noOfPerson;i++) {
            System.out.println("Enter First Name: ");
            firstName = takingInput.nextLine();
            takingInput.nextLine();

            System.out.println("Enter Last Name: ");
            lastName = takingInput.nextLine();

            System.out.println("Enter Email: ");
            email = takingInput.nextLine();

            System.out.println("Enter Phone Number: ");
            phone_no = takingInput.nextLong();
            takingInput.nextLine();

            System.out.println("Enter City: ");
            city = takingInput.nextLine();

            System.out.println("Enter State: ");
            state = takingInput.nextLine();

            System.out.println("Enter Zip Pin: ");
            zip = takingInput.nextInt();
            //addContact.add function is used to add the object type data to the ArrayList object
            insertContact.add(new Contact_info(firstName, lastName, email, phone_no, city, state, zip));
        }
    }
    public void display() {
        Iterator<Contact_info> display = insertContact.iterator();
        while (display.hasNext()) {
            Contact_info show = display.next();
            System.out.println(show);
        }
        if(display.hasNext()==false)
        {
            System.out.println("No Data Found");
        }
    }
    public void edit() {
        boolean found=false;

        Iterator <Contact_info> editingMood=insertContact.iterator();

        System.out.println("ENTER THE FIRST NAME FOR EDITING");
        firstName=takingInput.nextLine();

        while(editingMood.hasNext()) {
            Contact_info data = editingMood.next();

            if ((data.firstName).equals(firstName)) {
                int index= insertContact.indexOf(data);

                System.out.println("ENTER THE FIELD TO EDIT");
                System.out.println("1.LAST NAME");
                System.out.println("2.EMAIL ID");
                System.out.println("3.PHONE NUMBER");
                System.out.println("4.CITY");
                System.out.println("5.STATE");
                System.out.println("6.ZIP CODE");


                System.out.println("ENTER YOUR CHOICE PLEASE");
                int editChoice=takingInput.nextInt();
                takingInput.nextLine();

                switch(editChoice) {
                    case 1:
                        System.out.println("ENTER THE NEW lastname");
                        lastName = takingInput.nextLine();
                        break;
                    case 2:
                        System.out.println("6.EMAIL ID");
                        email = takingInput.nextLine();
                        break;
                    case 3:
                        System.out.println("ENTER THE NEW PHONE NUMBER");
                        phone_no= takingInput.nextLong();
                        takingInput.nextLine();
                        break;

                    case 4:
                        System.out.println("ENTER THE NEW CITY");
                        city = takingInput.nextLine();
                        break;
                    case 5:
                        System.out.println("ENTER THE NEW STATE");
                        state = takingInput.nextLine();
                        break;

                    case 6:
                        System.out.println("ENTER THE NEW ZIP CODE");
                        zip= takingInput.nextInt();
                        takingInput.nextLine();

                }
                insertContact.set(index, new Contact_info(firstName, lastName,
                        email, phone_no,city, state, zip));

                found = true;

            }
        }

        if (!found){
            System.out.println("not found");
        }
        else
            System.out.println("edited successfully");
    }
    public void delete(){
        boolean deleteItemFound=false;
        Iterator <Contact_info> delete=insertContact.iterator();

        System.out.println("ENTER THE NAME TO DELETE");
        String nameSearch=takingInput.nextLine();
        while(delete.hasNext()){
            Contact_info dataDel=delete.next();
            if(nameSearch.equals(dataDel.firstName)){
                delete.remove();
                deleteItemFound=true;
            }
        }
        if(!deleteItemFound){
            System.out.println("not found");
        }
        else
            System.out.println("deleted successfully");
    }

    @Override
    public String toString() {
        return "Contacts{"+
                "Firt_Name='" + firstName + '\'' +
                "Lat_Name='" + lastName + '\'' +
                ", E-Mail='" + email + '\'' +
                ", phoneNumber=" + phone_no +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zip +
                '}';
    }


}
