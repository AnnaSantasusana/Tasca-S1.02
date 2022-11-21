public class Main_Product {
	
	public static void main(String[] args) throws EmptySaleException {
		
		Sale sale = new Sale();
		
		//En aquest moment l'ArrayList està buida i s'imprimeix el missatge d'error
		sale.calculateTotal();
		
		Product product1 = new Product("Apple", 1);
		Product product2 = new Product ("Rice", 3);
		Product product3 = new Product ("Oil", 5);
		
		sale.productCollection.add(product1);
		sale.productCollection.add(product2);
		sale.productCollection.add(product3);
		
		//Ara que ja hem omplert l'ArrayList, es calcularà el preu total
		sale.calculateTotal();
		
		//ArrayIndexOutOfBounds Exception
		sale.exceptionArray();
		
		
	
		
		

	}
	

}
