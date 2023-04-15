import javax.swing.*;
import java.awt.*;
import java.awt.dnd.DropTarget;

public class Main extends JFrame {
    GameScene gameScene = new GameScene(Finals.X_ZERO_POINT, Finals.Y_ZERO_POINT, Finals.WINDOW_WIDTH, Finals.WINDOW_HEIGHT);
    InformationScene informationScene = new InformationScene(Finals.X_ZERO_POINT, Finals.Y_ZERO_POINT, Finals.WINDOW_WIDTH, Finals.WINDOW_HEIGHT);
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        OpenScene openScene = new OpenScene(Finals.X_ZERO_POINT, Finals.Y_ZERO_POINT, Finals.WINDOW_WIDTH, Finals.WINDOW_HEIGHT);
        JButton startButton = new JButton("Start");
        startButton.setBounds(Finals.X_START_BUTTON,Finals.Y_START_BUTTON,Finals.WIDTH_START_BUTTON,Finals.HEIGHT_START_BUTTON);
        startButton.setBackground(Color.blue);
        startButton.setOpaque(true);
        this.add(startButton);
        JButton informationButton = new JButton("Information");
        informationButton.setBounds(Finals.X_INFORMATION_BUTTON,Finals.Y_INFORMATION_BUTTON,Finals.WIDTH_INFORMATION_BUTTON,Finals.HEIGTH_INFORMATION_BUTTON);
        informationButton.setBackground(Color.blue);
        informationButton.setOpaque(true);
        this.add(informationButton);
        this.add(openScene);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Finals.WINDOW_WIDTH, Finals.WINDOW_HEIGHT);
        this.setVisible(true);

        startButton.addActionListener((event) -> {
            this.removeAll();
            gameScene.paintComponent(getGraphics());
        });

        informationButton.addActionListener((event) -> {
            this.remove(informationButton);
            this.remove(startButton);
            this.add(informationScene);
            JButton secondStartButton = informationScene.createStartButton();
            repaint();
            secondStartButton.addActionListener((start)->{
                this.removeAll();
                gameScene.paintComponent(getGraphics());
                    });
        });
    }
}