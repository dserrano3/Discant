package interpreter;

import interpreter.antlr.LenguajeLexer;
import interpreter.antlr.LenguajeParser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


public class Main {

	/**
	 * pop up message for errors.
	 */
	public static void infoBox(String infoMessage, String location)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + location, JOptionPane.INFORMATION_MESSAGE);
    }
	
	public static void main(String args[]) throws IOException {
		TextEditor.main(null);
	}
	/**
	 * Runs the program using the code in tokentest.cfpp
	 * 
	 * @param data
	 * @return
	 * @throws IOException
	 */
	public static String GUI(String data) throws IOException, Exception {
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
			System.out.println("output " + output);
			return output;
		} catch (RecognitionException e) {
			String errorMessage = "There was an error in the position " + e.line +" : "+e.charPositionInLine+"\n"+e.input;
			infoBox(errorMessage, "Syntax error");
			
		}
		return null;
	}

}
