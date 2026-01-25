package junit.testingbankingtransactions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class BankAccountTest {
	@Test
    void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(400);
        assertEquals(600, account.getBalance());
    }
    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount();
        account.deposit(200);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(500);
        });

        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testMultipleTransactions() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(200);
        account.deposit(300);
        account.withdraw(400);
        assertEquals(700, account.getBalance());
    }
}
