package com.jy.product;

import java.util.ArrayList;
import java.util.List;

public class Buy {
	List<Product> arr = new ArrayList();
	private int money;

	public Buy() {
		int i = 1;
		System.out.printf("%d 손님입장",i);
		i++;
		
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	// 구매하는 것
	public void add(Product p) {
		int price = p.getPrice();
		if (money >= p.getPrice()) {
			System.out.println(p.getName() + "물건을 구매합니다");
			money -= p.getPrice();
			myMoney();
			arr.add(p);
		} else if (money < p.getPrice()) {
			System.out.printf("금액이 %d원 부족하여 구매불가", price -= money);
		}

	}

	// 잔금확인
	public void myMoney() {
		System.out.println("현재 잔금 : " + money);
	}
	
	// 구매리스트
	public void myList() {
		System.out.println("\n== 구매목록 == ");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));

		}

	}
	
	// 환불
	public void remove(Product p) {
		System.out.println(p.getName() + "을 환불합니다");
		System.out.println("환불금액 : " + p.getPrice());
		money += p.getPrice();
		arr.remove(p);
	}
	
	
	

}
