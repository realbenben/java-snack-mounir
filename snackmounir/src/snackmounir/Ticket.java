package snackmounir;
// ici on creer les objets avec ces parametres et on l instancie
public class Ticket {
	private int order;
	private String product;
	private int quantity;
	private int price;

	public Ticket(String Product, int Quantity, int Price) {

		this.product = Product;
		this.quantity = Quantity;
		this.price = Price;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}