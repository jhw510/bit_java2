package com.jse.member;

public class ProductService {

	private Product[] products;

	public ProductService() {
		products = new Product[10];
	}
	public  void setProducts(Product[] products) {
		this.products = products;
	}
	public  Product[] getProducts() {
		return products;
	}
}
