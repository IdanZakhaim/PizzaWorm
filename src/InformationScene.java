import javax.swing.*;
import java.awt.*;

public class InformationScene extends JPanel {
    private int x;
    private int y;
    private int width;
    private int height;
    private ImageIcon Information;



public InformationScene (int x, int y , int width, int height){
    this.setBounds(x,y,width,height);
    this.Information = new ImageIcon("InfomationPic.png");
}

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.Information.paintIcon(this, graphics, Finals.X_ZERO_POINT, Finals.Y_ZERO_POINT);
        JLabel instruction1 = new JLabel("Your worm should eat as many pizzas as possible");
        JLabel instruction2 = new JLabel("The bigger the pizza, the more points you'll earn");
        JLabel instruction3 = new JLabel( "When the worm eats pizza it grows");
        JLabel instruction4 = new JLabel( "You need to be careful not to crash into the curtain walls nor the worm itself");
        JLabel instruction5 = new JLabel(  "Use the arrow keys on your keyboard to move around the screen");
        Font font = new Font("david",Font.BOLD,20);
        instruction1.setFont(font);
        instruction2.setFont(font);
        instruction3.setFont(font);
        instruction4.setFont(font);
        instruction5.setFont(font);
        instruction1.setBounds(Finals.WINDOW_WIDTH/2-200,Finals.WINDOW_HEIGHT-750,Finals.WINDOW_WIDTH,Finals.WINDOW_HEIGHT);
        instruction2.setBounds(Finals.WINDOW_WIDTH/2-200,Finals.WINDOW_HEIGHT-700,Finals.WINDOW_WIDTH,Finals.WINDOW_HEIGHT);
        instruction3.setBounds(Finals.WINDOW_WIDTH/2-120,Finals.WINDOW_HEIGHT-650,Finals.WINDOW_WIDTH,Finals.WINDOW_HEIGHT);
        instruction4.setBounds(Finals.WINDOW_WIDTH/2-300,Finals.WINDOW_HEIGHT-600,Finals.WINDOW_WIDTH,Finals.WINDOW_HEIGHT);
        instruction5.setBounds(Finals.WINDOW_WIDTH/2-250,Finals.WINDOW_HEIGHT-550,Finals.WINDOW_WIDTH,Finals.WINDOW_HEIGHT);
        this.add(instruction1);
        this.add(instruction2);
        this.add(instruction3);
        this.add(instruction4);
        this.add(instruction5);
        repaint();
    }

    protected JButton createStartButton (){
        JButton startButton = new JButton("Start");
        startButton.setBounds(Finals.WINDOW_WIDTH/2-50,Finals.WINDOW_HEIGHT-100,Finals.WIDTH_START_BUTTON,Finals.HEIGHT_START_BUTTON);
        startButton.setBackground(Color.blue);
        startButton.setOpaque(true);
        this.add(startButton);
        return startButton;
    }
}