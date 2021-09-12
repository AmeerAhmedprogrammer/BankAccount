//Ameer Ahmed

public class BankAccount{
    //instance fields
    private double balance;
    private static final double overdraft_allowed = 35;

    public BankAccount(double balance) throws BankException{
        this.balance = balance;

        if (balance == 0){
            //when opening an account 
            throw new BankException("Error: Balance entered is zero please try again.");
        }
        else if (balance < 0){
            //when balance turns negative
            throw new BankException("Error: Balance entered is negative please try again.");
        }
        else{
            this.balance = balance;
        }

    }

    public void deposit(double amount)  throws BankException{
        if (amount <=  0){
            throw new BankException("Error: Deposit amount is negative.");
        }
        else{
            balance += amount;
        }
    }

    public void withdraw(double amount) throws BankException{
        if (amount  <= 0){
            throw new BankException("Error: Withdraw amount is negative.");
        }
        else {
            if(balance - amount < overdraft_allowed) {
                throw new BankException("Error: Overdraft exceeded. Transaction denied.");
            }

            else{
                this.balance -= amount;
            }
        }    
    }
}