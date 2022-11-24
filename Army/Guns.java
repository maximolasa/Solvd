
public class Guns {
	int dmg;
	String type;

	private Guns(int dmg, String type) {
		this.dmg = dmg;
		this.type = type;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
