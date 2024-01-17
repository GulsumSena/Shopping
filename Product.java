package Shopping;

public class Product {
	private String name;
	private double price;
	private String color;
	
	public Product(String name, double price, String color) {
		this.name=name;
		this.price=price;
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	public String info() {
		return RenkCo.GREEN+this.name+RenkCo.RESET+"\nRenk: "+this.color+"\nFiyat: "+this.price+" TL";
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
