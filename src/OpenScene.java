import javax.swing.*;
import java.awt.*;

public class OpenScene extends JPanel {
    private int x;
    private int y;
    private int width;
    private int height;
    private ImageIcon openPic;
    private GameScene gameScene;

    public OpenScene (int x,int y, int width, int height){
        this.setBounds(x,y,width,height);
        this.openPic = new ImageIcon("OpenPic.png");
        this.gameScene = new GameScene(x, y, width, height);
    }

    protected void paintComponent (Graphics graphics){
        InformationScene informationScene = new InformationScene(Finals.X_ZERO_POINT, Finals.Y_ZERO_POINT, Finals.WINDOW_WIDTH, Finals.WINDOW_HEIGHT);
        super.paintComponent(graphics);
        this.openPic.paintIcon(this,graphics,Finals.X_ZERO_POINT,Finals.Y_ZERO_POINT);
//        GameScene gameScene = new GameScene(Finals.X_ZERO_POINT, Finals.Y_ZERO_POINT, Finals.WINDOW_WIDTH, Finals.WINDOW_HEIGHT);
        JButton button = new JButton("Start");
//        button.setBounds(Finals.X_START_BUTTON,Finals.Y_START_BUTTON,Finals.WIDTH_START_BUTTON,Finals.HIGTH_START_BUTTON);
        this.add(button);
        button.setOpaque(true);
        button.setBackground(Color.blue);
        JButton button2 = new JButton("Information");
//        button2.setBounds(Finals.X_INFORMATION_BUTTON,Finals.Y_INFORMATION_BUTTON,Finals.WIDTH_INFORMATION_BUTTON,Finals.HIGTH_INFORMATION_BUTTON);
        this.add(button2);
        button2.setOpaque(true);
        button2.setBackground(Color.yellow);




        button.addActionListener((event) -> {
            this.removeAll();
            this.add(gameScene);
            repaint();

        });

        button2.addActionListener((event) -> {
            this.add(informationScene);
            repaint();
            this.remove(button2);

        });
    }
}

