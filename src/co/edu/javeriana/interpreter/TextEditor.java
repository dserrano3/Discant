package co.edu.javeriana.interpreter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TextEditor extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JButton btnBorrar;
	private JButton btnEjecutar;
	private JScrollPane scrollPane;
	private JTextArea codigo;

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
		}
		return menuBar;
	}
	private JButton getBtnBorrar() {
		if (btnBorrar == null) {
			btnBorrar = new JButton("Borrar");
			btnBorrar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					codigo.setText("");
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
			scrollPane.setViewportView(getCodigo());
		}
		return scrollPane;
	}
	private JTextArea getCodigo() {
		if (codigo == null) {
			codigo = new JTextArea();
			codigo.setFont(new Font("DialogInput", Font.PLAIN, 16));
			codigo.setWrapStyleWord(true);
			codigo.setLineWrap(true);
			codigo.setTabSize(4);
		}
		return codigo;
	}
}
