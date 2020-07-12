package com.jy.product;

public class TestMain {

	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		Buy b = new Buy();
		Buy b2 = new Buy();
		
		
		b.setMoney(400);
		System.out.println("----------------");
		b.add(c);
		b.add(t);
		
		
		
		System.out.println("--------");
		b.remove(t);
		
		b.myList();
		b.myMoney();
		
		
	}

}
