
public class Transportation {
	String type;
	int amount;
	int capacity;
	int health;
	int fuel;
	
	
	private Transportation(String type, int amount, int capacity, int health, int fuel) {
		this.type = type;
		this.amount = amount;
		this.capacity = capacity;
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


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
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
