
public class AddressBook {
    public static void main(String[] args){
        System.out.println("WELCOME IN ADDRESS BOOK PROGRAM");
    }
}class AddPerson extends AddressBook{

    public void addName(String firstName, String lastName){
        System.out.println("ENTERED FIRST NAME="+firstName);
        System.out.println("ENTERED LAST NAME="+lastName);
    }

    public void addAddress(String address, String city, String state, int zipCode){
        System.out.println("ADDRESS::"+address);
        System.out.println("CITY::"+city);
        System.out.println("STATE::"+state);
        System.out.println("ZIP CODE::"+zipCode);
    }
    public void addContact(int phoneNo,String eMail){
        System.out.println("PHONE NUMBER:"+phoneNo);
        System.out.println("EMAIL:"+eMail);
    }
}