package com.jy.product;

public class Product {
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
		System.out.println("제품이름 : " + getName()
		 + " 제품가격 : " + getPrice());
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return String.format("%s",name);
	}
	
	
}
