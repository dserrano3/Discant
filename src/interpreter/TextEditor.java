package interpreter;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

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

import javax.swing.JSplitPane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ScrollPaneConstants;
import java.awt.Color;


/**
 * 
 * This is the class that runs the text editor with the option to run the code.
 *
 */
public class TextEditor extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JButton btnBorrar;
	private JButton btnEjecutar;
	private JScrollPane scrollPane;
	private JButton btnOpen;
	private JFileChooser fc;
	private JButton btnSave;
	private JSplitPane splitPane;
	private JTextArea codigo;
	private JTextArea numLineas;
	private int contLineas;
	
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
	 */
	public TextEditor() {
		initialize();
	}
	
	
	private void initialize(){
		setTitle("spanish_PL_textEditor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 472);
		setJMenuBar(getMenuBar_1());
		setContentPane(getContentPane());
		fc = new JFileChooser();
		contLineas = 1;
	}

	public JPanel getContentPane() {
		if( contentPane == null){
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			contentPane.add(getBtnEjecutar(), BorderLayout.SOUTH);
			contentPane.add(getScrollPane(), BorderLayout.CENTER);
		}
		return contentPane;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setToolTipText("");
			menuBar.add(getBtnBorrar());
			menuBar.add(getBtnGuardar());
			menuBar.add(getBtnOpen());
		}
		return menuBar;
	}
	private JButton getBtnBorrar() {
		if (btnBorrar == null) {
			btnBorrar = new JButton("Borrar");
			btnBorrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnBorrar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					codigo.setText("");
					numLineas.setText("1\n");
					contLineas = 1;
				}
			});
		}
		return btnBorrar;
	}
	private JButton getBtnEjecutar() {
		if (btnEjecutar == null) {
			btnEjecutar = new JButton("Ejecutar");
			btnEjecutar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnEjecutar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					OutputConsole.main(codigo.getText());
				}
			});
		}
		return btnEjecutar;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getSplitPane());
		}
		return scrollPane;
	}
	private JButton getBtnOpen() {
		if (btnOpen == null) {
			btnOpen = new JButton("Abrir");
			btnOpen.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					int returnVal = fc.showDialog(TextEditor.this, "Abrir");
					if (returnVal == JFileChooser.APPROVE_OPTION) {
			            File file = fc.getSelectedFile();
			            BufferedReader br;
						try {
							System.out.println(file.getAbsolutePath());
							br = new BufferedReader(new FileReader(file.getAbsoluteFile()));
							String line;
							codigo.setText("");
							while((line = br.readLine()) != null){
								codigo.append(line);
								codigo.append("\n");
							}
							numLineas.setText("1\n");
							contLineas = 1;
							setContLineas();
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
			btnSave = new JButton("Guardar");
			btnSave.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int returnVal = fc.showDialog(TextEditor.this, "Guardar");
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						File file = fc.getSelectedFile();
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
	private JSplitPane getSplitPane() {
		if (splitPane == null) {
			splitPane = new JSplitPane();
			splitPane.setRightComponent(getCodigo());
			splitPane.setLeftComponent(getNumLineas());
			splitPane.setDividerLocation(30);
			splitPane.setEnabled(false);
		}
		return splitPane;
	}
	private JTextArea getCodigo() {
		if (codigo == null) {
			codigo = new JTextArea();
			codigo.setWrapStyleWord(true);
			codigo.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					if(e.getKeyChar() == '\n' || e.getKeyChar() == 8)
					{
						setContLineas();
					}
				}
			});
			codigo.setFont(new Font("DialogInput", Font.PLAIN, 16));
			//codigo.setLineWrap(true);
			codigo.setTabSize(4);
		}
		return codigo;
	}
	
	private void setContLineas()
	{
		int currNumLineas = codigo.getLineCount();
		if(currNumLineas > contLineas)
		{
			do{
				numLineas.append(++contLineas +"\n");
			}while(contLineas < currNumLineas);
		}
		if(currNumLineas < contLineas)
		{
			int lineasBorrar = contLineas - currNumLineas;
			String lineas = numLineas.getText();
			int index = lineas.length();
			while(index >= 0 && lineasBorrar >= 0)
			{
				if(lineas.charAt(--index) == '\n')
					lineasBorrar--;
			}
			numLineas.setText(lineas.substring(0, index+1));
			contLineas = currNumLineas;
		}
	}
	private JTextArea getNumLineas() {
		if (numLineas == null) {
			numLineas = new JTextArea();
			numLineas.setForeground(Color.LIGHT_GRAY);
			numLineas.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
			numLineas.setFont(new Font("DialogInput", Font.PLAIN, 17));
			numLineas.append("1\n");
		}
		return numLineas;
	}
}
