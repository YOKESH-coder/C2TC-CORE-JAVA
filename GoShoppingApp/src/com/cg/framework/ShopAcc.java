package com.cg.framework;

public abstract class ShopAcc {
	
	private int accNO;
	private String accNm;
	private float charges;
	
	public ShopAcc(int accNO, String accNm, float charges) {
		super();
		this.accNO = accNO;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	public int getAccNO() {
		return accNO;
	}



	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}



	public String getAccNm() {
		return accNm;
	}



	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}



	public float getCharges() {
		return charges;
	}



	public void setCharges(float charges) {
		this.charges = charges;
	}



	public void bookProduct(float charges) {
		System.out.println("Product is booked and charge is: "+charges);
	}
	
	public void items(float charges) {
		System.out.println("Items are delivered and charge is: "+charges);
	}

	@Override
	public String toString() {
		return "ShopAcc [accNO=" + accNO + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
		
}
