import javafx.scene.shape.Circle;

public class BouncingBall extends Circle {
    public Circle ball;

    public BouncingBall(double centerX, double centerY, double radius) {
        super(centerX, centerY, radius);

        System.out.println("Creating a bouncing ball");
    }

    public void moveUp(int xAmount, int yAmount) {

//            setCenterX(getCenterX() + 25);
        setCenterY(getCenterY() - 25);
    }

    public void moveDown(int xAmount, int yAmount) {
        setCenterY(getCenterY() + 25);
    }

    public void moveLeft(int xAmount, int yAmount) {
        setCenterX(getCenterX() - 25);
    }

    public void moveRight(int xAmount, int yAmount) {
        setCenterX(getCenterX() + 25);
    }
}
