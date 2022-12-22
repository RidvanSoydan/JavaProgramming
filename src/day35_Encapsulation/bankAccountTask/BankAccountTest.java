package day35_Encapsulation.bankAccountTask;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount("Muaz Zam", 124353453, 0);

        ba1.deposit(150000);
        ba1.getBalance(); // Depositing $150000.0 to the account 124353453

        System.out.println(ba1); //BankAccount{accountHolder='Muaz Zam', balance=150000.0}

        ba1.withdraw(100);
        ba1.getBalance(); // Withdrawing $100.0 from the account 124353453

        System.out.println(ba1); // BankAccount{accountHolder='Muaz Zam', balance=149900.0}
    }
}
