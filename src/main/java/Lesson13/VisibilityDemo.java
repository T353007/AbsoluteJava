import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisibilityDemo extends JFrame
        implements ActionListener {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    private final JLabel wavingLabel;
    private final JLabel standingLabel;

    public VisibilityDemo() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Visibility Demonstration");

        setLayout(new BorderLayout());

        JPanel picturePanel = new JPanel();
        picturePanel.setBackground(Color.WHITE);
        picturePanel.setLayout(new FlowLayout());

        ImageIcon dukeStandingIcon =
                new ImageIcon("duke_standing.gif");
        standingLabel = new JLabel(dukeStandingIcon);
        standingLabel.setVisible(true);
        picturePanel.add(standingLabel);

        ImageIcon dukeWavingIcon = new ImageIcon("duke_waving.gif");
        wavingLabel = new JLabel(dukeWavingIcon);
        wavingLabel.setVisible(false);
        picturePanel.add(wavingLabel);

        add(picturePanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout());

        JButton waveButton = new JButton("Wave");
        waveButton.addActionListener(this);
        buttonPanel.add(waveButton);

        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(this);
        buttonPanel.add(stopButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        VisibilityDemo demoGui = new VisibilityDemo();
        demoGui.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("Wave")) {
            wavingLabel.setVisible(true);
            standingLabel.setVisible(false);
        } else if (actionCommand.equals("Stop")) {
            standingLabel.setVisible(true);
            wavingLabel.setVisible(false);
        } else
            System.out.println("Unanticipated error.");
    }
}
