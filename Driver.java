import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Driver extends Application {
    Pane pane;
    Button button;
    int buttonWidth = 60;
    int buttonHeight = 25;

    int screenWidth = 500;
    int screenHeight = 300;
    BouncingBall ball;

    @Override
    public void start(Stage primaryStage) throws Exception {
        buildGui(primaryStage);

    }

    private void buildGui(Stage stage) {
        buildStage(stage);
        instantiateBall();
        createButtons();
    }

    private void buildStage(Stage stage) {
        pane = new Pane();
        Scene scene = new Scene(pane, screenWidth, screenHeight);
        stage.setTitle("BouncingBall");
        stage.setScene(scene);
        stage.show();

    }

    private void instantiateBall() {
        ball = new BouncingBall(200, 25, 10);
        pane.getChildren().add(ball);

    }

    private void createButtons() {
        Button up = createButton("Up", 0, screenHeight - buttonHeight);
        Button down = createButton("Down", buttonWidth, screenHeight - buttonHeight);
        Button left = createButton("Left", buttonWidth * 2, screenHeight - buttonHeight);
        Button right = createButton("Right", buttonWidth * 3, screenHeight - buttonHeight);
        right.setOnMouseClicked(e -> {
            ball.moveRight(5, 0);
            if(ball.getCenterX() >= screenWidth)
                ball.setCenterX(200);
        });
        left.setOnMouseClicked(e -> {
            ball.moveLeft(5, 0);
            if(ball.getCenterX() <= 0)
                ball.setCenterX(100);
        });
        up.setOnMouseClicked(e -> {
            ball.moveUp(5, 0);
            if(ball.getCenterY() <= 0)
                ball.setCenterY(200);
        });
        down.setOnMouseClicked(e -> {
            ball.moveDown(5, 0);
            if(ball.getCenterY() >= screenHeight)
                ball.setCenterY(100);
        });
    }

    private Button createButton(String name, int x, int y) {
        Button newButton = new Button(name);
        newButton.setMaxSize(buttonWidth, buttonHeight);
        newButton.setMinSize(buttonWidth, buttonHeight);
        newButton.setLayoutX(x);
        newButton.setLayoutY(y);
        pane.getChildren().add(newButton);
        return newButton;

    }
}