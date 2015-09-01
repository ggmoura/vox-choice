package br.com.treinar.estudo.teste.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingJCheckBox {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public SwingJCheckBox() {
		prepareGUI();
	}

	public static void main(String[] args) {
		SwingJCheckBox swingControlDemo = new SwingJCheckBox();
		swingControlDemo.showCheckBoxDemo();
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Java Swing Examples");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
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

	private void showCheckBoxDemo() {

		headerLabel.setText("Control in action: CheckBox");

		final JCheckBox chkApple = new JCheckBox("Apple");
		final JCheckBox chkMango = new JCheckBox("Mango");
		final JCheckBox chkPeer = new JCheckBox("Peer");

		chkApple.setMnemonic(KeyEvent.VK_C);
		chkMango.setMnemonic(KeyEvent.VK_M);
		chkPeer.setMnemonic(KeyEvent.VK_P);

		chkApple.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				statusLabel.setText("Apple Checkbox: "
						+ (e.getStateChange() == 1 ? "checked" : "unchecked"));
			}
		});

		chkMango.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				statusLabel.setText("Mango Checkbox: "
						+ (e.getStateChange() == 1 ? "checked" : "unchecked"));
			}
		});

		chkPeer.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				statusLabel.setText("Peer Checkbox: "
						+ (e.getStateChange() == 1 ? "checked" : "unchecked"));
			}
		});

		controlPanel.add(chkApple);
		controlPanel.add(chkMango);
		controlPanel.add(chkPeer);

		mainFrame.setVisible(true);
	}
}