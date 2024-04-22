package java.Assignment7;

/*
 * Name - Balvindra Singh
 * Time - 10:30 AM
 * Date - 15th July 2023
 */

// This is a class without the main method
public class BankTransaction
 {
    // Instance variables
    private boolean canadianFunds;
    private double exchangeRate;
    private int transactionNumber;
    private long transactionReferenceNumber;
    private static int objectCount = 0;

    /*
     * Constructs a BankTransaction object with the given arguments
     */
    public BankTransaction(boolean canadianFunds, double exchangeRate, int transactionNumber, long transactionReferenceNumber)
     {
        this.canadianFunds = canadianFunds;
        this.exchangeRate = exchangeRate;
        this.transactionNumber = transactionNumber;
        this.transactionReferenceNumber = transactionReferenceNumber;
        objectCount++;
    }

    // Returns whether the transaction is in Canadian funds
    public boolean isCanadianFunds()
     {
        return canadianFunds;
    }

    // Sets whether the transaction is in Canadian funds
    public void setCanadianFunds(boolean canadianFunds) 
    {
        this.canadianFunds = canadianFunds;
    }

    // Returns the exchange rate of the transaction
    public double getExchangeRate() 
    {
        return exchangeRate;
    }

    // Sets the exchange rate of the transaction
    public void setExchangeRate(double exchangeRate) 
    {
        this.exchangeRate = exchangeRate;
    }

    // Returns the transaction number
    public int getTransactionNumber() 
    {
        return transactionNumber;
    }

    // Sets the transaction number
    public void setTransactionNumber(int transactionNumber) 
    {
        this.transactionNumber = transactionNumber;
    }

    // Returns the transaction reference number
    public long getTransactionReferenceNumber() 
    {
        return transactionReferenceNumber;
    }

    // Sets the transaction reference number
    public void setTransactionReferenceNumber(long transactionReferenceNumber)
     {
        this.transactionReferenceNumber = transactionReferenceNumber;
    }

    // Returns the count of BankTransaction objects created
    public static int getObjectCount()
     {
        return objectCount;
    }
}