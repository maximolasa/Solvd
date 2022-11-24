
public class Explosive {
	int amount;
	int dmg;
	
	
	private Explosive(int amount, int dmg) {
		this.amount = amount;
		this.dmg = dmg;
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
	
	
}
