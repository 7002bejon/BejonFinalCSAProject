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
    private JLabel playerHPLabel;

    private Enemy e1;

    private Player p;

    public FightScreen(Player p) {
    setContentPane(mainPanel);
    setTitle("Game");
    setSize(300, 400);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    e1 = new Enemy(6, 3);
    this.p = p;
    attackButton.addActionListener(this);
    skillButton.addActionListener(this);
    int currentHP = p.getHp();
    int maxHP = p.getHp();
    playerHPLabel.setText("HP: " + currentHP + "/ " + maxHP + " ");
    setVisible(true);
}

@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == attackButton) {
            System.out.println("button pressed");
            e1.changeHP(p.getAttack());
            statusLabel.setText("You attacked the enemy for " + p.getAttack() + " damage!");
            attackButton.setVisible(false);
            skillButton.setVisible(false);
        } else if (e.getSource() == skillButton) {
            if (p.getJob().equals("Warrior")) {
                System.out.println("button pressed");
                e1.changeHP(p.getAttack() + 2);
                statusLabel.setText("You used your skill! You attacked the enemy for " + (p.getAttack() + 2) + " damage!");
                attackButton.setVisible(false);
                skillButton.setVisible(false);
            } else if (p.getJob().equals("Mage")) {
                System.out.println("button pressed");
                e1.changeHP(p.getAttack() + 4);
                statusLabel.setText("You used your skill! You shoot a fireball at the enemy for " + (p.getAttack() + 8) + " damage! Your hp lowers by 1!" );
                p.changeHP(-1);
                attackButton.setVisible(false);
                skillButton.setVisible(false);
            } else if (p.getJob().equals("Tank")) {
                System.out.println("button pressed");
                e1.setAttack(e1.getAttack() - 1);
                statusLabel.setText("You used your skill! Enemy will deal less damage!");
                attackButton.setVisible(false);
                skillButton.setVisible(false);
            } else {
                System.out.println("button pressed");
                p.changeHP(2);
                statusLabel.setText("You used your skill! You healed 2 HP!");
                attackButton.setVisible(false);
                skillButton.setVisible(false);
            }
        }
}





}