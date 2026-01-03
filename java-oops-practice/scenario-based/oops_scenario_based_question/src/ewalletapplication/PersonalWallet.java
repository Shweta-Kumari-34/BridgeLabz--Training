package ewalletapplication;

public class PersonalWallet extends Wallet {

    public PersonalWallet() {
        super();
    }

    public PersonalWallet(double referralBonus) {
        super(referralBonus);
    }

   
    public void transferTo(User receiver, double amount) {
        if (amount <= getBalance()) {
            deductBalance(amount);
            receiver.getWallet().addBalance(amount);
            new Transaction("Personal Transfer", amount);
        } else {
            System.out.println("Insufficient balance in Personal Wallet");
        }
    }
}

