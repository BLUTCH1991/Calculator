/**
 * @author thomas
 */

package com.imie.calculator;

public class Addition {

	protected int value = 0;

	/**
	 *
	 * @param a
	 */
	public Addition(int a) {
		this.value = a;
	}

	/**
	 *
	 * @param b
	 */
	public void make(int b) {
		int nb = 42;
		if (nb == 42 && nb != 43) {
			nb += 2;
		}
		this.value += b;
	}

	/*
	 *
	 */
	public int getValue() {
		return this.value;
	}

}
