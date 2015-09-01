package br.com.treinar.estudo.teste.swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SwingCardLayout {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public SwingCardLayout() {
		prepareGUI();
	}

	public static void main(String[] args) {
		SwingCardLayout swingLayoutDemo = new SwingCardLayout();
		swingLayoutDemo.showCardLayoutDemo();
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void showCardLayoutDemo() {
		headerLabel.setText("Layout in action: CardLayout");

		final JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setSize(300, 300);

		CardLayout layout = new CardLayout();
		layout.setHgap(10);
		layout.setVgap(10);
		panel.setLayout(layout);

		JPanel buttonPanel = new JPanel(new FlowLayout());

		buttonPanel.add(new JButton("OK"));
		buttonPanel.add(new JButton("Cancel"));

		JPanel textBoxPanel = new JPanel(new FlowLayout());

		textBoxPanel.add(new JLabel("Name:"));
		textBoxPanel.add(new JTextField(20));

		panel.add("Button", buttonPanel);
		panel.add("Text", textBoxPanel);

		final DefaultComboBoxModel panelName = new DefaultComboBoxModel();

		panelName.addElement("Button");
		panelName.addElement("Text");

		final JComboBox listCombo = new JComboBox(panelName);
		listCombo.setSelectedIndex(0);

		JScrollPane listComboScrollPane = new JScrollPane(listCombo);

		JButton showButton = new JButton("Show");

		showButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "";
				if (listCombo.getSelectedIndex() != -1) {
					CardLayout cardLayout = (CardLayout) (panel.getLayout());
					cardLayout.show(panel, (String) listCombo
							.getItemAt(listCombo.getSelectedIndex()));
				}
				statusLabel.setText(data);
			}
		});

		controlPanel.add(listComboScrollPane);
		controlPanel.add(showButton);
		controlPanel.add(panel);

		mainFrame.setVisible(true);
	}
}