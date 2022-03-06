package com.tns.framework;

public class PrimeAcc extends ShopAcc {

	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		PrimeAcc.isPrime=isPrime;
	}
	public static boolean isPrime;
	@Override
	public String toString() {
		return "PrimeAcc [getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
	
}
