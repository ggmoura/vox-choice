package br.com.treinar.estudo.teste.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AcaoBotaoOK implements ActionListener {

	private JLabel statusLabel;
	private JFrame mainFrame;

	public AcaoBotaoOK(JLabel statusLabel, JFrame mainFrame) {
		this.statusLabel = statusLabel;
		this.mainFrame = mainFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		statusLabel.setText("Ok Button clicked.");
		JOptionPane.showMessageDialog(mainFrame, "Botão Pressionado");
	}

}
