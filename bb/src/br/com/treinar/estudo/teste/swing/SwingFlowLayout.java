package br.com.treinar.estudo.teste.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingFlowLayout {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public SwingFlowLayout() {
		prepareGUI();
	}

	public static void main(String[] args) {
		SwingFlowLayout swingLayoutDemo = new SwingFlowLayout();
		swingLayoutDemo.showFlowLayoutDemo();
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Java SWING Examples");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));

		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);

		statusLabel.setSize(350, 100);
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}

	private void showFlowLayoutDemo() {
		headerLabel.setText("Layout in action: FlowLayout");

		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		panel.setSize(200, 200);
		FlowLayout layout = new FlowLayout();
		layout.setHgap(10);
		layout.setVgap(10);
		panel.setLayout(layout);
		panel.add(new JButton("OK"));
		panel.add(new JButton("Cancel"));
		panel.add(new JButton("Tres"));
		panel.add(new JButton("Quatro"));

		controlPanel.add(panel);

		mainFrame.setVisible(true);
	}
}