import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Space4 extends JFrame implements ActionListener, KeyListener {

    public ImageIcon icon;
    public ImageIcon rocket6;
    public ImageIcon enemy;
    public ImageIcon second_enemy;
    public ImageIcon portal;
    public JButton try_Again;
    public JButton go_back;
    public JLabel game_Over;
    public JLabel rocket7;
    public JLabel enemy1;
    public JLabel enemy2;
    public JLabel enemy3;
    public JLabel enemy4;
    public JLabel enemy5;
    public JLabel enemy6;
    public JLabel portal3;

    Space4(){

        icon = new ImageIcon("logo\\icon.jfif");
        rocket6 = new ImageIcon("images\\Rocket.png");
        enemy = new ImageIcon("images\\Ufo2.png");
        second_enemy = new ImageIcon("images\\Spaceship_Alien.png");
        portal = new ImageIcon("images\\Portal.png");

        try_Again = new JButton("Try Again");
        try_Again.setBounds(550,700,200,100);
        try_Again.setFont(new Font("Arial",Font.PLAIN,25));
        try_Again.setFocusable(false);
        try_Again.setVisible(false);
        try_Again.setBackground(Color.BLACK);
        try_Again.setForeground(Color.WHITE);
        try_Again.addActionListener(this);

        go_back = new JButton("Back");
        go_back.setBounds(150,700,200,100);
        go_back.setFont(new Font("Arial",Font.PLAIN,25));
        go_back.setFocusable(false);
        go_back.setVisible(false);
        go_back.setBackground(Color.BLACK);
        go_back.setForeground(Color.WHITE);
        go_back.addActionListener(e -> new Space2());
        go_back.addActionListener(e -> dispose());
        go_back.addActionListener(this);

        game_Over = new JLabel("Game Over");
        game_Over.setBounds(390,30,200,200);
        game_Over.setFont(new Font("Arial",Font.BOLD,25));
        game_Over.setForeground(new Color(255,255,255));
        game_Over.setVisible(false);

        rocket7 = new JLabel();
        rocket7.setIcon(rocket6);
        rocket7.setBounds(400, 700, 100, 100);

        enemy1 = new JLabel();
        enemy1.setIcon(enemy);
        enemy1.setBounds(150,250,100,100);

        enemy2 = new JLabel();
        enemy2.setIcon(enemy);
        enemy2.setBounds(400,250,100,100);

        enemy3 = new JLabel();
        enemy3.setIcon(enemy);
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

        portal3 = new JLabel();
        portal3.setIcon(portal);
        portal3.setBounds(370,30,150,150);
        portal3.setVisible(true);

        /*
         *Same structure as Space class3
         * But keep in mind that the enemies of every stage change
         * Just to offer a variety of enemies
         * Everything else is just customization and functionality
         */

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Dimensional Space Rocket");
        this.setIconImage(icon.getImage());
        this.setLayout(null);
        this.addKeyListener(this);
        this.setSize(new Dimension(900, 900));
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setResizable(false);
        this.setLocation(500, 100);
        this.add(try_Again);
        this.add(go_back);
        this.add(game_Over);
        this.add(rocket7);
        this.add(enemy1);
        this.add(enemy2);
        this.add(enemy3);
        this.add(enemy4);
        this.add(enemy5);
        this.add(enemy6);
        this.add(portal3);
        this.setVisible(true);
    }
    private boolean contact(){
        Rectangle boundsRocket = rocket7.getBounds();
        Rectangle boundsEnemy1 = enemy1.getBounds();
        return boundsRocket.intersects(boundsEnemy1);
    }
    private boolean contact2(){
        Rectangle boundsRocket = rocket7.getBounds();
        Rectangle boundsEnemy2 = enemy2.getBounds();
        return boundsRocket.intersects(boundsEnemy2);
    }
    private boolean contact3(){
        Rectangle boundsRocket = rocket7.getBounds();
        Rectangle boundsEnemy3 = enemy3.getBounds();
        return boundsRocket.intersects(boundsEnemy3);
    }
    private boolean contact4(){
        Rectangle boundsRocket = rocket7.getBounds();
        Rectangle boundsEnemy4 = enemy4.getBounds();
        return boundsRocket.intersects(boundsEnemy4);
    }
    private boolean contact5(){
        Rectangle boundsRocket = rocket7.getBounds();
        Rectangle boundsEnemy5 = enemy5.getBounds();
        return boundsRocket.intersects(boundsEnemy5);
    }
    private boolean contact6(){
        Rectangle boundsRocket = rocket7.getBounds();
        Rectangle boundsEnemy6 = enemy6.getBounds();
        return boundsRocket.intersects(boundsEnemy6);
    }
    private boolean contact7(){
        Rectangle boundsRocket = rocket7.getBounds();
        Rectangle boundsPortal = portal3.getBounds();
        return boundsRocket.intersects(boundsPortal);
    }
    private void visibility(){
        if(contact()){
            rocket7.setVisible(false);
            portal3.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact2()) {
            rocket7.setVisible(false);
            portal3.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact3()) {
            rocket7.setVisible(false);
            portal3.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        }else if (contact4()){
            rocket7.setVisible(false);
            portal3.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact5()) {
            rocket7.setVisible(false);
            portal3.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact6()) {
            rocket7.setVisible(false);
            portal3.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact7()) {
            new Boss();
            dispose();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == try_Again){
            try_Again.setVisible(false);
            go_back.setVisible(false);
            game_Over.setVisible(false);
            rocket7.setBounds(400, 700, 100, 100);
            portal3.setBounds(370,30,150,150);
            rocket7.setVisible(true);
            portal3.setVisible(true);
            visibility();
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' -> rocket7.setLocation(rocket7.getX(), rocket7.getY() - 10);
            case 'a' -> rocket7.setLocation(rocket7.getX() - 10, rocket7.getY());
            case 's' -> rocket7.setLocation(rocket7.getX(), rocket7.getY() + 10);
            case 'd' -> rocket7.setLocation(rocket7.getX() + 10, rocket7.getY());
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38 -> rocket7.setLocation(rocket7.getX(), rocket7.getY() - 10);
            case 37 -> rocket7.setLocation(rocket7.getX() - 10, rocket7.getY());
            case 40 -> rocket7.setLocation(rocket7.getX(), rocket7.getY() + 10);
            case 39 -> rocket7.setLocation(rocket7.getX() + 10, rocket7.getY());
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
        System.out.println(e.getKeyCode());
        visibility();
    }
}
