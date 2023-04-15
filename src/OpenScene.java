import javax.swing.*;
import java.awt.*;

public class OpenScene extends JPanel {
    private int x;
    private int y;
    private int width;
    private int height;

    private ImageIcon openPic;
    //להוסיף תמונה ומסך משחק

    public OpenScene (int x,int y, int width, int height){
        this.setBounds(x,y,width,height);
        this.openPic = new ImageIcon("OpenPic.png");
        this.setVisible(true);

        //this.gameScene = new GameScene(x, y, width, height);
    }

    protected void paintComponent (Graphics graphics){
        super.paintComponent(graphics);
        InformationScene informationScene = new InformationScene(Finals.X_ZERO_POINT, Finals.Y_ZERO_POINT, Finals.WINDOW_WIDTH, Finals.WINDOW_HEIGHT);
        GameScene gameScene = new GameScene(Finals.X_ZERO_POINT, Finals.Y_ZERO_POINT, Finals.WINDOW_WIDTH, Finals.WINDOW_HEIGHT);
        this.openPic.paintIcon(this,graphics,Finals.X_ZERO_POINT,Finals.Y_ZERO_POINT);
        JButton button = new JButton("Start");
        button.setBounds(Finals.X_START_BUTTON,Finals.Y_START_BUTTON,Finals.WIDTH_START_BUTTON,Finals.HIGTH_START_BUTTON);
        this.add(button);
        button.setOpaque(true);
        button.setBackground(Color.blue);
        JButton button2 = new JButton("Information");
        button2.setBounds(Finals.X_INFORMATION_BUTTON,Finals.Y_INFORMATION_BUTTON,Finals.WIDTH_INFORMATION_BUTTON,Finals.HIGTH_INFORMATION_BUTTON);
        this.add(button2);
        button2.setOpaque(true);
        button2.setBackground(Color.yellow);
        button.addActionListener((event) -> {
            removeButtons(button,button2);
            this.add(gameScene);
//            gameScene.mainGameLoop();
        });

        button2.addActionListener((event) -> {
            removeButtons(button,button2);
            this.add(informationScene);
        });
    }

    protected void removeButtons (JButton button, JButton button2){
        this.remove(button);
        this.remove(button2);
        repaint();
    }

}
