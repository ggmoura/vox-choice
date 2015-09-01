package br.com.treinar.estudo.teste.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingJButton {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public SwingJButton() {
		prepareGUI();
	}

	public static void main(String[] args) {
		SwingJButton swingControlDemo = new SwingJButton();
		swingControlDemo.showButtonDemo();
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Java Swing Examples");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));
		
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				int safe = JOptionPane.showConfirmDialog(null, "titleDetails!",  "title!!", JOptionPane.YES_NO_CANCEL_OPTION);

				if(safe == JOptionPane.YES_OPTION){
					mainFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);//yes
				} else if (safe == JOptionPane.CANCEL_OPTION) {
					mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);//cancel
				} else {
					mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);//no
				}
				
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

	private static ImageIcon createImageIcon(String path, String description) {
		java.net.URL imgURL = SwingJButton.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

	private void showButtonDemo() {

		headerLabel.setText("Control in action: Button");

		// resources folder should be inside SWING folder.
		ImageIcon icon = createImageIcon("/resources/java_icon.jpg", "Java");

		JButton okButton = new JButton("OK");
		JButton javaButton = new JButton("Submit", icon);
		JButton cancelButton = new JButton("Cancel", icon);
		cancelButton.setHorizontalTextPosition(SwingConstants.LEFT);

		AcaoBotaoOK acaoOk = new AcaoBotaoOK(statusLabel, mainFrame);
		okButton.addActionListener(acaoOk);

		// okButton.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// statusLabel.setText("Ok Button clicked.");
		// JOptionPane.showMessageDialog(mainFrame, "Botão Pressionado");
		// }
		// });

		javaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("Submit Button clicked.");
			}
		});

		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("Cancel Button clicked.");
			}
		});

		controlPanel.add(okButton);
		controlPanel.add(javaButton);
		controlPanel.add(cancelButton);

		mainFrame.setVisible(true);
	}
}