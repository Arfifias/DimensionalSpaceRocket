import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Space3 extends JFrame implements ActionListener, KeyListener {

    public ImageIcon icon;
    public ImageIcon rocket4;
    public ImageIcon enemy;
    public ImageIcon portal;
    public JButton try_Again;
    public JButton go_back;
    public JLabel game_Over;
    public JLabel rocket5;
    public JLabel enemy1;
    public JLabel enemy2;
    public JLabel enemy3;
    public JLabel enemy4;
    public JLabel enemy5;
    public JLabel enemy6;
    public JLabel portal2;

    Space3(){

        icon = new ImageIcon("logo\\icon.jfif");
        rocket4 = new ImageIcon("images\\Rocket.png");
        enemy = new ImageIcon("images\\Spaceship_Alien.png");
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

        rocket5 = new JLabel();
        rocket5.setIcon(rocket4);
        rocket5.setBounds(400, 700, 100, 100);

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
        enemy4.setIcon(enemy);
        enemy4.setBounds(150,500,100,100);

        enemy5 = new JLabel();
        enemy5.setIcon(enemy);
        enemy5.setBounds(400,500,100,100);

        enemy6 = new JLabel();
        enemy6.setIcon(enemy);
        enemy6.setBounds(650,500,100,100);

        portal2 = new JLabel();
        portal2.setIcon(portal);
        portal2.setBounds(370,30,150,150);
        portal2.setVisible(true);

        /*
         *Same structure as Space class2
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
        this.add(rocket5);
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
        Rectangle boundsRocket = rocket5.getBounds();
        Rectangle boundsEnemy1 = enemy1.getBounds();
        return boundsRocket.intersects(boundsEnemy1);
    }
    private boolean contact2(){
        Rectangle boundsRocket = rocket5.getBounds();
        Rectangle boundsEnemy2 = enemy2.getBounds();
        return boundsRocket.intersects(boundsEnemy2);
    }
    private boolean contact3(){
        Rectangle boundsRocket = rocket5.getBounds();
        Rectangle boundsEnemy3 = enemy3.getBounds();
        return boundsRocket.intersects(boundsEnemy3);
    }
    private boolean contact4(){
        Rectangle boundsRocket = rocket5.getBounds();
        Rectangle boundsEnemy4 = enemy4.getBounds();
        return boundsRocket.intersects(boundsEnemy4);
    }
    private boolean contact5(){
        Rectangle boundsRocket = rocket5.getBounds();
        Rectangle boundsEnemy5 = enemy5.getBounds();
        return boundsRocket.intersects(boundsEnemy5);
    }
    private boolean contact6(){
        Rectangle boundsRocket = rocket5.getBounds();
        Rectangle boundsEnemy6 = enemy6.getBounds();
        return boundsRocket.intersects(boundsEnemy6);
    }
    private boolean contact7(){
        Rectangle boundsRocket = rocket5.getBounds();
        Rectangle boundsPortal = portal2.getBounds();
        return boundsRocket.intersects(boundsPortal);
    }
    private void visibility(){
        if(contact()){
            rocket5.setVisible(false);
            portal2.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact2()) {
            rocket5.setVisible(false);
            portal2.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact3()) {
            rocket5.setVisible(false);
            portal2.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        }else if (contact4()){
            rocket5.setVisible(false);
            portal2.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact5()) {
            rocket5.setVisible(false);
            portal2.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact6()) {
            rocket5.setVisible(false);
            portal2.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact7()) {
            new Space4();
            dispose();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == try_Again){
            try_Again.setVisible(false);
            go_back.setVisible(false);
            game_Over.setVisible(false);
            rocket5.setBounds(400, 700, 100, 100);
            portal2.setBounds(370,30,150,150);
            rocket5.setVisible(true);
            portal2.setVisible(true);
            visibility();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' -> rocket5.setLocation(rocket5.getX(), rocket5.getY() - 10);
            case 'a' -> rocket5.setLocation(rocket5.getX() - 10, rocket5.getY());
            case 's' -> rocket5.setLocation(rocket5.getX(), rocket5.getY() + 10);
            case 'd' -> rocket5.setLocation(rocket5.getX() + 10, rocket5.getY());
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38 -> rocket5.setLocation(rocket5.getX(), rocket5.getY() - 10);
            case 37 -> rocket5.setLocation(rocket5.getX() - 10, rocket5.getY());
            case 40 -> rocket5.setLocation(rocket5.getX(), rocket5.getY() + 10);
            case 39 -> rocket5.setLocation(rocket5.getX() + 10, rocket5.getY());
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
        System.out.println(e.getKeyCode());
        visibility();

    }
}
