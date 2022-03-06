package com.tns.framework;

public abstract class ShopAcc {

	
	protected static int accNo;
	protected static String accNm;
	private float charges;
	
	
	/**
	 * @return the accNo
	 */
	public int getAccNo() {
		return accNo;
	}
	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(int accNo) {
		ShopAcc.accNo = accNo;
	}
	/**
	 * @return the accNm
	 */
	public String getAccNm() {
		return accNm;
	}
	/**
	 * @param accNm the accNm to set
	 */
	public void setAccNm(String accNm) {
		ShopAcc.accNm = accNm;
	}
	/**
	 * @return the charges
	 */
	public float getCharges() {
		return charges;
	}
	/**
	 * @param charges the charges to set
	 */
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public ShopAcc(int accNo, String accNm, float charges) {
		ShopAcc.accNo = accNo;
		ShopAcc.accNm = accNm;
		this.charges = charges;
	}
void bookProduct(float charges) {};
	
	public  void items (float charges) {};
	
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	
	
}
