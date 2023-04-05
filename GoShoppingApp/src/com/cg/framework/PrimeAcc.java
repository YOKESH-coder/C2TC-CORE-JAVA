package com.cg.framework;

public abstract class PrimeAcc extends ShopAcc{	
	private boolean isPrime;
	private static final float deliveryCharge = 45.00f; 

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	public static float getDeliverycharge() {
		return deliveryCharge;
	}

	public PrimeAcc(int accNO, String accNm, float charges, boolean isPrime) {
		super(accNO, accNm, charges);
		this.isPrime = isPrime;
	}

	public void bookProduct(float charges) {
		System.out.println("The product price is: "+charges);
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}