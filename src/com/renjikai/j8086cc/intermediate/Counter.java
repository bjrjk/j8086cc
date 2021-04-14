package com.renjikai.j8086cc.intermediate;

public class Counter {
	private int cnt = 0;

	public int getNewID() {
		return cnt++;
	}

	public String getNewStringID() {
		String s = String.valueOf(cnt);
		cnt++;
		return s;
	}
}
