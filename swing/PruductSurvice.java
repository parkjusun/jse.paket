package com.jse.swing;

public class PruductSurvice {
	private ProductBean[] Produtes;
	
	public PruductSurvice() {
		Produtes = new ProductBean[10];
	}
	
	public ProductBean[] getProdutes() {
		return Produtes;
	}
	
	public void setProdutes(ProductBean[] produtes) {
		Produtes = produtes;
	}
}
