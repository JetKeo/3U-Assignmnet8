
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author ${user}
 */
public class A8 extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;


    // GAME VARIABLES WOULD GO HERE
    double mouth = 0;
    double add2 = 2;
    double ear = 110;
    double add02 = 0.3;


    // GAME VARIABLES END HERE   

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        //face
        Color brown = new Color(184,133,118);
        g.setColor(brown);
        g.fillOval(200,110,300,350);
        
        //hair
        Color purple = new Color(205,78,237);
        g.setColor(purple);
        g.drawArc(230, 110, 100, 150, 100, 100);
        g.drawArc(235, 110, 100, 100, 100, 100);
        g.drawArc(240, 110, 100, 150, 100, 110);
        g.drawArc(245, 110, 100, 100, 100, 110);
        g.drawArc(250, 110, 100, 150, 100, 100);
        g.drawArc(255, 110, 100, 100, 100, 110);
        g.drawArc(260, 110, 100, 150, 100, 100);
        g.drawArc(265, 110, 100, 100, 100, 100);
        g.drawArc(270, 110, 100, 150, 100, 100);
        g.drawArc(275, 110, 100, 100, 100, 100);
        g.drawArc(280, 110, 100, 150, 100, 100);
        g.drawArc(285, 110, 100, 100, 100, 110);
        g.drawArc(290, 110, 100, 150, 100, 110);
        g.drawArc(295, 110, 100, 100, 100, 110);
        g.drawArc(300, 110, 100, 150, 100, 100);
        g.drawArc(305, 110, 100, 100, 100, 100);
        g.drawArc(310, 110, 100, 150, 100, 100);
        g.drawArc(315, 110, 100, 100, 100, 100);
        g.drawArc(320, 110, 100, 150, 100, 100);
        g.drawArc(325, 110, 100, 100, 100, 110);
        g.drawArc(330, 110, 100, 150, 100, 100);
        g.drawArc(335, 110, 100, 100, 100, 110);
        g.drawArc(340, 110, 100, 150, 100, 110);
        g.drawArc(345, 110, 100, 100, 100, 100);
        g.drawArc(350, 110, 100, 150, 100, 110);
        g.drawArc(355, 110, 100, 100, 100, 100);
        g.drawArc(360, 110, 100, 150, 100, 120);
        g.drawArc(365, 110, 100, 100, 100, 100);
        g.drawArc(370, 110, 100, 150, 100, 110);
        g.drawArc(375, 110, 100, 100, 100, 100);
        g.drawArc(380, 110, 100, 100, 260, 100);
        g.drawArc(370, 110, 100, 100, 260, 100);
        g.drawArc(360, 110, 100, 50, 260, 100);
        g.drawArc(350, 110, 100, 50, 260, 100);
        g.drawArc(340, 110, 100, 100, 260, 100);
        g.drawArc(330, 110, 100, 50, 260, 100);
        g.drawArc(320, 110, 100, 50, 260, 100);
        g.drawArc(310, 110, 100, 50, 260, 100);
        g.drawArc(300, 110, 100, 50, 260, 100);
        g.drawArc(320, 110, 100, 100, 260, 100);
        g.drawArc(310, 110, 100, 100, 260, 100);
        
        //eyes
        g.setColor(Color.white);
        g.fillOval(250,200,60,70);
        g.fillOval(350,200,60,70);
        g.setColor(Color.green);
        g.fillOval(250,210,30,40);
        g.fillOval(350,210,30,40);
        
        //ears
        g.setColor(brown);
        g.fillArc(180, 200, 110, (int)ear, 130, 100);
        g.fillArc(410, 200, 110, (int)ear, 290, 100);
        
        //mouth
        g.setColor(Color.black);
        g.fillArc(280, 320, 200, (int)mouth, 160, 100);
        
        //nose
        g.drawArc(300,265,50,50,100,200);
        
    }


    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void  preSetup(){
       // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            mouth = mouth + add2;
            if (mouth > 100 || mouth == 0){
                add2 = add2 * -1;
            } 
            
            ear = ear + add02;
            if(ear > 120 || ear == 110)
                add02 = add02 * -1;
            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates a windows to show my game
        JFrame frame = new JFrame("My Game");

        // creates an instance of my game
        A8 game = new A8();
        // sets the size of my game
        game.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(game);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);
        
        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        game.addMouseListener(new Mouse());
        
        // starts the game loop
        game.run();
    }

    // Used to implement any of the Mouse Actions
    private static class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e){
            
        }
        
        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e){
            
        }
        
        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e){
            
        }
    }
    
    // Used to implements any of the Keyboard Actions
    private static class Keyboard extends KeyAdapter{
        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e){
            
        }
        
        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e){
            
        }
    }
}

