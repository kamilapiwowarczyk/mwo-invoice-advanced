package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.HashMap;
//import java.util.Map;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	HashMap<Product, Integer> products = new HashMap<Product, Integer>();
	public void addProduct(Product product) {
		// TODO: implement
		products.put(product, 1);
	}

	public void addProduct(Product product, Integer quantity) {
		// TODO: implement
		if (quantity<1){
		    throw new IllegalArgumentException();
		}
        products.put(product, quantity);
	}

	public BigDecimal getSubtotal() {
		BigDecimal subtotal = BigDecimal.ZERO;
		for (Product key: products.keySet()){
			subtotal = subtotal.add((key.getPrice()).multiply(BigDecimal.valueOf(products.get(key))));
		}
		return subtotal;
	}

	public BigDecimal getTax() {
		BigDecimal tax = BigDecimal.ZERO;
		tax = (this.getTotal()).subtract(this.getSubtotal());
		return tax;
	}

	public BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (Product key: products.keySet()){
			total = total.add((key.getPriceWithTax()).multiply(BigDecimal.valueOf(products.get(key))));
		}
		return total;
	}
}
