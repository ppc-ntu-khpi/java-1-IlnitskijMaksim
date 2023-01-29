package domain;
/**
 *
 * @author chnsd
 */
public class Customer {
    private int ID = 45;
    private boolean isNew = false;
    private float total = 250;
    
    public void displayCustomerInfo(){
        System.out.println("Customer ID is: " + ID);
        System.out.println("Customer is new? " + isNew);
        System.out.println("Total purchases are: " + total);
    }
    
}
