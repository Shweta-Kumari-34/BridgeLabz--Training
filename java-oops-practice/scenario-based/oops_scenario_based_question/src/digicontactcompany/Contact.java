package digicontactcompany;

public class Contact implements Comparable<Contact> {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address;

    public Contact(String firstName, String lastName,
                   String phone, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return address != null ? address.getCity() : "";
    }

    public String getState() {
        return address != null ? address.getState() : "";
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Used for duplicate check
    public boolean hasSameName(String fn, String ln) {
        return firstName.equalsIgnoreCase(fn)
                && lastName.equalsIgnoreCase(ln);
    }

    @Override
    public int compareTo(Contact other) {
        int first = this.firstName.compareToIgnoreCase(other.firstName);
        return (first != 0)
                ? first
                : this.lastName.compareToIgnoreCase(other.lastName);
    }

    public void display() {
        System.out.println(firstName + " " + lastName +
                " | Phone: " + phone +
                " | Email: " + email +
                " | Address: " + (address != null ? address : "N/A"));
    }
}

