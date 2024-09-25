/*     In this program, I assigned a set amount of values to various datatypes to simulate a bank.
The purpose of this program is to calculate the balance of a bank attendee after a set interval of time.
Additionally, the programmer can convert foreign currency and add it to the account, via an exchange rate.     */

package HomeWorkAssignment2;

public class BankAccount {

    private final double INTEREST_RATE;
    private final int DURATION;

    private String accountNumber;
    private double bankBalance;
    private double interest;

    //We don't need to set or get DURATION or INTEREST_RATE due to them being constants
    public BankAccount()
    {
        DURATION = 2;
        INTEREST_RATE = 0.03;
    }

    //START OF SETTERS AND GETTERS (not all are needed due to the above statement and displayAccount)//
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setBankBalance(double bankBalance)
    {
        this.bankBalance = bankBalance;
    }

    //END OF SETTERS AND GETTERS//

    //Calculates interest, given the fixed rate, time, and balance of an account
    public void calcInterest()
    {
        interest = INTEREST_RATE * DURATION * bankBalance; //So we can later display to the user
        bankBalance += interest; //Calculate the bankBalance after the interest period
    }

    //This method will allow the programmer to make changes to a users balance
    public void updateBalance(double accountChange) //accountChange is the amount of money deposited or withdrawn
    {
        bankBalance +=  accountChange;
    }

    //Shows the account number, balance, and earned interest
    public void displayAccount()
    {
        System.out.println("-------------------------------------------------------------"); //Formatting separation of data
        System.out.printf("| Account %s | Balance: $%.2f | Interest earned: $%.2f |\n", accountNumber, bankBalance, interest);
        System.out.println("-------------------------------------------------------------");
    }

    //Converts the currency, given the amount and exchange rate in USD
    public static double convertCurrency(double foreignAmount, double foreignExchange)
    {
        return foreignAmount * foreignExchange; //Returns the US dollar amount for uses in other methods
    }

}
