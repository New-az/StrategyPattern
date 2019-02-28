public class CashRegister {
    private double purchase; // total amount of product price bought
    private double payment;  // total amount of payment

    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }
    
    public void calculateTax(Tax tax) {
    	purchase = tax.calculatate(purchase);
    }


    public void enterPayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
