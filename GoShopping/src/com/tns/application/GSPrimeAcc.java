package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{

	
private static float charges=0;

	public GSPrimeAcc() {
		super(accNo, accNm, charges, isPrime);
		
	}

	public void bookProducts (float charges) {
		System.out.println("Dear Prime User, Your Product Charges are: "+charges);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [Charges=" + charges + "]";
	}
	
}
