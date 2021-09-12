//Ameer Ahmed

public class Main {
    public static void main(String[] args) {  

        System.out.println("Opening a bank account with zero balance.");
        try {
            BankAccount bank = new BankAccount(0);
        }catch (BankException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nOpening a bank account with negative balance.");
        try {
            BankAccount bank = new BankAccount(-35);
        }catch (BankException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nTried to deposit negative amount in account.");
        try {
            BankAccount bank = new BankAccount(1000);
            bank.deposit(-100);
        }catch (BankException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nTried to withdraw negative amount from account.");
        try {
            BankAccount bank = new BankAccount(1000);
            bank.withdraw(-100);
        }catch (BankException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nTried to withdraw amount and caused an overdraft.");
        try {
            BankAccount bank = new BankAccount(600);
            bank.withdraw(660);
        }catch (BankException e){
            System.out.println(e.getMessage());
        }
    }
}