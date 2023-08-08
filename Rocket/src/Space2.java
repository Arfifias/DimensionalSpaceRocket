import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Space2 extends JFrame implements KeyListener, ActionListener {

    public ImageIcon icon;
    public ImageIcon rocket;
    public ImageIcon main_enemy;
    public ImageIcon second_enemy;
    public ImageIcon portal;
    public JButton try_again;
    public JButton back;
    public JLabel rocket3;
    public JLabel game_over;
    public JLabel enemy1;
    public JLabel enemy2;
    public JLabel enemy3;
    public JLabel enemy4;
    public JLabel enemy5;
    public JLabel enemy6;
    public JLabel portal2;
    Space2(){
        icon = new ImageIcon("logo\\icon.jfif");
        rocket = new ImageIcon("images\\Rocket.png");
        main_enemy = new ImageIcon("images\\Ufo.png");
        second_enemy = new ImageIcon("images\\Spaceship_Alien.png");
        portal = new ImageIcon("images\\Portal.png");

        try_again = new JButton("Try Again");
        try_again.setBounds(550,700,200,100);
        try_again.setFont(new Font("Arial",Font.PLAIN,25));
        try_again.setFocusable(false);
        try_again.setVisible(false);
        try_again.setBackground(Color.BLACK);
        try_again.setForeground(Color.WHITE);
        try_again.addActionListener(this);

        back = new JButton("Back");
        back.setBounds(150,700,200,100);
        back.setFont(new Font("Arial",Font.PLAIN,25));
        back.setFocusable(false);
        back.setVisible(false);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(e -> new Space());
        back.addActionListener(e -> dispose());
        back.addActionListener(this);

        rocket3 = new JLabel();
        rocket3.setIcon(rocket);
        rocket3.setBounds(400, 700, 100, 100);

        game_over = new JLabel("Game Over");
        game_over.setBounds(390,30,200,200);
        game_over.setFont(new Font("Arial",Font.BOLD,25));
        game_over.setForeground(new Color(255,255,255));
        game_over.setVisible(false);

        enemy1 = new JLabel();
        enemy1.setIcon(main_enemy);
        enemy1.setBounds(150,250,100,100);

        enemy2 = new JLabel();
        enemy2.setIcon(main_enemy);
        enemy2.setBounds(400,250,100,100);

        enemy3 = new JLabel();
        enemy3.setIcon(main_enemy);
        enemy3.setBounds(650,250,100,100);

        enemy4 = new JLabel();
        enemy4.setIcon(second_enemy);
        enemy4.setBounds(150,500,100,100);

        enemy5 = new JLabel();
        enemy5.setIcon(second_enemy);
        enemy5.setBounds(400,500,100,100);

        enemy6 = new JLabel();
        enemy6.setIcon(second_enemy);
        enemy6.setBounds(650,500,100,100);

        portal2 = new JLabel();
        portal2.setIcon(portal);
        portal2.setBounds(370,30,150,150);

        /*
        *Same structure as Space class
        * But keep in mind that the enemies of every stage change
        * Just to offer a variety of enemies
        * Everything else is just customization and functionality
         */

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Dimensional Space Rocket");
        this.setIconImage(icon.getImage());
        this.setLayout(null);
        this.setSize(new Dimension(900, 900));
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setLocation(500,100);
        this.addKeyListener(this);
        this.setResizable(false);
        this.add(try_again);
        this.add(back);
        this.add(rocket3);
        this.add(game_over);
        this.add(enemy1);
        this.add(enemy2);
        this.add(enemy3);
        this.add(enemy4);
        this.add(enemy5);
        this.add(enemy6);
        this.add(portal2);
        this.setVisible(true);
    }
    private boolean contact(){
        Rectangle boundsRocket = rocket3.getBounds();
        Rectangle boundsEnemy1 = enemy1.getBounds();
        return boundsRocket.intersects(boundsEnemy1);
    }
    private boolean contact2(){
        Rectangle boundsRocket = rocket3.getBounds();
        Rectangle boundsEnemy2 = enemy2.getBounds();
        return boundsRocket.intersects(boundsEnemy2);
    }
    private boolean contact3(){
        Rectangle boundsRocket = rocket3.getBounds();
        Rectangle boundsEnemy3 = enemy3.getBounds();
        return boundsRocket.intersects(boundsEnemy3);
    }
    private boolean contact4(){
        Rectangle boundsRocket = rocket3.getBounds();
        Rectangle boundsEnemy4 = enemy4.getBounds();
        return boundsRocket.intersects(boundsEnemy4);
    }
    private boolean contact5(){
        Rectangle boundsRocket = rocket3.getBounds();
        Rectangle boundsEnemy5 = enemy5.getBounds();
        return boundsRocket.intersects(boundsEnemy5);
    }
    private boolean contact6(){
        Rectangle boundsRocket = rocket3.getBounds();
        Rectangle boundsEnemy6 = enemy6.getBounds();
        return boundsRocket.intersects(boundsEnemy6);
    }
    private boolean contact7(){
        Rectangle boundsRocket = rocket3.getBounds();
        Rectangle boundsPortal = portal2.getBounds();
        return boundsRocket.intersects(boundsPortal);
    }
    private void visibility(){
        if(contact()){
            rocket3.setVisible(false);
            portal2.setVisible(false);
            game_over.setVisible(true);
            try_again.setVisible(true);
            back.setVisible(true);
        } else if (contact2()) {
            rocket3.setVisible(false);
            portal2.setVisible(false);
            game_over.setVisible(true);
            try_again.setVisible(true);
            back.setVisible(true);
        } else if (contact3()) {
            rocket3.setVisible(false);
            portal2.setVisible(false);
            game_over.setVisible(true);
            try_again.setVisible(true);
            back.setVisible(true);
        }else if (contact4()){
            rocket3.setVisible(false);
            portal2.setVisible(false);
            game_over.setVisible(true);
            try_again.setVisible(true);
            back.setVisible(true);
        } else if (contact5()) {
            rocket3.setVisible(false);
            portal2.setVisible(false);
            game_over.setVisible(true);
            try_again.setVisible(true);
            back.setVisible(true);
        } else if (contact6()) {
            rocket3.setVisible(false);
            portal2.setVisible(false);
            game_over.setVisible(true);
            try_again.setVisible(true);
            back.setVisible(true);
        } else if (contact7()) {
            new Space3();
            dispose();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == try_again){
            try_again.setVisible(false);
            back.setVisible(false);
            game_over.setVisible(false);
            rocket3.setBounds(400, 700, 100, 100);
            portal2.setBounds(370,30,150,150);
            rocket3.setVisible(true);
            portal2.setVisible(true);
            visibility();
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' -> rocket3.setLocation(rocket3.getX(), rocket3.getY() - 10);
            case 'a' -> rocket3.setLocation(rocket3.getX() - 10, rocket3.getY());
            case 's' -> rocket3.setLocation(rocket3.getX(), rocket3.getY() + 10);
            case 'd' -> rocket3.setLocation(rocket3.getX() + 10, rocket3.getY());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38 -> rocket3.setLocation(rocket3.getX(), rocket3.getY() - 10);
            case 37 -> rocket3.setLocation(rocket3.getX() - 10, rocket3.getY());
            case 40 -> rocket3.setLocation(rocket3.getX(), rocket3.getY() + 10);
            case 39 -> rocket3.setLocation(rocket3.getX() + 10, rocket3.getY());
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
        System.out.println(e.getKeyCode());
        visibility();
    }
}
