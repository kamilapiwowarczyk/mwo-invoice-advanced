package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	public void addProduct(Product product) {
		// TODO: implement
	}

	public void addProduct(Product product, Integer quantity) {
		// TODO: implement
	}

	public BigDecimal getSubtotal() {
		return BigDecimal.ZERO;
	}

	public BigDecimal getTax() {
		return BigDecimal.ZERO;
	}

	public BigDecimal getTotal() {
		return BigDecimal.ZERO;
	}
}
