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
    private JButton nextTurnButton;
    private JButton enemyPhaseButton;

    private boolean enemyTurn;

    private Enemy e1;

    private Player p;

    private int currentHP;

    private int maxHP;

    public FightScreen(Player p) {
    setContentPane(mainPanel);
    setTitle("Game");
    setSize(300, 400);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    e1 = new Enemy(6, 3);
    this.p = p;
    attackButton.addActionListener(this);
    skillButton.addActionListener(this);
    nextTurnButton.addActionListener(this);
    nextTurnButton.setVisible(false);
    enemyPhaseButton.setVisible(false);
    currentHP = p.getHp();
    maxHP = p.getHp();
    playerHPLabel.setText("HP: " + currentHP + "/ " + maxHP + " ");
    setVisible(true);
    enemyTurn = false;
}


public void enemyPhase() {
        p.changeHP(-e1.getAttack());
        currentHP = p.getHp();
        playerHPLabel.setText("HP: " + currentHP + "/ " + maxHP + " ");
        statusLabel.setText("The enemy attacked you for " + e1.getAttack() + " damage!");
        if (p.getHp()<=0) {
            setVisible(false);
            GameEnd newFrame = new GameEnd(p, e1);
        }
        nextTurnButton.setVisible(true);

}
@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == attackButton) {
            System.out.println("button pressed");
            e1.changeHP(p.getAttack());
            statusLabel.setText("You attacked the enemy for " + p.getAttack() + " damage!");
            if (e1.getHP()<=0) {
                setVisible(false);
                GameEnd newFrame = new GameEnd(p, e1);
            }
            attackButton.setVisible(false);
            skillButton.setVisible(false);
            enemyPhaseButton.setVisible(true);
            enemyPhase();
        } else if (e.getSource() == skillButton) {
            if (p.getJob().equals("Warrior")) {
                System.out.println("button pressed");
                e1.changeHP(p.getAttack() + 2);
                statusLabel.setText("You used your skill! You attacked the enemy for " + (p.getAttack() + 2) + " damage!");
                if (e1.getHP()<=0) {
                    setVisible(false);
                    GameEnd newFrame = new GameEnd(p, e1);
                }
                attackButton.setVisible(false);
                skillButton.setVisible(false);
                enemyPhase();
            } else if (p.getJob().equals("Mage")) {
                System.out.println("button pressed");
                e1.changeHP(p.getAttack() + 4);
                statusLabel.setText("You used your skill! You shoot a fireball at the enemy for " + (p.getAttack() + 8) + " damage! Your hp lowers by 1!" );
                p.changeHP(-1);
                if (e1.getHP()<=0) {
                    setVisible(false);
                    GameEnd newFrame = new GameEnd(p, e1);
                }
                attackButton.setVisible(false);
                skillButton.setVisible(false);
                enemyPhase();
            } else if (p.getJob().equals("Tank")) {
                System.out.println("button pressed");
                e1.setAttack(e1.getAttack() - 1);
                statusLabel.setText("You used your skill! Enemy will deal less damage!");
                if (e1.getHP()<=0) {
                    setVisible(false);
                    GameEnd newFrame = new GameEnd(p, e1);
                }
                attackButton.setVisible(false);
                skillButton.setVisible(false);
                enemyPhase();
            } else {
                System.out.println("button pressed");
                p.changeHP(2);
                statusLabel.setText("You used your skill! You healed 2 HP!");
                if (e1.getHP()<=0) {
                    setVisible(false);
                    GameEnd newFrame = new GameEnd(p, e1);
                }
                attackButton.setVisible(false);
                skillButton.setVisible(false);
                enemyPhase();
            }
        } else if (e.getSource() == nextTurnButton) {
            nextTurnButton.setVisible(false);
            attackButton.setVisible(true);
            skillButton.setVisible(true);
            if (e1.getHP()<=0) {
                setVisible(false);
                GameEnd newFrame = new GameEnd(p, e1);
            }
        }
}





}