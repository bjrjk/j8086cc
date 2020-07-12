package com.renjikai.j8086cc;
import com.renjikai.j8086cc.antlr.*;
import com.renjikai.j8086cc.intermediate.*;
import com.renjikai.j8086cc.codegen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.*;
import java.io.IOException;

public class j8086cc {
	public static void WriteTXT(String s,String path) throws IOException{
		FileWriter f=new FileWriter(path);
		f.write(s);
		f.flush();
		f.close();
	}
	public static void main(String[] args) throws IOException {
		String filename = args[0];
		SyntaxTreeVisitor HLLvisitor = new SyntaxTreeVisitor();
		FileInputStream f = new FileInputStream(filename);
		ANTLRInputStream HLLInput = new ANTLRInputStream(f);
        j8086ccLexer HLLLexer = new j8086ccLexer(HLLInput);
        CommonTokenStream HLLTokens = new CommonTokenStream(HLLLexer);
        j8086ccParser HLLParser = new j8086ccParser(HLLTokens);
        if(HLLParser.getNumberOfSyntaxErrors()>0) {
        	System.err.println("j8086c Code Syntax Error! Please check!");
        	System.exit(1);
        }
        ParseTree HLLTree = HLLParser.program();
        String IR=HLLvisitor.visit(HLLTree);
        System.err.println("IR:");
        System.out.println(IR);
    	WriteTXT(IR,filename+".j8086cInter");
    	ANTLRInputStream InterInput = new ANTLRInputStream(IR);
        j8086cInterLexer InterLexer = new j8086cInterLexer(InterInput);
        CommonTokenStream InterTokens = new CommonTokenStream(InterLexer);
        j8086cInterParser InterParser = new j8086cInterParser(InterTokens);
        if(InterParser.getNumberOfSyntaxErrors()>0) {
        	System.err.println("j8086cInter Code Syntax Error! Please check!");
        	System.exit(1);
        }
        ParseTree InterTree = InterParser.program();
        IRVisitor InterVisitor = new IRVisitor();
        String ASM8086=InterVisitor.visit(InterTree);
        System.err.println("8086:");
        System.out.println(ASM8086);
    	WriteTXT(ASM8086,filename+".8086.asm");
	}

}
