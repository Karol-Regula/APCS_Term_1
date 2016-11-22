//this file is optional, BankAccount.java has a main
public class Driver{
    public static void main(String[]aaargs){
	BankAccount b = new BankAccount(100.00,1234,"Leonard","Bones",222);
	b.printall();
	System.out.println(b.getBalance());
	System.out.println(b.getAccountId());
	System.out.println(b.getUsername());
	b.setPassword("enterprise");
	b.setPin(333);
	System.out.println(b.deposit(55.00));
	System.out.println(b.withdraw(200.00));	
	System.out.println(b.withdraw(3.00));
	System.out.println(b.deposit(-55.00));
	b.printall();
	System.out.println(b.toString());
    }
}

