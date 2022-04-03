package fieldImplementation;

public class User extends DataElement {

	private int money;
	private int followers;
	private String name;
	
	public User(int money, int followers, String name) {
		
		this.money = money;
		this.followers = followers;
		this.name = name;
		
	}
	
	public User() {
		
		money = 69;
		followers = 420;
		this.name = "Mark Zuck";
		
	}
	
	@Override
	void print() {
		
		System.out.println("Hi, my name is " + name + ". I have " + followers + " followers and " + money + "$ in my account!");
		

	}

}
