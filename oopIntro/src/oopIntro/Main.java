package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 =new Product(0, "product1", 0,"pr1");
		ProductManager pm = new ProductManager();
		pm.addToCart(product1);
	}

}