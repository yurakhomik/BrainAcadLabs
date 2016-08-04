package _3_3_database_connectivity.lab;

public class ShoppingCard {

	public static void main(String[] args) {
		GoodsDB.goodsDBDemo();
	}


	private String name;
	private double protein;
	private double cargohybrate;
	private double fat;

	public String getName() {
		return name;
	}

	public double getProtein() {
		return protein;
	}

	public double getCargohybrate() {
		return cargohybrate;
	}

	public double getFat() {
		return fat;
	}

	public ShoppingCard(String name, double protein, double cargohybrate, double fat) {
		this.name = name;
		this.protein = protein;
		this.cargohybrate = cargohybrate;
		this.fat = fat;
	}

}
