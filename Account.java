package acounttransfer;

public class Account {
	public  String id=" ";
	public String name=" ";
	public int balance=0;
	public Account(String id,String name) {
		this.id=id;
		this.name=name;
	}
	public Account(String id,String name,int balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public int credit(int amount) {
		balance+=amount;
		return balance;
	}
	public int debit(int amount) {
		if(amount<=balance) {
			balance-=amount;
			
		}else{
			System.out.println("Your amount is not sufficient");
		}
		
		return balance;
	}
	public int transferTo(Account a2,int amount) {
		if(amount<=balance) {
			
			balance-=amount;
			a2.credit(amount);
			System.out.println("Your transfer:"+amount);
		}else {
			System.out.println("Your amount exceeds");
		}
		
		return balance;
	}
	public String toString() {
		String str="AccountId:"+this.id+"\nAccountName:"+this.name+"\nAccountBalance:"+this.balance;
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account("1","Ma Ma");
	
		Account a1=new Account("2","Su Su",50000);
		System.out.println("Your credit balance:"+a1.credit(10000));
		System.out.println("Your debit balance:"+a1.debit(10000));
	
		Account a2=new Account("3","Yu Yu",30000);
		System.out.println("Your remain balance:"+a1.transferTo(a2,20000));
	
	
		System.out.println(a.toString());
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
	}

}