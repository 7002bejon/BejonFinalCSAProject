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

    private Enemy e;

    public FightScreen() {
    setContentPane(mainPanel);
    setTitle("Game");
    setSize(300, 400);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    e = new Enemy(6, 3);
    attackButton.addActionListener(this);
    skillButton.addActionListener(this);
    setVisible(true);
}

@Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed");
        e.changeHp(-3);
}

}