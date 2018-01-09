package com.wen.train;

public class Ticket {

	// "2018-01-08","18:30","松山","八堵","65"
	// 另有來回票 票價打85折
	int amount;
	float discount = 0.15f;

	public Ticket(int amount) {
		this.amount = amount;
	}

	public void print() {
		int ticket = (int) (amount * (1 - discount));
		System.out.println(amount + "\t" + ticket);
	}

	public Ticket() {
	}
}
