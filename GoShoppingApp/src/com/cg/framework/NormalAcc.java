package com.cg.framework;

public abstract class NormalAcc extends ShopAcc{
	private final float deliveryCharge;

	public float getDeliveryCharge() {
		return deliveryCharge;
	}

	public NormalAcc(int accNO, String accNm, float charges, float deliveryCharge) {
		super(accNO, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}

	public void bookProduct(float deliveryCharge) {
		System.out.println("The delivery charge of booked product is: "+deliveryCharge);
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
