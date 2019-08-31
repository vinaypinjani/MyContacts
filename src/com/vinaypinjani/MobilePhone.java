package com.vinaypinjani;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> phoneContacts;

    public MobilePhone(String myNumber, ArrayList<Contacts> phoneContacts) {
        this.myNumber = myNumber;
        this.phoneContacts = phoneContacts;
    }

    public void storeContact(Contacts contacts) {
        if (contactExists(contacts)) {
            System.out.println("Contact already exists");
        } else {
            phoneContacts.add(contacts);
            System.out.println("Added");
        }

    }

    private boolean contactExists(Contacts contacts) {
        return phoneContacts.contains(contacts);
    }
    private int getPosition(Contacts contacts) {
        return phoneContacts.indexOf(contacts);
    }
    private int getPosition(String name) {
        for (int i = 0; i < phoneContacts.size(); i++) {
            Contacts contacts = this.phoneContacts.get(i);
            if (contacts.getContactName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void modifyContact(String name, String newNumber) {
        if (getPosition(name) >= 0) {
            phoneContacts.get(getPosition(name)).setContactNumber(newNumber);
            System.out.println("Contact updated!");
        } else {
            System.out.println("Contact does not exist!");
        }
    }

    public void removeContact(String name) {
        if (getPosition(name) >= 0) {
            phoneContacts.remove(getPosition(name));
            System.out.println("Contact removed!");
        } else {
            System.out.println("Contact not found!");
        }
    }

    public void searchContact(String name) {
        if (getPosition(name) >= 0) {
            System.out.println(phoneContacts.get(getPosition(name)).getContactName() + " = " + phoneContacts.get(getPosition(name)).getContactNumber());
        }else {
            System.out.println("Contact not found!");
        }
    }
    public void printAll() {
        for (int i = 0; i < phoneContacts.size(); i++) {
            Contacts contacts = new Contacts(phoneContacts.get(i).getContactName(), phoneContacts.get(i).getContactNumber());
            System.out.println(i + 1 + ": " + contacts.getContactName() + " = " + contacts.getContactNumber());
        }
    }


}
