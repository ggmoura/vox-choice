package br.com.treinar.estudo.teste.swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class SwingJTextField {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public SwingJTextField() {
		prepareGUI();
	}

	public static void main(String[] args) {
		SwingJTextField swingControlDemo = new SwingJTextField();
		swingControlDemo.showTextFieldDemo();
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Java Swing Examples");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				//System.exit(0);
			}
		});
		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);

		statusLabel.setSize(350, 100);

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}

	private void showTextFieldDemo() {
		headerLabel.setText("Control in action: JTextField");

		JLabel namelabel = new JLabel("User ID: ", JLabel.RIGHT);
		JLabel passwordLabel = new JLabel("Password: ", JLabel.CENTER);
		final JTextField userText = new JTextField(6);
		final JPasswordField passwordText = new JPasswordField(6);

		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "Username " + userText.getText();
				data += ", Password: " + new String(passwordText.getPassword());
				statusLabel.setText(data);
			}
		});

		controlPanel.add(namelabel);
		controlPanel.add(userText);
		controlPanel.add(passwordLabel);
		controlPanel.add(passwordText);
		controlPanel.add(loginButton);
		mainFrame.setVisible(true);
	}
}