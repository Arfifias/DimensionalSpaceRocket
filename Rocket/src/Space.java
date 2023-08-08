import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Space extends JFrame implements KeyListener, ActionListener {
    public ImageIcon icon;
    public ImageIcon rocket;
    public ImageIcon enemy;
    public ImageIcon portal;
    public JButton tryAgain;
    public JButton back;
    public JLabel rocket2;
    public JLabel gameOver;
    public JLabel enemy1;
    public JLabel enemy2;
    public JLabel enemy3;
    public JLabel enemy4;
    public JLabel enemy5;
    public JLabel enemy6;
    public JLabel portal2;


    Space() {
        icon = new ImageIcon("logo\\icon.jfif");//Dimensional Space Rocket logo
        rocket = new ImageIcon("images\\Rocket.png");//Playable rocket
        enemy = new ImageIcon("images\\Ufo.png");//Enemies
        portal = new ImageIcon("images\\Portal.png");//The portal to travel between dimensions

        tryAgain = new JButton("Try Again");
        tryAgain.setBounds(550,700,200,100);
        tryAgain.setFont(new Font("Arial",Font.PLAIN,25));
        tryAgain.setFocusable(false);
        tryAgain.setVisible(false);
        tryAgain.setBackground(Color.BLACK);
        tryAgain.setForeground(Color.WHITE);
        tryAgain.addActionListener(this);

        back = new JButton("Back");
        back.setBounds(150,700,200,100);
        back.setFont(new Font("Arial",Font.PLAIN,25));
        back.setFocusable(false);
        back.setVisible(false);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(e -> new Menu());
        back.addActionListener(e -> dispose());
        back.addActionListener(this);

        /*
        *Above there are two buttons which appear when the player loses by touching the UFO(it's an instant kill)
        * The try again button allows the player to replay the stage
        * On the other hand the back button takes the player back to the main menu
        * Also by losing I put a message which is Game Over as it can be seen bellow
         */

        rocket2 = new JLabel();
        rocket2.setIcon(rocket);
        rocket2.setBounds(400, 700, 100, 100);

        gameOver = new JLabel("Game Over");
        gameOver.setBounds(390,30,200,200);
        gameOver.setFont(new Font("Arial",Font.BOLD,25));
        gameOver.setForeground(new Color(255,255,255));
        gameOver.setVisible(false);

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

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Dimensional Space Rocket");
        this.setIconImage(icon.getImage());
        this.setLayout(null);
        this.addKeyListener(this);//Important for rocket movement
        this.setSize(new Dimension(900, 900));
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setResizable(false);
        this.setLocation(500, 100);
        this.add(tryAgain);
        this.add(back);
        this.add(rocket2);
        this.add(gameOver);
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
        Rectangle boundsRocket = rocket2.getBounds();
        Rectangle boundsEnemy1 = enemy1.getBounds();
        return boundsRocket.intersects(boundsEnemy1);
    }
    private boolean contact2(){
        Rectangle boundsRocket = rocket2.getBounds();
        Rectangle boundsEnemy2 = enemy2.getBounds();
        return boundsRocket.intersects(boundsEnemy2);
    }
    private boolean contact3(){
        Rectangle boundsRocket = rocket2.getBounds();
        Rectangle boundsEnemy3 = enemy3.getBounds();
        return boundsRocket.intersects(boundsEnemy3);
    }
    private boolean contact4(){
        Rectangle boundsRocket = rocket2.getBounds();
        Rectangle boundsEnemy4 = enemy4.getBounds();
        return boundsRocket.intersects(boundsEnemy4);
    }
    private boolean contact5(){
        Rectangle boundsRocket = rocket2.getBounds();
        Rectangle boundsEnemy5 = enemy5.getBounds();
        return boundsRocket.intersects(boundsEnemy5);
    }
    private boolean contact6(){
        Rectangle boundsRocket = rocket2.getBounds();
        Rectangle boundsEnemy6 = enemy6.getBounds();
        return boundsRocket.intersects(boundsEnemy6);
    }
    private boolean contact7(){
        Rectangle boundsRocket = rocket2.getBounds();
        Rectangle boundsPortal = portal2.getBounds();
        return boundsRocket.intersects(boundsPortal);
    }
    /*
    *Above the private boolean methods is the most important part of the code
    * Basically it returns if the rocket touched the UFO or the Portal
    * And in each case it displays the Game Over screen or the next stage
    * This is possible through the bellow method called visibility
    * Worth mentioning that almost every single class except the last one possesses almost the same structure
     */
    private void visibility(){
        if(contact()){
            rocket2.setVisible(false);
            portal2.setVisible(false);
            gameOver.setVisible(true);
            tryAgain.setVisible(true);
            back.setVisible(true);
        } else if (contact2()) {
            rocket2.setVisible(false);
            portal2.setVisible(false);
            gameOver.setVisible(true);
            tryAgain.setVisible(true);
            back.setVisible(true);
        } else if (contact3()) {
            rocket2.setVisible(false);
            portal2.setVisible(false);
            gameOver.setVisible(true);
            tryAgain.setVisible(true);
            back.setVisible(true);
        }else if (contact4()){
            rocket2.setVisible(false);
            portal2.setVisible(false);
            gameOver.setVisible(true);
            tryAgain.setVisible(true);
            back.setVisible(true);
        } else if (contact5()) {
            rocket2.setVisible(false);
            portal2.setVisible(false);
            gameOver.setVisible(true);
            tryAgain.setVisible(true);
            back.setVisible(true);
        } else if (contact6()) {
            rocket2.setVisible(false);
            portal2.setVisible(false);
            gameOver.setVisible(true);
            tryAgain.setVisible(true);
            back.setVisible(true);
        } else if (contact7()) {
            new Space2();
            dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' -> rocket2.setLocation(rocket2.getX(), rocket2.getY() - 10);
            case 'a' -> rocket2.setLocation(rocket2.getX() - 10, rocket2.getY());
            case 's' -> rocket2.setLocation(rocket2.getX(), rocket2.getY() + 10);
            case 'd' -> rocket2.setLocation(rocket2.getX() + 10, rocket2.getY());
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38 -> rocket2.setLocation(rocket2.getX(), rocket2.getY() - 10);
            case 37 -> rocket2.setLocation(rocket2.getX() - 10, rocket2.getY());
            case 40 -> rocket2.setLocation(rocket2.getX(), rocket2.getY() + 10);
            case 39 -> rocket2.setLocation(rocket2.getX() + 10, rocket2.getY());
        }

        /*
        *The two methods above are the movement keys of the game
        * Basically with each button pressed the rocket moves
         */

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
        System.out.println(e.getKeyCode());
        visibility();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tryAgain){
            tryAgain.setVisible(false);
            back.setVisible(false);
            gameOver.setVisible(false);
            rocket2.setBounds(400, 700, 100, 100);
            portal2.setBounds(370,30,150,150);
            rocket2.setVisible(true);
            portal2.setVisible(true);
            visibility();
        }
        /*
        *Above one of the most important methods
        * By pressing the try again button the stages resets
         */
    }
}
