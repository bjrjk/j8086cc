package com.renjikai.j8086cc.preprocessor;

import java.io.IOException;
import java.util.HashSet;

import com.renjikai.j8086cc.utils.*;

public class PreProcessor {
	public final static String poweredByHeader = "// j8086cc PreProcessor by Jack Ren, Begin of File: ";
	public final static String poweredByFooter = "// j8086cc PreProcessor by Jack Ren, End of File: ";
	public static HashSet<String> headerFilenames = new HashSet<String>();
	public static String PreProcess(String filename) throws IOException{
		if(headerFilenames.contains(filename))
			return "";
		else
			headerFilenames.add(filename);
		String codes;
		if(filename.endsWith(".j8086h"))
			codes = TXTModifier.ReadInnerTXT("stl/" + filename);
		else
			codes = TXTModifier.ReadTXT(filename);
		String[] lines = codes.split("\n");
		StringBuffer buf = new StringBuffer();
		buf.append(poweredByHeader + filename + "\n");
		for(String codeLine: lines) {
			if(codeLine.startsWith("#include")) {
				String[] sArr = codeLine.split(" ");
				if(sArr.length != 2) {
					Logger.throwError(
							"PreProcessor: Macro INCLUDE syntax error! \n" +
							"On the following line: \n" +
							codeLine
							);
				}
				String j8086cHeaderFileName = sArr[1].strip();
				if(!j8086cHeaderFileName.endsWith(".j8086h")) {
					Logger.throwError(
							"PreProcessor: Macro INCLUDE header file not end with .j8086h! \n" +
							"For the file: " + j8086cHeaderFileName
							);
				}
				try {
					String headerContent = PreProcess(j8086cHeaderFileName);
					buf.append(headerContent);
				}catch(IOException e) {
					Logger.throwError(
							"PreProcessor: Macro INCLUDE header file IO error! \n" +
							"For the file: " + j8086cHeaderFileName
							);
				}
			}else{
				buf.append(codeLine+"\n");
			}
		}
		buf.append(poweredByFooter + filename + "\n");
		return buf.toString();
	}
}
