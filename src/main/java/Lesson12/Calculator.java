import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A simplified calculator.
 * The only operations are addition and subtraction.
 */
public class Calculator extends JFrame
        implements ActionListener {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    public static final int NUMBER_OF_DIGITS = 30;

    private final JTextField ioField;
    private double result = 0.0;

    public Calculator() {
        setTitle("Simplified Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLayout(new BorderLayout());

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new FlowLayout());
        ioField =
                new JTextField("Enter numbers here.", NUMBER_OF_DIGITS);
        ioField.setBackground(Color.WHITE);
        textPanel.add(ioField);
        add(textPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.BLUE);
        buttonPanel.setLayout(new FlowLayout());

        JButton addButton = new JButton("+");
        addButton.addActionListener(this);
        buttonPanel.add(addButton);
        JButton subtractButton = new JButton("-");
        subtractButton.addActionListener(this);
        buttonPanel.add(subtractButton);
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);

        add(buttonPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Calculator aCalculator = new Calculator();
        aCalculator.setVisible(true);
    }

    //Throws NumberFormatException.
    private static double stringToDouble(String stringObject) {
        return Double.parseDouble(stringObject.trim());
    }

    public void actionPerformed(ActionEvent e) {
        try {
            assumingCorrectNumberFormats(e);
        } catch (NumberFormatException e2) {
            ioField.setText("Error: Reenter Number.");
        }
    }

    //Throws NumberFormatException.
    public void assumingCorrectNumberFormats(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("+")) {
            result = result + stringToDouble(ioField.getText());
            ioField.setText(Double.toString(result));
        } else if (actionCommand.equals("-")) {
            result = result - stringToDouble(ioField.getText());
            ioField.setText(Double.toString(result));

        } else if (actionCommand.equals("Reset")) {
            result = 0.0;
            ioField.setText("0.0");
        } else
            ioField.setText("Unexpected error.");
    }

}
