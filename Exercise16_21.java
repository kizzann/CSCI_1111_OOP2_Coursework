import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise16_21 extends Application  {
	final String URL = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
	@Override
	public void start(Stage primaryStage) {

		TextField tf = new TextField("0");

		tf.setAlignment(Pos.CENTER);
		tf.setPrefColumnCount(3);
		tf.setStyle("-fx-text-fill: black");
		tf.setFont(Font.font("Times", 50));
		BorderPane pane = new BorderPane();
		pane.setCenter(tf);

		Media media = new Media(URL);
		MediaPlayer mediaPlayer = new MediaPlayer(media);


		Timeline timeline = new Timeline(
				new KeyFrame(Duration.millis(1000), e -> {
					tf.setText((Integer.parseInt(tf.getText()) - 1) + "");
				}));
		tf.setOnAction(e -> {
			if (timeline.getStatus() == Animation.Status.RUNNING) {
				timeline.stop();
			}
			timeline.setCycleCount(Integer.parseInt(tf.getText()));
			tf.setEditable(false);
			timeline.play();
		});

		timeline.setOnFinished(e ->  {
			mediaPlayer.play();
		});


		Scene scene = new Scene(pane, 500, 450);
		primaryStage.setTitle("CountDown");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
