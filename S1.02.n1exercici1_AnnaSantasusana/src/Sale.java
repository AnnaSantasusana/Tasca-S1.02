import java.util.ArrayList;

public class Sale {

	private float totalPrice;
	ArrayList<Product> productCollection;
	
	public Sale() {
		productCollection = new ArrayList<>();
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public ArrayList<Product> getProductCollection() {
		return productCollection;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public void setProductCollection(ArrayList<Product> productCollection) {
		this.productCollection = productCollection;
	}
	
	public void calculateTotal() {
		try {
			if (productCollection.size() == 0) {
				throw new EmptySaleException("To make a sale you must first add products");
			} else {
				for (int i = 0; i < productCollection.size(); i++) {
					totalPrice += productCollection.get(i).getPrice();
				}
				System.out.println(totalPrice);
			}
		} catch (EmptySaleException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void exceptionArray() {
		try {
			for (int i = 0; i <= 3; i++) {
				totalPrice += productCollection.get(i).getPrice();
			}
			System.out.println(totalPrice);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds");
		}
	}
	
}
