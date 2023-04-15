import javax.swing.*;
import java.awt.*;

public class OpenScene extends JPanel {
    private int x;
    private int y;
    private int width;
    private int height;
    private ImageIcon openPic;

    public OpenScene (int x,int y, int width, int height){
        this.setBounds(x,y,width,height);
        this.openPic = new ImageIcon("OpenPic.png");
    }

    protected void paintComponent (Graphics graphics){


        super.paintComponent(graphics);
        this.openPic.paintIcon(this,graphics,Finals.X_ZERO_POINT,Finals.Y_ZERO_POINT);
        InformationScene informationScene = new InformationScene(x,y,width,height);
        informationScene.paint(getGraphics());
    }
}

