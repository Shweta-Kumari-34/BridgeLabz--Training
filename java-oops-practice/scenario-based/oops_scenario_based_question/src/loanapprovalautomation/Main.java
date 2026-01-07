package loanapprovalautomation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;
        IApprovable loan = null;   // 🔹 polymorphic reference
        int counter = 1;

        while (running) {
            System.out.println("\n------------------------------------");
            System.out.println(" ==== Welcome To LoanBuddy App ===");
            System.out.println("1. HomeLoan");
            System.out.println("2. AutoLoan");
            System.out.println("3. Pay Loan Amount");
            System.out.println("4. Show Repayment Plan");
            System.out.println("5. Exit");
            System.out.println("------------------------------------");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter principal amount:");
                    double hPrincipal = input.nextDouble();

                    System.out.println("Enter tenure (months):");
                    int hTenure = input.nextInt();

                    System.out.println("Enter credit score:");
                    int hCreditScore = input.nextInt();

                    loan = new HomeLoan("HomeLoan", hTenure);
                    loan.setPrincipal(hPrincipal);
                    loan.setCreditScore(hCreditScore);

                    if (loan.approveLoan()) {
                        System.out.println("Home Loan Approved ✅");
                        Applicant.assignLoanNumber(counter++);
                        System.out.println("Your loan number is: " + Applicant.getLoanNumber());
                    } else {
                        System.out.println("Home Loan Rejected ❌");
                        loan=null;
                    }

                  
                    break;

                case 2:
                    System.out.println("Enter principal amount:");
                    double aPrincipal = input.nextDouble();

                    System.out.println("Enter tenure (months):");
                    int aTenure = input.nextInt();

                    System.out.println("Enter credit score:");
                    int aCreditScore = input.nextInt();

                    loan = new AutoLoan("AutoLoan", aTenure);
                    loan.setPrincipal(aPrincipal);
                    loan.setCreditScore(aCreditScore);

                    if (loan.approveLoan()) {
                        System.out.println("Auto Loan Approved ✅");
                        Applicant.assignLoanNumber(counter++);
                        System.out.println("Your loan number is: " + Applicant.getLoanNumber());
                    } else {
                        System.out.println("Auto Loan Rejected ❌");
                      loan =null;
                    }

                    break;

                case 3:
                    if (loan == null) {
                        System.out.println("Please apply for a loan first");
                        break;
                    }

                    System.out.println("Enter amount you want to pay:");
                    double amount = input.nextDouble();
                    System.out.println("Payment of " + amount + " received. Thank you!");
                    break;

                case 4:
                    if (loan == null) {
                        System.out.println("No approved loan found. Please apply again.");
                        break;
                    }

                    double emi = loan.calculateEMI();
                    int tenure = loan.getTenure();
                    double totalAmt = emi * tenure;

                    System.out.println("Monthly EMI: " + emi);
                    System.out.println("Total Payable Amount: " + totalAmt);
                    System.out.println("Total Interest: " + (totalAmt - loan.getPrincipal()));
                    break;

                case 5:
                    System.out.println("Thank you for visiting LoanBuddy!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        input.close();
    }
}
 