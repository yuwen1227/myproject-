package com.wen.train;

public class Ticket {

	// "2018-01-08","18:30","�Q�s","�K��","65"
	// �t���Ӧ^�� ������85��
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
