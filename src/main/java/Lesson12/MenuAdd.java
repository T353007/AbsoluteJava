import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAdd extends JFrame implements ActionListener {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    private final JPanel redPanel;
    private final JPanel whitePanel;
    private final JPanel bluePanel;

    public MenuAdd() {
        setSize(WIDTH, HEIGHT);
        setTitle("Add Menu Demonstration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new GridLayout(1, 3));

        redPanel = new JPanel();
        redPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(redPanel);

        whitePanel = new JPanel();
        whitePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(whitePanel);

        bluePanel = new JPanel();
        bluePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(bluePanel);

        add(biggerPanel, BorderLayout.CENTER);

        JMenu colorMenu = new JMenu("Add Colors");

        JMenuItem redChoice = new JMenuItem("Red");
        redChoice.addActionListener(this);
        colorMenu.add(redChoice);

        JMenuItem whiteChoice = new JMenuItem("White");
        whiteChoice.addActionListener(this);
        colorMenu.add(whiteChoice);

        JMenuItem blueChoice = new JMenuItem("Blue");
        blueChoice.addActionListener(this);
        colorMenu.add(blueChoice);

        JMenuBar bar = new JMenuBar();
        bar.add(colorMenu);

        add(bar, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        MenuAdd gui = new MenuAdd();
        gui.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonString = e.getActionCommand();

        if (buttonString.equals("Red"))
            redPanel.setBackground(Color.RED);
        else if (buttonString.equals("White"))
            whitePanel.setBackground(Color.WHITE);
        else if (buttonString.equals("Blue"))
            bluePanel.setBackground(Color.BLUE);
        else
            System.out.println("Unexpected error.");
    }
}
