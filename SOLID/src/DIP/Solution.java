package DIP;

class ShopingMall {
   private BankCard bankC;
   public ShopingMall(BankCard bankC) {
	   this.bankC=bankC;
   }
   public void doPay( int amt) {
	   bankC.doTransaction(amt);
   }
}

public class Solution{
	public static void main(String[] args) {
		BankCard cc=new CreditCard();
		BankCard dc=new DebitCard();
		cc.doTransaction(2300);
		dc.doTransaction(400);
	}
}
