import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Worm extends JPanel implements KeyListener {

    private ImageIcon worm;
    private int xWorm;
    private int yWorm;


    public Worm (){ //אולי לא צריך בסוגריים
        this.worm = new ImageIcon("WormPlay.png");
        this.xWorm = Finals.WINDOW_WIDTH/2;
        this.yWorm = Finals.WINDOW_HEIGHT/2;
    }

    protected void paintComponent (Graphics graphics){
        super.paintComponent(graphics);
        this.worm.paintIcon(this, graphics,xWorm,yWorm);
    }
    public int getXWorm (){
        return xWorm;
    }

    public void setXWorm (int xWorm){
        this.xWorm = xWorm;
    }

    public int getYWorm (){
        return yWorm;
    }

    public void setYWorm (int yWorm){
        this.yWorm = yWorm;
    }


    public void keyTyped(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

    public void keyPressed(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                this.moveRight();
                break;
            case KeyEvent.VK_LEFT:
                moveLeft();
                break;
            case KeyEvent.VK_UP:
                moveUp();
                break;
            case KeyEvent.VK_DOWN:
                moveDown();
                break;

            // לעשות Pause בהמשך

        }
    }
            public void moveRight () {
                if (this.xWorm>Finals.WINDOW_WIDTH){
                    this.xWorm -= Finals.WORM_X_MOVEMENT;
                }
            }

        public void moveLeft() {
        if (this.xWorm > Finals.X_ZERO_POINT) {
        this.xWorm += Finals.WORM_X_MOVEMENT;
        }
    }
    public void moveUp() {
        if (this.yWorm > Finals.Y_ZERO_POINT) {
            this.yWorm -= Finals.WORM_Y_MOVEMENT;
        }
    }

        public void moveDown() {
            if (this.yWorm < Finals.WINDOW_HEIGHT) {
                this.yWorm += Finals.WORM_Y_MOVEMENT;
            }
        }
}
