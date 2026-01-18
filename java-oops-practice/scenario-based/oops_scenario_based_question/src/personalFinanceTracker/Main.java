package personalFinanceTracker;
import java.time.LocalDate;
import java.util.*;
public class Main {
	
	    public static void main(String[] args) {
	    	
	        Map<String, Double> limits = new HashMap<>();
	        limits.put("Food", 5000.0);
	        limits.put("Travel", 3000.0);

	        Budget budget = new MonthlyBudget(20000, limits); 

	        budget.addTransaction(new Transaction(2000, "EXPENSE", LocalDate.now(), "Food"));
	        budget.addTransaction(new Transaction(4000, "EXPENSE", LocalDate.now(), "Travel"));

	        budget.generateReport();
	        budget.detectOverspendReport();
	    }
	}


