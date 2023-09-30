import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;;

public class ChangingText extends Application {
    int width = 500;
    int height = 150;
    BorderPane pane = new BorderPane();
    Text text = new Text(20, 40, "Programming is fun!");
    @Override
    public void start(Stage primaryStage) {
        createGui(primaryStage);

    }
    public void createGui(Stage stage) {
        createText();
        createButtons();
        getColors();


        Scene scene = new Scene(pane, width, height);
        stage.setTitle("Changing Text");
        stage.setScene(scene);
        stage.show();

    }
    public void createText() {
        Pane paneForText = new Pane();
        text.setStyle("-fx-font: 26 ariel");
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);

    }
    public void createButtons() {
        HBox paneForButtons = new HBox(20);
        Button btLeft = new Button("<- Left");
        Button btRight = new Button("Right ->");
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color: red");
        paneForButtons.getChildren().addAll(btLeft, btRight);
        pane.setBottom(paneForButtons);

        btRight.setOnMouseClicked(event -> {
            if (text.getX() < pane.getWidth() - 240) {
                text.setX(text.getX() + 20);
            }
        });
        btLeft.setOnMouseClicked(event -> {
            if (text.getX() > 0) {
                text.setX(text.getX() - 20);
            }
        });
    }

    public void getColors() {
        HBox paneForRadioButtons = new HBox(20);
        paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
        paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: red");

        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbBlue = new RadioButton("Blue");
        RadioButton rbGreen = new RadioButton("Green");
        paneForRadioButtons.getChildren().addAll(rbBlue, rbRed, rbGreen);
        pane.setTop(paneForRadioButtons);

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbBlue.setToggleGroup(group);
        rbGreen.setToggleGroup(group);

        rbRed.setOnAction(e -> {
            if(rbRed.isSelected()) {
                text.setFill(Color.RED);
            }
        });
        rbGreen.setOnAction(e -> {
            if(rbGreen.isSelected()) {
                text.setFill(Color.GREEN);
            }
        });
        rbBlue.setOnAction(e -> {
            if(rbBlue.isSelected()) {
                text.setFill(Color.BLUE);
            }
        });
    }

}
