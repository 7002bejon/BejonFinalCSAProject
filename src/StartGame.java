import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartGame extends JFrame implements ActionListener{
    private JPanel mainPanel;
    private JLabel characterCreateTitle;
    private JLabel charCreateQuestion1;
    private JRadioButton charChoiceMage;
    private JRadioButton charChoiceWarrior;
    private JRadioButton charChoiceHealer;
    private JRadioButton charChoiceTank;
    private JButton start;

    public StartGame() {
        setContentPane(mainPanel);
        setTitle("Game");
        setSize(300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        ButtonGroup group = new ButtonGroup();
        group.add(charChoiceMage);
        group.add(charChoiceHealer);
        group.add(charChoiceWarrior);
        group.add(charChoiceTank);
        start.addActionListener( this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed");
        if(charChoiceMage.isSelected()) {
            Player p = new Player(5, 2, "Mage");
        }
        if(charChoiceHealer.isSelected()) {
            Player p = new Player(7, 1, "Healer");
        }
        if(charChoiceWarrior.isSelected()) {
            Player p = new Player(10, 4, "Warrior");
        }
        if(charChoiceTank.isSelected()) {
            Player p = new Player(15, 3, "Tank");
        }
        setVisible(false);
        FightScreen newFrame = new FightScreen();

    }

}
