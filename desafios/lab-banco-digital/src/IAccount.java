public interface IAccount {
    
    // Interface que define o contrato das contas
    boolean withdraw(double amount);
    boolean deposit(double amount);
    boolean transfer(double amount, IAccount destinationAccount);
    void printStatement();

}
