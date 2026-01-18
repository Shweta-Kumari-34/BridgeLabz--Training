package personalFinanceTracker;
import java.util.*;

	public  abstract class Budget implements IAnalyzable{

		    protected double income;
		    protected Map<String, Double> categoryLimits;
		    private List<Transaction> transactions; // encapsulated

		    public Budget(double income, Map<String, Double> categoryLimits) {
		        this.income = income;
		        this.categoryLimits = categoryLimits;
		        this.transactions = new ArrayList<>();
		    }

		    // controlled access
		    public void addTransaction(Transaction transaction) {
		        transactions.add(transaction);
		    }

		    protected double getTotalExpenses() {
		        double total = 0;
		        for (Transaction t : transactions) {
		            if (t.getType().equalsIgnoreCase("EXPENSE")) {
		                total += t.getAmount();
		            }
		        }
		        return total;
		    }

		    // operator usage
		    public double calculateNetSavings() {
		        return income - getTotalExpenses();
		    }

		    protected Map<String, Double> categoryExpenseSummary() {
		        Map<String, Double> summary = new HashMap<>();

		        for (Transaction t : transactions) {
		            if (t.getType().equalsIgnoreCase("EXPENSE")) {
		                summary.put(
		                    t.getCategory(),
		                    summary.getOrDefault(t.getCategory(), 0.0) + t.getAmount()
		                );
		            }
		        }
		        return summary;
		    }

			

			
		}

	




