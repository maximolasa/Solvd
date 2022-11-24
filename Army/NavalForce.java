
public class NavalForce {
	String type;
	int amount;
	int dmg;
	int health;
	int fuel;

	private NavalForce(String type, int amount, int dmg, int health, int fuel) {
		this.type = type;
		this.amount = amount;
		this.dmg = dmg;
		this.health = health;
		this.fuel = fuel;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	
	
}
