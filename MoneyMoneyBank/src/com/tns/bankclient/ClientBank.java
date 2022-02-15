package com.tns.bankclient;

import com.tns.bankApplication.*;

import com.tns.bankFramework.*;


public class ClientBank {

	public static void main(String[] args) {
	BankFactory bf=new MMBankFactory();
	SavingAcc sa=new MMSavingAcc(2022600, "mark",10000, true);
	CurrentAcc ca=new MMCurrentAcc(2022601,"steve",20000,25000);
	
	
	ca.withdraw(15000);
	ca.deposit(10000);
	System.out.println(ca.toString());
	
	sa.withdraw(3000);
	sa.deposit(1000);
	System.out.println(sa.toString());
	
	}

}