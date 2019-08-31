package com.vinaypinjani;

import java.util.ArrayList;

public class Contacts {
    private String contactName;
    private String contactNumber;

    public Contacts(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }


    public String getContactNumber() {
        return contactNumber;
    }

    public static Contacts createContact(String name, String number) {
        return new Contacts(name, number);
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}

