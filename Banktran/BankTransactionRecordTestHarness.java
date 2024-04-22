package java.Assignment7;
/*
 * the class with main method
 */
import java.util.Random;
import java.util.Scanner;

public class BankTransactionRecordTestHarness 
{
    public static void main(String[] args)
     {
        BankTransaction[] transactions = new BankTransaction[500];
        Random random = new Random();

        // Instantiate 500 BankTransaction records with random data
        for (int i = 0; i < transactions.length; i++) 
        {
            boolean canadianFunds = random.nextBoolean();
            double exchangeRate = random.nextDouble();
            int transactionNumber = random.nextInt(10000);
            long transactionReferenceNumber = random.nextLong();

            transactions[i] = new BankTransaction(canadianFunds, exchangeRate, transactionNumber, transactionReferenceNumber);
        }

        // Print out the state of each object along with the unique object number
        for (int i = 0; i < transactions.length; i++) 
        {
            System.out.println("Transaction " + (i + 1) + " details:");
            System.out.println("Canadian Funds: " + transactions[i].isCanadianFunds());
            System.out.println("Exchange Rate: " + transactions[i].getExchangeRate());
            System.out.println("Transaction Number: " + transactions[i].getTransactionNumber());
            System.out.println("Transaction Reference Number: " + transactions[i].getTransactionReferenceNumber());
            System.out.println();

            if (i != transactions.length - 1) 
            {
                System.out.println("-----------------------------------");
            }
        }

        System.out.print("Do you wish to complete phase two of the test? (yes/no): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("yes"))
         {
            // Set default values for all transactions
            boolean defaultCanadianFunds = true;
            double defaultExchangeRate = 1.0;
            int defaultTransactionNumber = 1950;
            long defaultTransactionReferenceNumber = 400000012;

            // Modify each transaction with default values
            for (int i = 0; i < transactions.length; i++) 
            {
                transactions[i].setCanadianFunds(defaultCanadianFunds);
                transactions[i].setExchangeRate(defaultExchangeRate);
                transactions[i].setTransactionNumber(defaultTransactionNumber);
                transactions[i].setTransactionReferenceNumber(defaultTransactionReferenceNumber);
            }

            System.out.println("-----------------------------------");

            // Print out the modified state of each object
            for (int i = 0; i < transactions.length; i++) 
            {
                System.out.println("Transaction " + (i + 1) + " details:");
                System.out.println("Canadian Funds: " + transactions[i].isCanadianFunds());
                System.out.println("Exchange Rate: " + transactions[i].getExchangeRate());
                System.out.println("Transaction Number: " + transactions[i].getTransactionNumber());
                System.out.println("Transaction Reference Number: " + transactions[i].getTransactionReferenceNumber());
                System.out.println();

                if (i != transactions.length - 1)
                 {
                    System.out.println("-----------------------------------");
                }
            }
        }
        
        System.out.println("Total objects created: " + BankTransaction.getObjectCount());

      

        scanner.close();
    }
}