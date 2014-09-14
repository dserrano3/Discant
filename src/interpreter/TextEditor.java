package interpreter;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFileChooser;
import javax.swing.JMenuBar;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import org.fife.ui.rsyntaxtextarea.*;
import org.fife.ui.rtextarea.*;

/**
 * 
 * This is the class that runs the text editor with the option to run the code.
 * 
 * In order to make work the flex file, you must generate it in the web page: ,
 * and then with the generated file, you have to erase the 3 duplicated
 * methods(erase the second one always), change the constructor to: public
 * EditorTokenMaker() { } and finally there are 2 conditionals you have to
 * change, in the if(zzCurrentPosL < zzEndReadL) change the lines inside the if
 * to: zzInput = zzBufferL[zzCurrentPosL++]; Also inside the else of that if
 * there is a condition. if (eof), change the lines inside the else to. zzInput
 * = zzBufferL[zzCurrentPosL++];
 */
public class TextEditor extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	//private JButton btnBorrar;
	private JButton btnEjecutar;
	private RTextScrollPane rtScrollPane;
	private JButton btnOpen;
	private JFileChooser fc;
	private JButton btnSave;
	private RSyntaxTextArea codigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextEditor frame = new TextEditor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public TextEditor() throws IOException {
		initialize();
	}

	private void initialize() throws IOException {
		setTitle("Discant");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 472);
		setJMenuBar(getMenuBar_1());
		setContentPane(getContentPane());
		fc = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Discant files (*.dis)", "dis");
		fc.setFileFilter(filter);;
	}

	public JPanel getContentPane() {
		if (contentPane == null) {
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			contentPane.add(getBtnEjecutar(), BorderLayout.SOUTH);
			contentPane.add(getRTextScrollPane(), BorderLayout.CENTER);
		}
		return contentPane;
	}

	private JMenuBar getMenuBar_1() throws IOException {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setToolTipText("");
			menuBar.add(getBtnGuardar());
			menuBar.add(getBtnOpen());
		}
		return menuBar;
	}

	

	private JButton getBtnEjecutar() {
		if (btnEjecutar == null) {
			btnEjecutar = new JButton("Run");
			URL url = TextEditor.class.getResource("/play.png");
			ImageIcon img = new ImageIcon(url);
			btnEjecutar.setIcon((img));
			btnEjecutar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnEjecutar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// El ; adicional es por que antlr no puede reconocer muy
					// bien el EOF, entonces se le agrega un ; al final de todo
					// el codigo por si al usuario se le olvido poner ; en la
					// ultima linea.
					OutputConsole.main(codigo.getText() + ";");
				}
			});
		}
		return btnEjecutar;
	}

	private RTextScrollPane getRTextScrollPane() {
		if (rtScrollPane == null) {
			rtScrollPane = new RTextScrollPane(getRSyntaxTextArea());
			rtScrollPane.setViewportView(getRSyntaxTextArea());
		}
		return rtScrollPane;
	}

	private JButton getBtnOpen() throws IOException {
		if (btnOpen == null) {
			btnOpen = new JButton("Open");
			URL url = TextEditor.class.getResource("/open.png");
			ImageIcon img = new ImageIcon(url);
			btnOpen.setIcon((img));
			btnOpen.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {

					int returnVal = fc.showDialog(TextEditor.this, "Abrir");
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						File file = fc.getSelectedFile();
						BufferedReader br;
						try {
							System.out.println(file.getAbsolutePath());
							br = new BufferedReader(new FileReader(file
									.getAbsoluteFile()));
							String line;
							codigo.setText("");
							while ((line = br.readLine()) != null) {
								codigo.append(line);
								codigo.append("\n");
							}
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

				}
			});
		}
		return btnOpen;
	}

	private JButton getBtnGuardar() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			URL url = TextEditor.class.getResource("/save.png");
			ImageIcon img = new ImageIcon(url);
			btnSave.setIcon((img));
			btnSave.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int returnVal = fc.showDialog(TextEditor.this, "Guardar");
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						File file = fc.getSelectedFile();
						String suffix = ".dis";
						if(!fc.getSelectedFile().getAbsolutePath().endsWith(suffix)){
							file = new File(fc.getSelectedFile() + suffix);
						}
						FileOutputStream outFileStream = null;
						PrintWriter outStream = null;

						try {
							outFileStream = new FileOutputStream(file);
							outStream = new PrintWriter(outFileStream);
							outStream.print(codigo.getText());
							outStream.close();
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}
				}
			});
		}
		return btnSave;
	}

	private RSyntaxTextArea getRSyntaxTextArea() {
		if (codigo == null) {
			codigo = new RSyntaxTextArea();
			AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory) TokenMakerFactory
					.getDefaultInstance();
			atmf.putMapping("text/myLanguage", "parcer.EditorTokenMaker");
			codigo.setSyntaxEditingStyle("text/myLanguage");
			// codigo.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
			codigo.setWrapStyleWord(true);
			codigo.setFont(new Font("DialogInput", Font.PLAIN, 16));
			// codigo.setLineWrap(true);
			codigo.setTabSize(4);
		}
		return codigo;
	}

}
