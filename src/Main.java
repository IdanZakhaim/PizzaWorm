import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();

    }
    public Main () {
        OpenScene openScene = new OpenScene(Finals.X_ZERO_POINT,Finals.Y_ZERO_POINT,Finals.WINDOW_WIDTH,Finals.WINDOW_HEIGHT);
        this.add(openScene);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Finals.WINDOW_WIDTH,Finals.WINDOW_HEIGHT);
        this.setVisible(true);
        repaint();
    }
}