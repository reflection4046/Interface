package Abstract;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1= new HSBC();
		System.out.println("HSBC Interest : "+b1.getinterest());
		System.out.println("HSBC paid : "+b1.paidinterest());
		
		Bank b2= new BRAC();
		System.out.println("BRAC Interest : "+b2.getinterest());
		System.out.println("BRAC paid : "+b2.paidinterest());
	}
	}


