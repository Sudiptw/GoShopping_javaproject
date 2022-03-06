package com.tns.application;

import com.tns.framework.NormalAcc;
//
public  class GSNormalAcc  extends NormalAcc{

	public GSNormalAcc() {
		super(accNo, accNm, deliveryCharge, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges) {
		System.out.println("Dear Normal User, Your Charges are: "+charges+" with Delivery Charges is: "+deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getDeliveryCharge()=" + getDeliveryCharge()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public String getDeliveryCharge() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
