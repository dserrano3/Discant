package co.edu.javeriana.interpreter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import co.edu.javeriana.interpreter.antlr.LenguajeLexer;
import co.edu.javeriana.interpreter.antlr.LenguajeParser;

public class Main {

	public static void main(String args[]) throws IOException {

		TextEditor.main(null);
		/*LenguajeLexer lexer = new LenguajeLexer(new ANTLRFileStream("tokentest.cfpp"));// tokentest.cfpp
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		LenguajeParser parser = new LenguajeParser(tokens);

		try {
			parser.programa();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}*/
	}

	public static String GUI(String data) throws IOException {

		// con data crear archivo de tokens
		File outFile = new File("tokentest.cfpp");
		FileOutputStream outFileStream = null;
		PrintWriter outStream = null;

		outFileStream = new FileOutputStream(outFile);
		outStream = new PrintWriter(outFileStream);
		outStream.print(data);
		outStream.close();

		LenguajeLexer lexer = new LenguajeLexer(new ANTLRFileStream(
				"tokentest.cfpp"));// tokentest.cfpp
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		LenguajeParser parser = new LenguajeParser(tokens);

		try {
			String output = parser.programa().toString();
			System.out.println("output "+output);
			return output;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		return null;
	}

}
