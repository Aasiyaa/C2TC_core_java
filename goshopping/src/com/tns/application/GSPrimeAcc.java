package com.tns.application;
import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	private static final float charges=0;
	public GSPrimeAcc(int accNO, String accName, float charges, boolean isPrime)
	{
		super(accNO, accName, charges, isPrime);
		
	}
	public void bookProduct(float charges)
	{
		
	}
	@Override
	public String toString() {
		return "GSPrimeAcc [accNO=" + accNO + ", accName=" + accName + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
