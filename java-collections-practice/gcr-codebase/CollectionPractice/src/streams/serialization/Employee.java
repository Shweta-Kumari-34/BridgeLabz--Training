package streams.serialization;
import java.io.Serializable;

	public class Employee implements Serializable {
	    private static final long serialVersionUID = 1L;  
        //declaring instance variable
	    int id;
	    String name;
	    String department;
	    double salary;
	    
        //constructor
	    public Employee(int id, String name, String department, double salary) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	    }
        //overriding method
	    @Override
	    public String toString() {
	        return "Employee [ID=" + id + ", Name=" + name + ", Department=" + department + ", Salary=" + salary + "]";
	    }
	}

