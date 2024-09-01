class Bankaccount
{
	static int currentBalance=1000;
	public static void Greetcustomer()
	{
		System.out.println("hello welcome to the banking application");
	}
	public void Deposit(int amount)
	{
		currentBalance = currentBalance + amount;
		System.out.println("Amount deposited successfully");
	}
	public static void withdrawal(int amount)
	{
		currentBalance = currentBalance - amount;
		System.out.println("amount withdrawm successfully");
	}
	public int getcurrentBalance()
	{
		return currentBalance;
	}
	public static void main(String[] args)
	{
		Bankaccount Bankaccount = new Bankaccount();
    	Greetcustomer();
        System.out.println("current balance is : "+Bankaccount.getcurrentBalance());
		Bankaccount.Deposit(500);
        System.out.println("current balance is : "+Bankaccount.getcurrentBalance());
		withdrawal(300);
		System.out.println("current balance is : "+Bankaccount.getcurrentBalance());

	}
}
	    
