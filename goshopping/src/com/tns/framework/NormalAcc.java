package com.tns.framework;

public abstract class NormalAcc extends ShopAcc
{
	private final float deliveryCharges;
	public void bookProduct(float deliveryCharges)
	{
		
	}
	
	public NormalAcc(int accNO, String accName, float charges, float deliveryCharges) {
		super(accNO, accName, charges);
		this.deliveryCharges = deliveryCharges;
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", accNO=" + accNO + ", accName=" + accName
				+ ", charges=" + charges + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
