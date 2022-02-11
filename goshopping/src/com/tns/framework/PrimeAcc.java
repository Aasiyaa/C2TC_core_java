package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
	
	 public PrimeAcc(int accNO, String accName, float charges, boolean isPrime) {
		super(accNO, accName, charges);
		this.isPrime = isPrime;
	}
	public void bookProduct(float charges)
	{
		
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", accNO=" + accNO + ", accName=" + accName + ", charges=" + charges
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
