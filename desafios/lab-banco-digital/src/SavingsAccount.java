// Conta Poupança
public class SavingsAccount extends Account {
    public SavingsAccount(Person client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.printStatement();
    }
}
