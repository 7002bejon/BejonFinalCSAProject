import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameEnd extends JFrame {
    private JPanel mainPanel;
    private JLabel gameOverLabel;
    private JLabel playerWinLabel;
    private JLabel playerLoseLabel;

    private Player p;

    private Enemy e1;

    public GameEnd(Player p, Enemy e1) {
        setContentPane(mainPanel);
        setTitle("Game");
        setSize(300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.p = p;
        this.e1 = e1;
        if (p.getHp() <= 0) {
            playerWinLabel.setVisible(false);
        } else {
            playerLoseLabel.setVisible(false);
        }
    }
}


