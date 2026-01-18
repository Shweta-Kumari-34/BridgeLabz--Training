package personalFinanceTracker;

import java.util.Map;

public 	class MonthlyBudget extends Budget {

	    public MonthlyBudget(double income, Map<String, Double> categoryLimits) {
	        super(income, categoryLimits);
	    }

	    
	    public void generateReport() {
	        System.out.println("Monthly Budget Report");
	        System.out.println("Income: " + income);
	        System.out.println("Expenses: " + getTotalExpenses());
	        System.out.println("Savings: " + calculateNetSavings());
	    }

	    
	    public void detectOverspendReport() {
	        Map<String, Double> spent = categoryExpenseSummary();

	        for (String category : spent.keySet()) {
	            if (spent.get(category) > categoryLimits.getOrDefault(category, 0.0)) {
	                System.out.println("Overspent in category: " + category);
	            }
	        }
	    }


		
	}


