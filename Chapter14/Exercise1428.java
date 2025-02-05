import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Random;


public class Exercise1428 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		Random random = new Random();
		
		int hour = random.nextInt(12);
		
		int minute = random.nextInt(31);
		
		
		ClockPane clockPane = new ClockPane(hour, minute, 0);
		
		clockPane.setSecondHandVisible(false);
		
		
		Scene scene = new Scene(clockPane, 200, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Clock with Hour and Minute Hands");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
