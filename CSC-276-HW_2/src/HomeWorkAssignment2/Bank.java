package HomeWorkAssignment2;

public class Bank {

    public static void main(String[] args){

        //Creates the objects for the accounts
        BankAccount account100 = new BankAccount();
        BankAccount account200 = new BankAccount();

        //Assigns the objects an account number attribute
        account100.setAccountNumber("100");
        account200.setAccountNumber("200");

        //Assigns the accounts a balance in USD
        account100.setBankBalance(1000.00);
        account200.setBankBalance(1500.00);

        //Updates the balance of the account, changing the bankBalance double
        account100.updateBalance(300.00);
        account200.updateBalance(-400);
        account100.updateBalance(BankAccount.convertCurrency(150,1.18)); //Updates the balance
        account200.updateBalance(BankAccount.convertCurrency(140,1.11)); //after foreign exchange

        //Calculates the interest of the account's balance, happens after the alterations
        account100.calcInterest();
        account200.calcInterest();

        //Displays the account number, balance, and interest earned
        account100.displayAccount();
        account200.displayAccount();

    }


}
