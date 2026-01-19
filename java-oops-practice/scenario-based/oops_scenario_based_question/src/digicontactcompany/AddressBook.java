package digicontactcompany;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add contact with duplicate validation
    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.hasSameName(contact.getFirstName(), contact.getLastName())) {
                System.out.println("Duplicate contact. Not added.");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    // Edit contact by name
    public void editContact(String fn, String ln, String phone, String email, Address address) {
        for (Contact c : contacts) {
            if (c.hasSameName(fn, ln)) {
                c.setPhone(phone);
                c.setEmail(email);
                c.setAddress(address);
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete contact by name
    public void deleteContact(String fn, String ln) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (c.hasSameName(fn, ln)) {
                it.remove();
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Search by city or state
    public void searchByCityOrState(String keyword) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getCity().equalsIgnoreCase(keyword)
                    || c.getState().equalsIgnoreCase(keyword)) {
                c.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found.");
        }
    }

    // Display all contacts alphabetically
    public void displayAll() {
        Collections.sort(contacts);
        System.out.println("\n---- Address Book ----");
        for (Contact c : contacts) {
            c.display();
        }
    }
}

