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
		this.value += b;
	}

	/*
	 *
	 */
	public int getValue() {
		return this.value;
	}

}
