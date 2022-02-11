package com.tns.framework;

public abstract class ShopFactory {

	  public abstract PrimeAcc getNewPrimeAccount(int accNO,Sting accName,float charges,boolean isPrime)
	  {
		  
	  }
	 public abstract NormalAcc getNormalAccount(int accNo,String accName,float charges,float deliveryCharges)
	 {
		 
	 }
	
	
	
	
	
}
