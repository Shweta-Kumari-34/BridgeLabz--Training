package loanapprovalautomation;

import java.util.ArrayList;

public class Applicant {

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
