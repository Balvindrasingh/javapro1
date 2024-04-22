/*
 * NAme - balvindra singh
 * 
 */

package javaaassign1;

public class Invoice 
{
    private String partNumber;
    private String partDescription;
    private int quantityOfPurchased;
    private double pricePerItem;
/*
 * Constructor
 */
    public Invoice(String partNumber, String partDescription, int quantityOfPurchased, double pricePerItem) 
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityOfPurchased = quantityOfPurchased;
        this.pricePerItem = pricePerItem;
    }
 //getter and setters
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantityOfPurchased() {
        return quantityOfPurchased;
    }

    public void setQuantityOfPurchased(int quantityOfPurchased)
     {
        if (quantityOfPurchased > 0) {
            this.quantityOfPurchased = quantityOfPurchased;
        }
         else {
            this.quantityOfPurchased = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem)
     {
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } 
        else {
            this.pricePerItem = 0.0;
        }
    }
//calculate invoice amount
    public double getInvoiceAmount() {
        return quantityOfPurchased * pricePerItem;
    }
}