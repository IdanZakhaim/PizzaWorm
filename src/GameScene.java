import javax.swing.*;
import java.awt.*;

public class GameScene extends JPanel {

    private Worm worm;
    private ImageIcon backGroundGame;
    private ImageIcon smallPizza;
    private ImageIcon mediumPizza;
    private ImageIcon bigPizza;
    private int score;


    public GameScene(int x, int y, int width, int height) {
        this.setBackground(Color.GREEN);
        this.setBounds(x,y,width,height);
        this.worm = new Worm();
        this.backGroundGame = new ImageIcon("PizzaDesk.png");
        this.smallPizza = new ImageIcon("LittlePizza.png");
        this.mediumPizza = new ImageIcon("MediumPizza.png");
        this.bigPizza = new ImageIcon("BigPizza.png");
        this.score = 0;
//אולי להוסיף SCORE
    }

    //התנגשויות בפיצות,במסך ובתולעת
    //יצירת ראנדום לגודל הפיצה ולמיקום שלה


    protected void game (){

    }
//    protected void paintRandomPizza (){
//        while (collision){
//            Random randomWidth = new Random();
//            randomWidth.nextInt(10,Finals.WINDOW_WIDTH-10);
//            Random randomHeight = new Random();
//            randomHeight.nextInt(10,Finals.WINDOW_HEIGHT-10);
//            Random randomPizza = new Random();
//            randomPizza.nextInt(Finals.SMALL_PIZZA_NUMBER,Finals.BIG_PIZZA_NUMBER);
    //להמשיך את הראנדום לpaintcomponent
    //}
//}

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.worm.paintComponent(graphics);
        this.backGroundGame.paintIcon(this, graphics, Finals.X_ZERO_POINT, Finals.Y_ZERO_POINT);

    }
      //  if ()
        //אם קיימת התנגשות בפיצה ראנדומלית אז תצייר פיצה אחרת (פונקציה)
//        this.carLeft.paintIcon(this, graphics, this.xCarLeft, this.yCarLeft);
//        this.carLeft.paintIcon(this, graphics, this.xCarLeft - Final.OBJECT_POSITION_NEW, this.yCarLeft);
//        this.carLeft.paintIcon(this, graphics, this.xCarLeft - Final.OBJECT_POSITION, this.yCarLeft);
//        this.carRight.paintIcon(this, graphics, this.xCarRight, this.yCarRight);
//        this.carRight.paintIcon(this, graphics, this.xCarRight + Final.OBJECT_POSITION_NEW, this.yCarRight);
//        this.carRight.paintIcon(this, graphics, this.xCarRight + Final.OBJECT_POSITION, this.yCarRight);
//        this.truckLeft.paintIcon(this, graphics, this.xTruckLeft, this.yTruckLeft);
//        this.truckLeft.paintIcon(this, graphics, this.xTruckLeft - Final.OBJECT_POSITION_NEW, this.yTruckLeft);
//        this.truckLeft.paintIcon(this, graphics, this.xTruckLeft - Final.OBJECT_POSITION, this.yTruckLeft);
//        this.truckRight.paintIcon(this, graphics, this.xTruckRight, this.yTruckRight);
//        this.truckRight.paintIcon(this, graphics, this.xTruckRight + Final.OBJECT_POSITION_NEW, this.yTruckRight);
//        this.truckRight.paintIcon(this, graphics, this.xTruckRight + Final.OBJECT_POSITION, this.yTruckRight);
//        this.rose.paintIcon(this, graphics, this.xRose, this.yRose);
//        this.rose.paintIcon(this, graphics, this.xRose + Final.ROSE1, this.yRose);
//        this.rose.paintIcon(this, graphics, this.xRose + Final.ROSE2, this.yRose);
//        this.rose.paintIcon(this, graphics, this.xRose + Final.ROSE3, this.yRose);
//        this.snake.paintIcon(this, graphics, this.xSnake + Final.SNAKE1, this.ySnake);
//        this.snake.paintIcon(this, graphics, this.xSnake + Final.SNAKE2, this.ySnake);
//        this.snake.paintIcon(this, graphics, this.xSnake + Final.SNAKE3, this.ySnake);
//        this.frog.paintComponent(graphics);
//        time--;
//        String timer = String.valueOf(time);
//        String timeSec = "Frog time left :";
//        getGraphics().drawString(timeSec + timer, Final.X_TIME, Final.Y_TIME);

  //  public boolean collision(Worm worm) {
//        boolean alive = true;
//        if (frog.getyFrog() <= Final.START_ROAD1 && frog.getyFrog() >= Final.END_ROAD1) { // ROAD 1
//            if (frog.getxFrog() == xTruckLeft
//                    || frog.getxFrog() == xTruckLeft - Final.OBJECT_POSITION_NEW
//                    || frog.getxFrog() == xTruckLeft - Final.OBJECT_POSITION) {
//                alive = false;
//            }
//        }
//        if (frog.getyFrog() <= Final.START_ROAD2 && frog.getyFrog() >= Final.END_ROAD2) { // ROAD 2
//            if (frog.getxFrog() == xTruckRight
//                    || frog.getxFrog() == xTruckRight + Final.OBJECT_POSITION_NEW
//                    || frog.getxFrog() == xTruckRight + Final.OBJECT_POSITION) {
//                alive = false;
//            }
//        }
//        if (frog.getyFrog() <= Final.START_RIVER && frog.getyFrog() >= Final.END_RIVER) { //RIVER
//            if (frog.getyFrog() <= Final.START_ROSE && frog.getyFrog() >= Final.END_ROSE) { // ROSE
//                System.out.println("rose x:" + xRose + " frog x:" + frog.getxFrog());
//                if ((frog.getxFrog() >= xRose - Final.START_AND_END_ROSE1 && frog.getxFrog() <= xRose + Final.START_AND_END_ROSE1)
//                        ||
//                        (frog.getxFrog() >= xRose + Final.START_ROSE2 && frog.getxFrog() <= xRose + Final.END_ROSE2)
//                        ||
//                        (frog.getxFrog() >= xRose + Final.START_ROSE3 && frog.getxFrog() <= xRose + Final.END_ROSE3)
//                        ||
//                        (frog.getxFrog() >= xRose + Final.START_ROSE4 && frog.getxFrog() <= xRose + Final.END_ROSE4)) {
//                    alive = true;
//                } else {
//                    alive = false;
//                }
//            } else {
//                alive = false;
//            }
//        }
//        if (frog.getyFrog() <= Final.START_ROAD3 && frog.getyFrog() >= Final.END_ROAD3) { // ROAD 3
//            if (frog.getxFrog() == xCarLeft
//                    || frog.getxFrog() == xCarLeft - Final.OBJECT_POSITION_NEW
//                    || frog.getxFrog() == xCarLeft - Final.OBJECT_POSITION) {
//                alive = false;
//            }
//        }
//        if (frog.getyFrog() <= Final.START_ROAD4 && frog.getyFrog() >= Final.END_ROAD4) { // ROAD 4
//            if (frog.getxFrog() == xCarRight
//                    || frog.getxFrog() == xCarRight + Final.OBJECT_POSITION_NEW
//                    || frog.getxFrog() == xCarRight + Final.OBJECT_POSITION) {
//                alive = false;
//            }
//        }
//        return alive;
//    }
   // }
    }
