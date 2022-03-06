package com.tns.framework;

public class NormalAcc extends ShopAcc {

	protected static float deliveryCharge=50;

	// Parameterized Constructor of NormalAcc with ShopAcc Parameters;
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		NormalAcc.deliveryCharge = deliveryCharge;
	}
	
	public void bookProduct(float deliveryCharge) {
		System.out.println("Charges are "+deliveryCharge);
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + "]";
	}
	
	
	
}
