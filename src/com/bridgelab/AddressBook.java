package com.bridgelab;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class AddressBook {

    public static void main(String[] args){
        System.out.println("WELCOME IN ADDRESS BOOK PROGRAM");
        System.out.println("Add new contact details to Address_Book");
        AddContact addContact=new AddContact();
        addContact.add();

    }

}

