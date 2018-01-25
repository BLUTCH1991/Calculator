package com.imie.calculator;

public class Divide {

	/**
	 *
	 */
	protected int value = 0;

	/**
	 *
	 * @param a
	 */
	public Divide(int a) {
		this.value = a;
	}

	/**
	 *
	 * @param b
	 */
	public void make(int b) {
		if (b == 0) {
			this.value = Integer.MIN_VALUE;
		}else {
			this.value /= b;
		}
	}

	/**
	 *
	 * @return
	 */
	public int getValue() {
		return this.value;
	}
}
