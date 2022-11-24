
public class Soldiers {
	String type;
	int number;
	int dmg;
	int health;
	int nutricionalValue;
	
	
	private Soldiers(String type, int number, int dmg, int health, int nutricionalValue) {
		this.type = type;
		this.number = number;
		this.dmg  = dmg;
		this.health = health;
		this.nutricionalValue = nutricionalValue;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
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


	public int getNutricionalValue() {
		return nutricionalValue;
	}


	public void setNutricionalValue(int nutricionalValue) {
		this.nutricionalValue = nutricionalValue;
	}
	
	
	
}
