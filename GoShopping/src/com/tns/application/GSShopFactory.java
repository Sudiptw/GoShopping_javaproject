package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory	
{


	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharge) {
		
		GSNormalAcc gsnormal = new GSNormalAcc();
		return gsnormal; 
	}
	
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		
		GSPrimeAcc gsprime = new GSPrimeAcc();
		return gsprime;
		
	}
}
	
