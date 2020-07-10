package com.renjikai.j8086cc;
import com.renjikai.j8086cc.antlr.*;
import com.renjikai.j8086cc.backend.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.FileInputStream;
import java.io.IOException;

public class j8086cc {
	public static void main(String[] args) throws IOException {
		String filename = args[0];
		SyntaxTreeVisitor visitor = new SyntaxTreeVisitor();
		FileInputStream f = new FileInputStream(filename);
		ANTLRInputStream input = new ANTLRInputStream(f);
        j8086ccLexer lexer = new j8086ccLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        j8086ccParser parser = new j8086ccParser(tokens);
        if(parser.getNumberOfSyntaxErrors()>0) {
        	System.err.println("j8086c Code Syntax Error! Please check!");
        	System.exit(1);
        }
        ParseTree tree = parser.program();
        try {
        	visitor.visit(tree);
        }catch(Exception e) {
        	System.err.println("An Unexcepted Exception occured, j8086cc terminated. Please report this incident to developer.");
        	System.err.println(e);
        }
	}

}
