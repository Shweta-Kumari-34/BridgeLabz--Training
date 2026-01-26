package annotations.suppressuncheckedwarnings;
import java.util.ArrayList;
import java.util.List;
public class SuppressUncheckedWarnings {
	@SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // creating ArrayList without generics (raw type)
        List list = new ArrayList();

        // adding elements
        list.add("Java");
        list.add("JUnit");

        // unchecked assignment warning is suppressed
        List<String> names = list;

        // printing list
        for (String name : names) {
            System.out.println(name);
        }
    }
}
