public class SuspendedState implements AccountState {

    @Override
    public void deposit(Account account, Double amount) {
        System.out.println("No deposits allowed on a suspended account!");
        System.out.println(account.toString());
    }

    @Override
    public void withdraw(Account account, Double amount) {
        System.out.println("No withdrawals allowed on a suspended account!");
        System.out.println(account.toString());
    }

    @Override
    public void activate(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("Account is activated!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is already suspended!");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }
}
