package com.bridgelab;

import java.util.Scanner;

public class Contact_info {
    //Variables
    String name;
    String email;
    long phone_no;
    String city;
    String state;
    int zip;

    public Contact_info(String name, String email, long phone_no, String city, String state, int zip) {
        this.name = name;
        this.email = email;
        this.phone_no = phone_no;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    @Override
    public String toString() {
        return "Contacts{"+
                "Name='" + name + '\'' +
                ", E-Mail='" + email + '\'' +
                ", phoneNumber=" + phone_no +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zip +
                '}';
    }

}
