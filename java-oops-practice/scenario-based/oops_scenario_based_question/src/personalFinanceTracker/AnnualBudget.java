package personalFinanceTracker;

import java.util.Map;

public class AnnualBudget extends Budget {
	

	    public AnnualBudget(double income, Map<String, Double> categoryLimits) {
	        super(income, categoryLimits);
	    }

	    
	    public void generateReport() {
	        System.out.println("Annual Budget Report");
	        System.out.println("Yearly income is: " + income);
	        System.out.println("Yearly expenses is: " + getTotalExpenses());
	        System.out.println("Yearly savings is: " + calculateNetSavings());
	    }

	    
	    public   void detectOverspendReport() {
	        Map<String, Double> spent = categoryExpenseSummary();

	        for (String category : spent.keySet()) {
	            if (spent.get(category) > categoryLimits.getOrDefault(category, 0.0)) {
	                System.out.println("Annual overspend in category: " + category);
	            }
	        }
	    }


	

	}


