import javax.swing.*;
import java.awt.*;


public class Menu extends JFrame{

    public ImageIcon icon;
    public JButton play;
    public JLabel label;
    public JPanel panel;
    Menu(){

        icon = new ImageIcon("logo\\icon.jfif");//Logo of Dimensional Space Rocket

        play = new JButton("Play");
        play.setBounds(350,700,200,100);
        play.setFont(new Font("Arial",Font.PLAIN,25));
        play.setFocusable(false);
        play.setBackground(Color.BLACK);
        play.setForeground(Color.WHITE);
        play.addActionListener(e -> new Space());
        play.addActionListener(e -> dispose());

        label = new JLabel("Dimensional Space Rocket");
        label.setFont(new Font("Arial",Font.BOLD,40));
        label.setForeground(Color.BLACK);

        panel = new JPanel();
        panel.setBounds(0,0,900,70);
        panel.setBackground(Color.WHITE);
        panel.add(label);

        /*
        * This is a space game called Dimensional Space Rocket
        * The game consists of five stages
        * Also non-copyright icons were used in this game
        * The purpose of this game is to travel between dimensions using portals
        * Avoiding Aliens with UFO along the way
        * And of course destroying the alien mastermind which wants to conquer Earth
        * And be the hero and actually save Earth
        * The main menu includes one button which takes the player to the game
        * Additionally with keys on the keyboard the player can move the rocket
        * w for up
        * s for down
        * a for left
        * and d for down
        * However the arrows can also be used for the same purpose
        * Enjoy :)
         */

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Dimensional Space Rocket");
        this.setIconImage(icon.getImage());
        this.setLayout(null);
        this.setSize(new Dimension(900, 900));
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setResizable(false);
        this.setLocation(500, 100);
        this.add(play);
        this.add(panel);
        this.setVisible(true);

    }

}
