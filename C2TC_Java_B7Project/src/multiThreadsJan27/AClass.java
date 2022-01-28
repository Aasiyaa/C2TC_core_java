package multiThreadsJan27;
public class AClass {
	int bal;
	
	
	//withdrawing 
	 public void withdraw(int amt)
	 {//get the existing balance
			//AClass obj1;
			bal=getBalance();

			if (bal < amt) {
				System.out.println("Transaction failed : Insufficient Funds");
			} else {
				System.out.println("Processing withdraw...");
				bal = bal - amt;
				System.out.println("new balance after withdrawl: " + bal);
			
					System.out.println("Withdraw sucessful");
				
	 }}
synchronized void deposit(int amt)
{
	System.out.println("Getting balance...");
	int oldbal=getBalance();
	bal=oldbal+amt;
	setBalance(bal);
}
int getBalance()
{
	return Account.Balance;
}
void setBalance(int amt)
{
	try
	{
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		
	}
	Account.Balance=amt;
}
}