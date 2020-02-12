
public interface Bank {
	public int deposite(int amount);
	public void withdraw(int amount);

}

class Hdfs implements Bank{
	int balance=10000;

	@Override
	public int deposite(int amount) {
		 balance=balance+amount;
		 return balance;
		  }
		
	

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		 if(amount>balance) {
			  throw new invalidAmountException("please enter valid amount");
		
	}
	}
}
class HdfsBankTest{
	public static void main(String[] args) {
		Hdfs h=new Hdfs();
		h.deposite(1000);
	}
}

