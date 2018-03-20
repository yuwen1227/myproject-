package com.java2.object;

public class ABNumbers {
	String number;

	public ABNumbers(String number) {
		this.number = number;
	}

	public int validate(String secret) {
		int length = secret.length();
		int result = 0;
		for (int i = 0; i < length; i++) {
			char c = number.charAt(i);
			for (int j = 0; j < length; j++) {
				if (c == secret.charAt(j)) {
					if (i == j) {
						result = result + 10;
					} else {
						result = result + 1;
					}
					break;
				}
			}
		}
		return result;
	}
}