package com.cg.application;

import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc gsp = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return gsp;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharge) {
		GSNormalAcc gsn = new GSNormalAcc(accNo, accNm, deliveryCharge, deliveryCharge);
		return gsn;
	}
	
}
