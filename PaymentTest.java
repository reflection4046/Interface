package Abstract;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1= new CashPayment();
		System.out.println("Cash: "+p1.payment());
		
		
		Payment p2= new BkashPayment();
		System.out.println("Card: "+p2.payment());
		
		Payment p3= new OnlinePayment();
		System.out.println("Cheque: "+p3.payment());
	}

}
