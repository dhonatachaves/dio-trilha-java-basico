import java.util.LinkedHashMap;
import java.util.Map;

// Classe abstrata que implementa funcionalidades comuns das contas
public abstract class Account implements IAccount {
     private static final int STANDARD_AGENCY = 1;

    protected final int agency;
    protected double balance;
    protected final Person client;

    // Mapa estático para manter o registro global das contas (ID cliente → conta)
    protected static final Map<Integer, Account> accountsList = new LinkedHashMap<>();

    public Account(Person client) {
        this.agency = STANDARD_AGENCY;
        this.balance = 0.0;
        this.client = client;

        accountsList.put(client.getId(), this);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) return false;
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    @Override
    public boolean deposit(double amount) {
        if (amount <= 0) return false;
        balance += amount;
        return true;
    }

    @Override
    public boolean transfer(double amount, IAccount destinationAccount) {
        if (destinationAccount == null) return false;
        if (withdraw(amount)) {
            return destinationAccount.deposit(amount);
        }
        return false;
    }

    @Override
    public void printStatement() {
        System.out.println("=== Extrato Conta ===");
        System.out.println("Titular: " + client.getName() + " (ID: " + client.getId() + ")");
        System.out.println(String.format("Agência: %d", agency));
        System.out.println(String.format("Saldo: R$ %.2f", balance));
    }

    public static Map<Integer, Account> getAccountsList() {
        return Map.copyOf(accountsList);
    }
}
