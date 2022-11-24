
public class Food {
	int amount;
	int nutricionalValue;
	
	
	private Food(int amount, int nutricionalValue) {
		this.amount = amount;
		this.nutricionalValue = nutricionalValue;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public int getNutricionalValue() {
		return nutricionalValue;
	}


	public void setNutricionalValue(int nutricionalValue) {
		this.nutricionalValue = nutricionalValue;
	}
	
	
}
