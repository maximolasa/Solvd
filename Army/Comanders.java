
public class Comanders {
	String name;
	int powerLevel;
	int nutricionalValue;
	int dmg;
	int health;
	
	
	private Comanders(String name, int powerLevel, int nutricionalValue, int dmg, int health) {
		this.name = name;
		this.powerLevel = powerLevel;
		this.nutricionalValue = nutricionalValue;
		this.dmg = dmg;
		this.health = health;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPowerLevel() {
		return powerLevel;
	}


	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}


	public int getNutricionalValue() {
		return nutricionalValue;
	}


	public void setNutricionalValue(int nutricionalValue) {
		this.nutricionalValue = nutricionalValue;
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
	
	
	
}
