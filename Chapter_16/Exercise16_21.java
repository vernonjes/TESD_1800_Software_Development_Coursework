import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

import java.io.File;

public class Exercise16_21 extends Application {
	
	private TextField textField;
	private Timeline timeLine;
	private MediaPlayer mediaPlayer;
	private int remainingSeconds;
	
	@Override
	public void start(Stage primaryStage) {
		
		textField = new TextField();
		
		textField.setFont(Font.font(24));
		textField.setPromptText("Enter time in seconds");
		
		textField.setAlignment(Pos.CENTER);
		
		textField.setOnAction(e -> startCountdown());
		
		
		StackPane stack = new StackPane(textField);
		
		stack.setPadding(new Insets(20));
	
		
		Scene scene = new Scene(stack, 300, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Countdown");
		primaryStage.show();
		
	}
	
	private void startCountdown() {
		try {
			
			remainingSeconds = Integer.parseInt(textField.getText());
			
			textField.setEditable(false);
			
			
			timeLine = new Timeline(new KeyFrame(Duration.seconds(1), e -> updateCountdown()));
			
			timeLine.setCycleCount(Timeline.INDEFINITE);
			
			timeLine.play();
			
		} catch (NumberFormatException e) {
			
			textField.setText("Invalid input.");
		}
	}
	
	private void updateCountdown() {
		if (remainingSeconds > 0) {
			remainingSeconds--;
			
			textField.setText(String.valueOf(remainingSeconds));
		} else {
			timeLine.stop();
			textField.setText("Time's Up!");
			
			playMusic();
		}
	}
	
	private void playMusic() {
		String musicFile = "\"C:\\Users\\jivdo\\Downloads\\anthem0.mp3\"";
		
		Media media = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer.play();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
