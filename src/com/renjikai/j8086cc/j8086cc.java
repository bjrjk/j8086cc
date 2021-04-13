package com.renjikai.j8086cc;
import com.renjikai.j8086cc.antlr.*;
import com.renjikai.j8086cc.intermediate.*;
import com.renjikai.j8086cc.codegen.*;
import com.renjikai.j8086cc.preprocessor.*;
import com.renjikai.j8086cc.utils.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.*;
import java.io.IOException;

public class j8086cc {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		if(args.length==0) {
			Logger.throwError("Please pass a j8086c code file!");
		}
		String j8086cFilename = args[0];
		if(!j8086cFilename.endsWith(".j8086c")) {
			Logger.throwError("Input file extension is not .j8086c!");
		}
		String baseFilename = j8086cFilename.substring(0, j8086cFilename.length() - 7);
		String preprocessedFilename = baseFilename + ".j8086p";
		String IRFilename = baseFilename + ".j8086i";
		String ASMFilename = baseFilename + ".j8086s";
		String preProcessedCodes = PreProcessor.PreProcess(j8086cFilename);
		TXTModifier.WriteTXT(preProcessedCodes, preprocessedFilename);
		SyntaxTreeVisitor HLLvisitor = new SyntaxTreeVisitor();
		FileInputStream f = new FileInputStream(preprocessedFilename);
		ANTLRInputStream HLLInput = new ANTLRInputStream(f);
        j8086ccLexer HLLLexer = new j8086ccLexer(HLLInput);
        CommonTokenStream HLLTokens = new CommonTokenStream(HLLLexer);
        j8086ccParser HLLParser = new j8086ccParser(HLLTokens);
        if(HLLParser.getNumberOfSyntaxErrors()>0) {
        	Logger.throwError("j8086c Code Syntax Error! Please check!");
        }
        ParseTree HLLTree = HLLParser.program();
        String IR=HLLvisitor.visit(HLLTree);
        TXTModifier.WriteTXT(IR, IRFilename);
    	ANTLRInputStream InterInput = new ANTLRInputStream(IR);
        j8086cInterLexer InterLexer = new j8086cInterLexer(InterInput);
        CommonTokenStream InterTokens = new CommonTokenStream(InterLexer);
        j8086cInterParser InterParser = new j8086cInterParser(InterTokens);
        if(InterParser.getNumberOfSyntaxErrors()>0) {
        	Logger.throwError("j8086cInter Code Syntax Error! Please check!");
        }
        ParseTree InterTree = InterParser.program();
        IRVisitor InterVisitor = new IRVisitor();
        InterVisitor.visit(InterTree);
        String ASM8086=TXTModifier.ReadInnerTXT("asm/template.asm");
        ASM8086=ASM8086.replace("%%DATA_TEXT%%", InterVisitor.dataSegStr);
        ASM8086=ASM8086.replace("%%CODE_TEXT%%", InterVisitor.codeSegStr);
        TXTModifier.WriteTXT(ASM8086, ASMFilename);
	}
}