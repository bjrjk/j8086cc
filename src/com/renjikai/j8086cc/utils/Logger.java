package com.renjikai.j8086cc.utils;

public class Logger {
	public static void throwError(String errMsg) {
		System.err.println();
		System.err.println(errMsg);
		System.exit(1);
	}
}
