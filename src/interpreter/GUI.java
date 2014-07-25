package interpreter;

import interpreter.antlr.LenguajeLexer;
import interpreter.antlr.LenguajeParser;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.Rectangle;
import java.io.IOException;
import java.nio.charset.CodingErrorAction;

import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;



/**
 * Simple interface, it runs in a new window to write the code, but outputs in
 * the Java terminal.
 * 
 */
public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JButton Ejecutar = null;
	private JTextArea codigo = null;

	/**
	 * @throws HeadlessException
	 */
	public GUI() throws HeadlessException {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GUI(GraphicsConfiguration arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @throws HeadlessException
	 */
	public GUI(String arg0) throws HeadlessException {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GUI(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * This method initializes Ejecutar
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getEjecutar() {
		if (Ejecutar == null) {
			Ejecutar = new JButton();
			Ejecutar.setBounds(new Rectangle(204, 482, 169, 32));
			Ejecutar.setText("Ejecutar");
			Ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					try {
						Main.GUI(codigo.getText());
					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (Exception error) {
						System.out.println(error.getMessage());
					}
				}
			});
		}
		return Ejecutar;
	}

	/**
	 * This method initializes codigo
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getCodigo() {
		if (codigo == null) {
			codigo = new JTextArea();
			codigo.setBounds(new Rectangle(46, 15, 481, 454));
		}
		return codigo;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GUI thisClass = new GUI();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(571, 574);
		this.setContentPane(getJContentPane());
		//TODO change for the real name.
		this.setTitle("Cafe++");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getEjecutar(), null);
			jContentPane.add(getCodigo(), null);
		}
		return jContentPane;
	}

} // @jve:decl-index=0:visual-constraint="66,10"
