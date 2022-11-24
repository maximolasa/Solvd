
public class Doctor {
	String name;
	int amount;
	int dmg;
	int health;
	
	
	private Doctor(String name,int amount, int dmg, int health) {
		this.name = name;
		this.amount = amount;
		this.dmg = dmg;
		this.health = health;
	}


	public String getName() {
		return name;
	}


	public int getAmount() {
		return amount;
	}


	public int getDmg() {
		return dmg;
	}


	public int getHealth() {
		return health;
	}
	 	
}
