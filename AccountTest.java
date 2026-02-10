public class AccountTest {
    public static void main(String[] args) {

        Account myAccount = new Account("1234", 10000.0);

        myAccount.activate(); // Account is already activated!

        myAccount.suspend(); // Account is suspended!

        myAccount.activate(); // Account is activated!

        myAccount.deposit(1000.0); // shows updated balance

        myAccount.withdraw(100.0); // shows updated balance

        myAccount.close(); // Account is closed!

        myAccount.activate(); // You cannot activate a closed account!

        myAccount.suspend(); // You cannot suspend a closed account!

        myAccount.withdraw(500.0); // cannot withdraw + shows account info

        myAccount.deposit(1000.0); // cannot deposit + shows account info
    }
}
