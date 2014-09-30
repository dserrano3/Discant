package interpreter;

import interpreter.antlr.LenguajeLexer;
import interpreter.antlr.LenguajeParser;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

import antlr.RecognitionException;

public class NoGui {
	public static void main(String args[]) throws org.antlr.runtime.RecognitionException, Exception {
		
		LenguajeLexer lexer = new LenguajeLexer(new ANTLRFileStream(
				args[0]));// tokentest.cfpp
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		LenguajeParser parser = new LenguajeParser(tokens);

		try {
			parser.programa();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
	}

}
