package com.tns.Client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;



public class Client 
{
	public static void main(String[] args) 
	{
		// Step 1 - Step a
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAccount(2325, "Sudipt", 1000, true);
		gssfactory.getNewNormalAccount(2049, "Vivek", 2000, 50);
		
		
		// Step 2
		GSPrimeAcc gsprime = new GSPrimeAcc();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharges();
		// Step 4 / Step d.
		gsprime.bookProducts(1000);
		
		// Step 5 / Step e.
		gsprime.toString();
//****************************************************************************
		// Step 3
		GSNormalAcc gsnormal = new GSNormalAcc(); 
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharge();
		
		// Step 4 / Step d.
		gsnormal.bookProduct(100);
		// Step 5 / Step e.
		gsnormal.toString();
	
		

	}

}
