import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InnerListenersDemo2 extends JFrame {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    private final JPanel redPanel;
    private final JPanel whitePanel;
    private final JPanel bluePanel;

    public InnerListenersDemo2() {
        super("Menu Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 3));

        redPanel = new JPanel();
        redPanel.setBackground(Color.LIGHT_GRAY);
        add(redPanel);

        whitePanel = new JPanel();
        whitePanel.setBackground(Color.LIGHT_GRAY);
        add(whitePanel);

        bluePanel = new JPanel();
        bluePanel.setBackground(Color.LIGHT_GRAY);
        add(bluePanel);

        JMenu colorMenu = new JMenu("Add Colors");

        JMenuItem redChoice = new JMenuItem("Red");
        redChoice.addActionListener(
                new ColorListener(Color.RED, redPanel));
        colorMenu.add(redChoice);

        JMenuItem whiteChoice = new JMenuItem("White");
        whiteChoice.addActionListener(
                new ColorListener(Color.WHITE, whitePanel));
        colorMenu.add(whiteChoice);

        JMenuItem blueChoice = new JMenuItem("Blue");
        blueChoice.addActionListener(
                new ColorListener(Color.BLUE, bluePanel));
        colorMenu.add(blueChoice);

        JMenuBar bar = new JMenuBar();
        bar.add(colorMenu);
        setJMenuBar(bar);
    }

    public static void main(String[] args) {
        InnerListenersDemo gui = new InnerListenersDemo();
        gui.setVisible(true);
    }

    private class ColorListener implements ActionListener {
        private final JPanel thePanel;
        private final Color theColor;

        public ColorListener(Color c, JPanel p) {
            theColor = c;
            thePanel = p;
        }

        public void actionPerformed(ActionEvent e) {
            thePanel.setBackground(theColor);
        }
    } //End of ColorListener inner class

}
