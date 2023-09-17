import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;


public class ShowPolygon extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene and place it in the stage
        Scene scene = new Scene(new MyPolygon(), 400, 400);
        scene.setFill(Color.BLACK);
        primaryStage.setTitle("ShowPolygon"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    class MyPolygon extends Pane {
        private void paint() {
            Text stopText = buildStopText();
            Polygon sign = buildSign();
            getChildren().clear();
            getChildren().addAll(sign, stopText);
        }
        private Text buildStopText(){
            Text stopText = new Text("STOP");
            stopText.setWrappingWidth(200);
            stopText.setX(getWidth() / 2 - stopText.getWrappingWidth() / 2);
            stopText.setY(getHeight() / 2 + 15);
            stopText.setTextAlignment(TextAlignment.CENTER);
            stopText.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
            stopText.setFill(Color.WHITE);
            return stopText;
        }
        private Polygon buildSign(){
            Polygon sign = new Polygon();
            sign.setFill(Color.RED);
            sign.setStroke(Color.WHITE);
            ObservableList<Double> list = sign.getPoints();
            double centerX = getWidth() / 2, centerY = getHeight() / 2;
            double radius = Math.min(getWidth(), getHeight()) * 0.4;
            // Add points to the polygon list
            for (int i = 0; i < 6; i++) {
                list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
                list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
            }
            return sign;
        }
        @Override
        public void setWidth(double width) {
            super.setWidth(width);
            paint();
        }
        @Override
        public void setHeight(double height) {
            super.setHeight(height);
            paint();
        }
    }
}
