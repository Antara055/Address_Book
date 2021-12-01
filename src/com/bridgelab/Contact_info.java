package com.bridgelab;

public class Contact_info {
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
