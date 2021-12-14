package cal;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.WindowConstants;

public class Calculator extends JFrame {
    protected JTextField display;

    protected JButton b1 = new JButton("1");
    protected JButton b2 = new JButton("2");
    protected JButton b3 = new JButton("3");
    protected JButton b4 = new JButton("4");
    protected JButton b5 = new JButton("5");
    protected JButton b6 = new JButton("6");
    protected JButton b7 = new JButton("7");
    protected JButton b8 = new JButton("8");
    protected JButton b9 = new JButton("9");
    protected JButton b0 = new JButton("0");

    protected JButton addition = new JButton("+");
    protected JButton subtraction = new JButton("-");
    protected JButton multiplication = new JButton("*");
    protected JButton division = new JButton("/");
    protected JButton result = new JButton("=");
    protected JButton allClear = new JButton("C");
    protected JButton decimalPoint = new JButton(".");

    public Calculator() {
        super("Calculator");
        Handler handler = new Handler();

        allClear.addActionListener(handler);
        addition.addActionListener(handler);
        subtraction.addActionListener(handler);
        multiplication.addActionListener(handler);
        division.addActionListener(handler);
        result.addActionListener(handler);
        decimalPoint.addActionListener(handler);

        b0.addActionListener(handler);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);

        addition.setToolTipText("Addition");
        subtraction.setToolTipText("Subtraction");
        multiplication.setToolTipText("Multiplication");
        division.setToolTipText("Division");
        result.setToolTipText("Result");
        allClear.setToolTipText("All Clear");
        decimalPoint.setToolTipText("Decimal point");

        display = new JTextField(10);
        display.setBorder(BorderFactory.createLineBorder(Color.CYAN));

        // Set a panel's layout manager using the JPanel constructor

        JPanel mainPanel = new JPanel(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.gridy = 0;
        c.gridwidth = 3;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(display, c);

        c = new GridBagConstraints();
        c.gridy = 0;
        c.gridwidth = 1;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(allClear, c);

        c = new GridBagConstraints();
        c.gridy = 1;
        c.gridwidth = 1;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(b1, c);

        c = new GridBagConstraints();
        c.gridy = 1;
        c.gridwidth = 1;
        ;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(b2, c);

        c = new GridBagConstraints();
        c.gridy = 1;
        c.gridwidth = 1;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(b3, c);

        c = new GridBagConstraints();
        c.gridy = 1;
        c.gridwidth = 1;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(division, c);

        c = new GridBagConstraints();
        c.gridy = 2;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(b4, c);

        c = new GridBagConstraints();
        c.gridy = 2;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(b5, c);

        c = new GridBagConstraints();
        c.gridy = 2;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(b6, c);
        add(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();

        c = new GridBagConstraints();
        c.gridy = 2;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(multiplication, c);

        c = new GridBagConstraints();
        c.gridy = 3;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(b7, c);

        c = new GridBagConstraints();
        c.gridy = 3;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(b8, c);

        c = new GridBagConstraints();
        c.gridy = 3;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(b9, c);

        c = new GridBagConstraints();
        c.gridy = 3;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(subtraction, c);

        c = new GridBagConstraints();
        c.gridy = 4;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(b0, c);

        c = new GridBagConstraints();
        c.gridy = 4;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(decimalPoint, c);

        c = new GridBagConstraints();
        c.gridy = 4;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(result, c);

        c = new GridBagConstraints();
        c.gridy = 4;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(addition, c);

    }

    public Dimension getPreferredSize() {
        return new Dimension(250, 300);
    }

    protected class Handler implements ActionListener {
        String str;

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1)
                display.setText(display.getText().concat("1"));

            if (e.getSource() == b2)
                display.setText(display.getText().concat("2"));

            if (e.getSource() == b3)
                display.setText(display.getText().concat("3"));

            if (e.getSource() == b4)
                display.setText(display.getText().concat("4"));

            if (e.getSource() == b5)
                display.setText(display.getText().concat("5"));

            if (e.getSource() == b6)
                display.setText(display.getText().concat("6"));

            if (e.getSource() == b7)
                display.setText(display.getText().concat("7"));

            if (e.getSource() == b8)
                display.setText(display.getText().concat("8"));

            if (e.getSource() == b9)
                display.setText(display.getText().concat("9"));

            if (e.getSource() == b0)
                display.setText(display.getText().concat("0"));

            if (e.getSource() == decimalPoint)
                display.setText(display.getText().concat("."));

            if (e.getSource() == addition)
                display.setText(display.getText().concat("+"));

            if (e.getSource() == subtraction)
                display.setText(display.getText().concat("-"));

            if (e.getSource() == multiplication)
                display.setText(display.getText().concat("*"));

            if (e.getSource() == division)
                display.setText(display.getText().concat("/"));

            if (e.getSource() == allClear)
                display.setText("");

            if (e.getSource() == result)
                str = display.getText();
        }
    }
}
