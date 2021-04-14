package com.renjikai.j8086cc.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import com.renjikai.j8086cc.j8086cc;

public class TXTModifier {
	public static void WriteTXT(String s, String path) throws IOException {
		FileWriter f = new FileWriter(path);
		f.write(s);
		f.flush();
		f.close();
	}

	public static String ReadTXT(String path) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(path));
		StringBuffer buffer = new StringBuffer();
		String line = "";
		while ((line = in.readLine()) != null) {
			buffer.append(line + "\n");
		}
		String str = buffer.toString();
		return str;
	}

	public static String ReadInnerTXT(String path) throws IOException {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(j8086cc.class.getClassLoader().getResourceAsStream(path)));
		StringBuffer buffer = new StringBuffer();
		String line = "";
		while ((line = in.readLine()) != null) {
			buffer.append(line + "\n");
		}
		String str = buffer.toString();
		return str;
	}
}
