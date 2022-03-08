package com.tns.client;
import com.tns.application.*;
import com.tns.framework.*;


public class Client {
	
	private static ShopFactory factory;
	private static NormalAcc normalAcc;
	private static PrimeAcc primeAcc;
	public static void main(String[] args) {
		
		 factory = new GSShopFactory();
		normalAcc=factory.getNewNormalAccount(101, "john", 2000, 50);
		normalAcc.bookProduct(500);
		
		primeAcc=factory.getNewPrimeAccount(102, "steve", 3000, false);
		primeAcc.bookProduct(700);
		
		System.out.println(normalAcc.toString());
		System.out.println(primeAcc.toString());
	}

}