package de.phip1611.kmp_algorithm;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.Arrays;

/**
 * WARNING!!!
 * I admit that the code for this Swing-GUI is like the worst code
 * ever written. It was late in the night and I was so tired...
 * Perhaps I fix it soon.
 */
public class GUI {
    JFrame frame;
    /**
     * WARNING!!!
     * I admit that the code for this Swing-GUI is like the worst code
     * ever written. It was late in the night and I was so tired...
     * Perhaps I fix it soon.
     */
    public GUI() {
        this.frame = new JFrame("KMP-Algorithmus - Philipp Schuster");
        this.frame.setSize(500,300);
        // Mittig positionieren
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.frame.setLocation(dim.width/2-this.frame.getSize().width/2, dim.height/2-4*this.frame.getSize().height/5);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel();
        JLabel label2 = new JLabel();
        JLabel results = new JLabel();
        label.setText("Pattern:");
        label2.setText("Verschiebetabelle:");
        JTextField input = new JTextField();
        panel1.add(label);
        panel1.add(input);
        panel2.add(label2);
        panel2.add(results);
        panel2.setLayout(new GridLayout(1,2));
        panel1.setLayout(new GridLayout(2,1));
        this.frame.add(panel1);
        this.frame.add(panel2);
        this.frame.setLayout(new GridLayout(2,1));

        input.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                yo();
            }

            public void removeUpdate(DocumentEvent e) {
                yo();
            }

            public void insertUpdate(DocumentEvent e) {
                yo();
            }
            private void yo() {
                results.setText(Arrays.toString(KMP.analyze(input.getText())));
            }
        });

        this.frame.setVisible(true);
    }
}
