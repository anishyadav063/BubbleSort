
public interface Bank {
	public void deposite(int amount);
	public void withdraw(int amount);

}

class Hdfs implements Bank{
	double balance=10000;

	@Override
	public void deposite(int amount) {
		  if(amount>balance) {
			  throw new invalidAmountException("please enter valid amount");
		  }
		
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		
	}
	
}
