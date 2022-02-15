package com.tns.bankApplication;

import com.tns.bankFramework.*;


public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accName, float accBal, boolean isSalaried) {

		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accName, float accBal, float creditLimit) {

		return null;
	}

}