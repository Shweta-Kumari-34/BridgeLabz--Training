package loanapprovalautomation;
import java.util.ArrayList;
public class Applicant {
	
//protected String name;
//private int creditScore;
//protected double income;
//protected double loanAmount;
//private static int loanIDs=0;
//static ArrayList<Integer> list =new ArrayList<>();
//Applicant(String name, int creditScore, double income, double loanAmount ){
//this.name =name;
//this.creditScore=creditScore;
//this.income=income;
//this.loanAmount=loanAmount;
//}
//
//static void assignLoanNumber(int loanNumber) {
//list.add(loanNumber);
//loanIDs++;
//}
//
//static int getLoanNumber() {
//	return loanIDs;
//}
// 
//static double[]totalAmt= new double[list.size()];
// static double []interestAssign =new double[list.size()];
// 
//public static  double assignTotalAmt( double amt) {
//totalAmt[loanIDs]= amt;
//return totalAmt[loanIDs];
//}
//
//public static double assignInterest( double interest) {
//interestAssign[loanIDs]= interest;
//return interestAssign[loanIDs];
//
//}
//

//	package loanapprovalautomation;
//
//	import java.util.ArrayList;

	//public class Applicant {

	    private static int loanIDs = 0;
	    static ArrayList<Integer> list = new ArrayList<>();

	    static void assignLoanNumber(int loanNumber) {
	        list.add(loanNumber);
	        loanIDs++;
	    }

	    static int getLoanNumber() {
	        return list.get(list.size() - 1);
	    }
	}

//}


