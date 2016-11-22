public class BankAccount{
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
	System.out.println(b.authenticate("Leonard", "enterprise"));
    }
    private double balance; 
    private int accountID;
    private String username; 
    private String password; 
    private int pin;

    //constructors
    public BankAccount(double bal, int accID, String user, String pass, int PIN){
	balance = bal;
	accountID = accID;
	username = user;
	password = pass;
	pin = PIN;	
    }
    public BankAccount(){
    }
    public void printall(){
	System.out.println("Account ID: "+accountID+"   Balance: "+balance);
	System.out.println("Username: "+username+"   Password: "+password);
	System.out.println("PIN: "+pin);
    }
    public double getBalance(){
	return balance;
    }
    public int getAccountId(){
	return accountID;
    }
    public String getUsername(){
	return username;
    }
    public void setPassword(String newpassword){
	password = newpassword;
	//use .equals() for String instead of ==
    }   
    public void setPin(int newpin){
	pin = newpin;
    }    
    public Boolean deposit(double amount){
	if(amount > 0){
	    balance += amount;
	    return true;
	}else{
	    return false;
	}
    }
    public Boolean withdraw(double amount){
	if(balance - amount >= 0){
	    balance -= amount;
	    return true;
	}else{
	    return false;
	}
    }
    public String toString(){
	return username+"\t"+accountID+"\t"+balance;
    }
    public boolean Authenticate(String user, String pass){
	return user.equals(username) && pass.equals(password);
    }
}
