package br.com.treinar.estudo.teste.swing;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ClosingFrame extends JFrame {

    private JMenuBar MenuBar = new JMenuBar();
    private JFrame frame = new JFrame();
    private static final long serialVersionUID = 1L;
    private JMenu File = new JMenu("File");
    private JMenuItem Exit = new JMenuItem("Exit");

    public ClosingFrame() {
        File.add(Exit);
        MenuBar.add(File);
        Exit.addActionListener(new ExitListener());
        WindowListener exitListener = new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(frame,
                        "Are You Sure to Close this Application?",
                        "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(1);
                }
            }
        };
        frame.addWindowListener(exitListener);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setJMenuBar(MenuBar);
        frame.setPreferredSize(new Dimension(400, 300));
        frame.setLocation(100, 100);
        frame.pack();
        frame.setVisible(true);
    }

    private class ExitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int confirm = JOptionPane.showOptionDialog(frame,
                    "Are You Sure to Close this Application?",
                    "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @SuppressWarnings("unused")
			@Override
            public void run() {
                ClosingFrame cf = new ClosingFrame();
            }
        });
    }
}