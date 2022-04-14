package dataStructures;

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
	public void print() {
		
		System.out.println("Hi, my name is " + name + ". I have " + followers + " followers and " + money + "$ in my account!");
		

	}

	//users are sorted by the amount of followers they have...
	@Override
	public int compare(DataElement element) {
		
		if(element instanceof User) {
			
			return ((User) element).getNFollowers() - this.followers;
			
		}else return 0;
	}
	
	public int getNFollowers() {
		return this.followers;
	}

}
