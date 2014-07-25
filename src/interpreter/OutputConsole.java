package interpreter;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultCaret;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;

public class OutputConsole extends JFrame {

	private JPanel contentPane;

	private static String codigo;
	
	/**
	 * pop up message for errors.
	 */
	public static void infoBox(String infoMessage, String location)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + location, JOptionPane.INFORMATION_MESSAGE);
    }
	
	/**
	 * Launch the application.
	 */
	public static void main(String _codigo) {
		codigo = _codigo;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OutputConsole frame = new OutputConsole();
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
	public OutputConsole() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JLabel lblSalida = new JLabel("SALIDA");
		contentPane.add(lblSalida, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		JTextArea outputTextArea = new JTextArea();
		scrollPane.setViewportView(outputTextArea);

		try {
			String output = Main.GUI(codigo);
			if (output != null)
				outputTextArea.setText(output);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			infoBox(e.getMessage(), "Error in the code");
		}
	}
}
