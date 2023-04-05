package com.cg.application;

import com.cg.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{
	public GSNormalAcc(int accNO, String accNm, float charges, float deliveryCharge) {
		super(accNO, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float deliveryCharge) {
		System.out.println("Normal user!! Your product charge is: "+ getCharges() +" and delivery charge is: "+deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}
