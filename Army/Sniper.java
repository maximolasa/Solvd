
public class Sniper {
	String name;
	int dmg; 
	int health;
	int nutricionalValue;

	
	
	private Sniper(String name, int health, int dmg, int nutricionalValue) {
		this.name = name;
		this.health = health;
		this.dmg  = dmg;
		this.nutricionalValue = nutricionalValue;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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
