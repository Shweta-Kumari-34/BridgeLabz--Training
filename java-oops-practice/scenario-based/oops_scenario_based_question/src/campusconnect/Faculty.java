package campusconnect;

class Faculty extends Person {

    public Faculty(int id, String name, String email) {
        super(id, name, email);
    }

    public void printDetails() {     // polymorphism
        super.printDetails();
        System.out.println("Role: Faculty");
    }
}
