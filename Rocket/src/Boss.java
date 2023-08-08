import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Boss extends JFrame implements ActionListener,KeyListener {

    public ImageIcon icon;
    public ImageIcon rocket8;
    public ImageIcon enemy;
    public ImageIcon boss;
    public ImageIcon explosion;

    public JButton try_Again;
    public JButton play_again;
    public JButton go_back;
    public JLabel game_Over;
    public JLabel mission_accomplished;
    public JLabel rocket9;
    public JLabel enemy1;
    public JLabel enemy2;
    public JLabel enemy3;
    public JLabel enemy4;
    public JLabel enemy5;
    public JLabel enemy6;
    public JLabel final_boss;
    public JLabel explode;
    Boss(){

        icon = new ImageIcon("logo\\icon.jfif");
        rocket8 = new ImageIcon("images\\Rocket.png");
        enemy = new ImageIcon("images\\Ufo2.png");
        boss = new ImageIcon("images\\Alien.png");
        explosion = new ImageIcon("images\\Explosion.png");//Useful for the endgame

        try_Again = new JButton("Try Again");
        try_Again.setBounds(550,700,200,100);
        try_Again.setFont(new Font("Arial",Font.PLAIN,25));
        try_Again.setFocusable(false);
        try_Again.setVisible(false);
        try_Again.setBackground(Color.BLACK);
        try_Again.setForeground(Color.WHITE);
        try_Again.addActionListener(this);

        play_again = new JButton("Play Again");
        play_again.setBounds(350,700,200,100);
        play_again.setFont(new Font("Arial",Font.PLAIN,25));
        play_again.setFocusable(false);
        play_again.setVisible(false);
        play_again.setBackground(Color.BLACK);
        play_again.setForeground(Color.WHITE);
        play_again.addActionListener(this);
        play_again.addActionListener(e -> new Menu());
        play_again.addActionListener(e -> dispose());

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

        /*
        *Above there are three buttons each one with different functionality
        * The first two are explained in previous classes,basically the first one resets the stage and the last one takes the player to the previous stage
        * The play again button takes the player to the main menu to start a new game
        * Also in the end of the game where the rocket destroys the alien a message is displayed mission accomplished
        * Which can be seen bellow
         */

        game_Over = new JLabel("Game Over");
        game_Over.setBounds(390,30,200,200);
        game_Over.setFont(new Font("Arial",Font.BOLD,25));
        game_Over.setForeground(new Color(255,255,255));
        game_Over.setVisible(false);

        mission_accomplished = new JLabel("Mission Accomplished");
        mission_accomplished.setBounds(230,250,600,400);
        mission_accomplished.setFont(new Font("Arial",Font.BOLD,40));
        mission_accomplished.setForeground(new Color(255,255,255));
        mission_accomplished.setVisible(false);


        rocket9 = new JLabel();
        rocket9.setIcon(rocket8);
        rocket9.setBounds(400, 700, 100, 100);

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

        final_boss = new JLabel();
        final_boss.setIcon(boss);
        final_boss.setBounds(350,30,200,200);
        final_boss.setVisible(true);

        explode = new JLabel();
        explode.setIcon(explosion);
        explode.setBounds(350,30,200,200);
        explode.setVisible(false);

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
        this.add(play_again);
        this.add(go_back);
        this.add(game_Over);
        this.add(mission_accomplished);
        this.add(rocket9);
        this.add(enemy1);
        this.add(enemy2);
        this.add(enemy3);
        this.add(enemy4);
        this.add(enemy5);
        this.add(enemy6);
        this.add(final_boss);
        this.add(explode);
        this.setVisible(true);

    }
    private boolean contact(){
        Rectangle boundsRocket = rocket9.getBounds();
        Rectangle boundsEnemy1 = enemy1.getBounds();
        return boundsRocket.intersects(boundsEnemy1);
    }
    private boolean contact2(){
        Rectangle boundsRocket = rocket9.getBounds();
        Rectangle boundsEnemy2 = enemy2.getBounds();
        return boundsRocket.intersects(boundsEnemy2);
    }
    private boolean contact3(){
        Rectangle boundsRocket = rocket9.getBounds();
        Rectangle boundsEnemy3 = enemy3.getBounds();
        return boundsRocket.intersects(boundsEnemy3);
    }
    private boolean contact4(){
        Rectangle boundsRocket = rocket9.getBounds();
        Rectangle boundsEnemy4 = enemy4.getBounds();
        return boundsRocket.intersects(boundsEnemy4);
    }
    private boolean contact5(){
        Rectangle boundsRocket = rocket9.getBounds();
        Rectangle boundsEnemy5 = enemy5.getBounds();
        return boundsRocket.intersects(boundsEnemy5);
    }
    private boolean contact6(){
        Rectangle boundsRocket = rocket9.getBounds();
        Rectangle boundsEnemy6 = enemy6.getBounds();
        return boundsRocket.intersects(boundsEnemy6);
    }
    private boolean contact7(){
        Rectangle boundsRocket = rocket9.getBounds();
        Rectangle boundsPortal = final_boss.getBounds();
        return boundsRocket.intersects(boundsPortal);
    }
    private void visibility(){
        if(contact()){
            rocket9.setVisible(false);
            final_boss.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact2()) {
            rocket9.setVisible(false);
            final_boss.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact3()) {
            rocket9.setVisible(false);
            final_boss.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        }else if (contact4()){
            rocket9.setVisible(false);
            final_boss.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact5()) {
            rocket9.setVisible(false);
            final_boss.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact6()) {
            rocket9.setVisible(false);
            final_boss.setVisible(false);
            game_Over.setVisible(true);
            try_Again.setVisible(true);
            go_back.setVisible(true);
        } else if (contact7()) {
            rocket9.setVisible(false);
            final_boss.setVisible(false);
            enemy1.setVisible(false);
            enemy2.setVisible(false);
            enemy3.setVisible(false);
            enemy4.setVisible(false);
            enemy5.setVisible(false);
            enemy6.setVisible(false);
            explode.setVisible(true);
            mission_accomplished.setVisible(true);
            play_again.setVisible(true);

        }
        /*
        *This class has almost the same structure as the previous classes
        * Except in visibility method everything disappears
        * And that's done for the end game
        * And in the end game the rocket destroys the alien and a big explosion pops up
        * And of course the mission accomplished message and the play again button
        * Enjoy :)
         */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == try_Again){
            try_Again.setVisible(false);
            go_back.setVisible(false);
            game_Over.setVisible(false);
            rocket9.setBounds(400, 700, 100, 100);
            final_boss.setBounds(370,30,150,150);
            rocket9.setVisible(true);
            final_boss.setVisible(true);
            visibility();
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w' -> rocket9.setLocation(rocket9.getX(), rocket9.getY() - 10);
            case 'a' -> rocket9.setLocation(rocket9.getX() - 10, rocket9.getY());
            case 's' -> rocket9.setLocation(rocket9.getX(), rocket9.getY() + 10);
            case 'd' -> rocket9.setLocation(rocket9.getX() + 10, rocket9.getY());
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38 -> rocket9.setLocation(rocket9.getX(), rocket9.getY() - 10);
            case 37 -> rocket9.setLocation(rocket9.getX() - 10, rocket9.getY());
            case 40 -> rocket9.setLocation(rocket9.getX(), rocket9.getY() + 10);
            case 39 -> rocket9.setLocation(rocket9.getX() + 10, rocket9.getY());
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
        System.out.println(e.getKeyCode());
        visibility();
    }
}
