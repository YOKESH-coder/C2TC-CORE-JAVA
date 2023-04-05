package com.cg.application;

import com.cg.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	private static final float charges = 100;
	
	public GSPrimeAcc(int accNO, String accNm, float charges, boolean isPrime) {
		super(accNO, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges) {
		System.out.println("Dear Prime user!! Your product charge is: "+charges);
	}
	
	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
