
public class Infantry {
	int number;
	int dmg;
	int health;

	private Infantry(int number, int dmg, int health) {
		this.number = number;
		this.dmg = dmg;
		this.health = health;
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
	
}
