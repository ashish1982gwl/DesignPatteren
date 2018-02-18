package com.ashish.behaviour.strategy;

public class DebitCard implements Payment{
	private String cardNo;
	private String CVV;
	private String expire;

		public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCVV() {
		return CVV;
	}

	@Override
	public String toString() {
		return "CreditCard [cardNo=" + cardNo + ", CVV=" + CVV + ", expire=" + expire + "]";
	}

	public void setCVV(String cVV) {
		CVV = cVV;
	}

	public String getExpire() {
		return expire;
	}

	public void setExpire(String expire) {
		this.expire = expire;
	}

		@Override
		public void pay(int amount) {
			System.out.println( amount+ "rs. amount paied by DebitCard");
			
		}

}
