package DIP;

public interface BankCard {
   public void doTransaction(int amt);
}
public interface UPIPayments {
    
    public void payMoney();
    
    public void getScratchCard();
    
    public void getCashBackAsCreditBalance();
}