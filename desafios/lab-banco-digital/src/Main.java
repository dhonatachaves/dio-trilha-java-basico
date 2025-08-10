public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ricardo Moura Filho");
        Person p2 = new Person("Adenilson Gomes Ferreira");
        Person p3 = new Person("Albert Moraes Barreto");

        Account savingsAccount = new SavingsAccount(p1);
        Account currentAccount1 = new CurrentAccount(p2);
        Account currentAccount2 = new CurrentAccount(p3);

        savingsAccount.deposit(100);
        currentAccount1.deposit(200);
        currentAccount1.withdraw(20);
        currentAccount1.transfer(100, savingsAccount);

        savingsAccount.printStatement();
        currentAccount1.printStatement();
        currentAccount2.printStatement();

        System.out.println("Clientes cadastrados:");
        Person.getClientsList().forEach((id, name) -> System.out.println(id + " - " + name));

        System.out.println("\nContas cadastradas:");
        Account.getAccountsList().forEach((id, account) -> 
            System.out.println("ID Cliente: " + id + ", Titular: " + account.client.getName()));
    }
}