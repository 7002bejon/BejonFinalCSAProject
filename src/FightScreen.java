import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FightScreen extends JFrame implements ActionListener {
    private JLabel battleTitle;
    private JLabel playerTurnTitle;
    private JPanel playerTurnPanel;
    private JPanel mainPanel;
    private JPanel battleTitlePanel;
    private JButton attackButton;
    private JButton skillButton;
    private JLabel enemyImage;
    private JLabel statusLabel;

    private Enemy e1;

    public FightScreen() {
    setContentPane(mainPanel);
    setTitle("Game");
    setSize(300, 400);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    e1 = new Enemy(6, 3);
    attackButton.addActionListener(this);
    skillButton.addActionListener(this);
    setVisible(true);
}

@Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed");
        e1.changeHP(-3);
        statusLabel.setText("You attacked!");
}

}