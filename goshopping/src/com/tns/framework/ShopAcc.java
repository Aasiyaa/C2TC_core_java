package com.tns.framework;

public abstract class ShopAcc 
{
	protected int accNO;
	protected String accName;
	protected float charges;
	 public void bookProduct(float charges)
	{
		
	}
	public void items(float charges)
	{
		
	}
	
	 public ShopAcc(int accNO, String accName, float charges) {
		super();
		this.accNO = accNO;
		this.accName = accName;
		this.charges = charges;
	}
	
	@Override
	public String toString() {
		return "ShopAcc [accNO=" + accNO + ", accName=" + accName + ", charges=" + charges + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
