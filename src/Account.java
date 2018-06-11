public class Account {

    //instance variables
    private int accountNum = 0;
    private String userName = "";
    private double balance = 0;
    private int pin = 0;

    //constructors
    public Account () {}
    public Account (int accountNum, String userName, double balance, int pin) {
        this.accountNum = accountNum;
        this.userName = userName;
        this.balance = balance;
        this.pin = pin;
    }

    //instance methods
    public double getBalance () {
        return this.balance;
    }
    public String deposit (double amount){
        this.balance += amount;
        return "Deposit was successful.\n" +
                "The new balance is " + "$" + String.format ("%.2f", this.getBalance());
    }

    public String  withdraw (double amount) {
        if (this. balance - amount > 0){
            this.balance -= amount;
            return "Withdrawal was successful." +
                    "The new balance is " + "$" + String.format ("%.2f", this.getBalance());
        }
        else {
            return "There is not enough money in the account for " +
                    "the withdrawal";
        }
    }

    public boolean validateAccount (int accountNum){
        if (accountNum == this.accountNum){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validatePin (int pin){
        if (pin == this.pin){
            return true;
        }
        else {
            return false;
        }
    }
}