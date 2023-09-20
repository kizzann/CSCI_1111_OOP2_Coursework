import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RectangleOnPentagon extends Application {
    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Rectangle rectangle = new Rectangle (20, 20);
        rectangle.setFill(Color.ORANGE);
        Polygon pentagon = new Polygon();
        ObservableList<Double> list = pentagon.getPoints();

        pentagon.getPoints().addAll(new Double[]{
                200.0, 300.0,
                300.0, 600.0,
                700.0, 600.0,
                800.0, 300.0,
                500.0, 100.0
        });


        pentagon.setFill(Color.WHITE);
        pentagon.setStroke(Color.BLACK);
        pane.getChildren().add(pentagon);
        pane.getChildren().add(rectangle);

        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setPath(pentagon);
        pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);

        FadeTransition ft = new FadeTransition(Duration.millis(4000), rectangle);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);

        ft.play();
        pt.play();

        pentagon.setOnMousePressed(e -> pt.pause());
        pentagon.setOnMouseReleased(e -> pt.play());

        Scene scene = new Scene(pane,1000,1000);
        primaryStage.setTitle("RectangleOnPentagon");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}