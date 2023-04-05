package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(10101, "Yokesh", 25.66f, true);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		CurrentAcc ca = new MMCurrentAcc(12000, "Sanjay", 20000f, 1000f);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
	}

}
