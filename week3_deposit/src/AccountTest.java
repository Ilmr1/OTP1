import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testInitialBalance() {
        Account account = new Account();
        assertEquals(0.0, account.getBalance(), "Initial balance should be 0.0");
    }

    @Test
    public void testDeposit() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), "Balance should be 100.0 after deposit");
    }

    @Test
    public void testWithdraw() {
        Account account = new Account();
        account.deposit(100.0);
        double withdrawnAmount = account.withdraw(50.0);
        assertEquals(50.0, withdrawnAmount, "Withdrawn amount should be 50.0");
        assertEquals(50.0, account.getBalance(), "Balance should be 50.0 after withdrawal");
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        Account account = new Account();
        account.deposit(50.0);
        double withdrawnAmount = account.withdraw(100.0);
        assertEquals(0.0, withdrawnAmount, "Withdrawn amount should be 0.0 when withdrawing more than balance");
        assertEquals(50.0, account.getBalance(), "Balance should remain 50.0 after failed withdrawal");
    }

    @Test
    public void testNegativeDeposit() {
        Account account = new Account();
        account.deposit(-50.0);
        assertEquals(0.0, account.getBalance(), "Balance should remain 0.0 after negative deposit");
    }

    @Test
    public void testNegativeWithdraw() {
        Account account = new Account();
        account.deposit(100.0);
        double withdrawnAmount = account.withdraw(-50.0);
        assertEquals(0.0, withdrawnAmount, "Withdrawn amount should be 0.0 for negative withdrawal");
        assertEquals(100.0, account.getBalance(), "Balance should remain 100.0 after negative withdrawal");
    }
}