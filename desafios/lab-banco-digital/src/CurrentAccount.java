// Conta Corrente
public class CurrentAccount extends Account {
    public CurrentAccount(Person client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.printStatement();
    }
}