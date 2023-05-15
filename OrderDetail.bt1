package com.mycompany.tan.bai1;
class OrderDetail {
    private int quantity;
    private Product product;

    public OrderDetail(int quantity, Product product1) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantily(int quantity) {
		this.quantity = quantity;
	}

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
		this.product = product;
    }

    @Override
    public String toString() {
        return "Product: " + product.getProductID() + " - " + product.getDescription() + "\n" + "Quantity: " + quantity;
    }
    public double calcTotalPrice() {
		return quantity * product.getprice();
		
	}
}
