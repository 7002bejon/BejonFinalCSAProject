import javax.swing.*;

public class StartGame extends JFrame {
    private JPanel mainPanel;
    private JLabel characterCreateTitle;
    private JLabel charCreateQuestion1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;

    public StartGame() {
        setContentPane(mainPanel);
        setTitle("Game");
        setSize(300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
