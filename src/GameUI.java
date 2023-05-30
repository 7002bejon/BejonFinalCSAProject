import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameUI extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton startButton;
    private JLabel title;

    public GameUI() {
        setContentPane(mainPanel);
        setTitle("Game");
        setSize(300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        startButton.addActionListener(this);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed");
        setVisible(false);
        StartGame newFrame = new StartGame();

    }


}
