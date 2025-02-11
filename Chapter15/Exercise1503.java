import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise1503 extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		
		BallPane ballPane = new BallPane();
		
		
		Button btLeft = new Button("Left ");
		Button btRight = new Button("Right ");
		Button btUp = new Button("Up ");
		Button btDown = new Button("Down ");
		
		btLeft.setOnAction(new EventHandler<ActionEvent>(){
			
			@Override
			public void handle(ActionEvent e) {
				ballPane.moveLeft();
			}
		});
		
		btRight.setOnAction(new EventHandler<ActionEvent>(){
			
			@Override
			public void handle(ActionEvent e) {
				ballPane.moveRight();
			}
		});
		
		btUp.setOnAction(new EventHandler<ActionEvent>(){
			
			@Override
			public void handle(ActionEvent e) {
				ballPane.moveUp();
			}
		});
		
		btDown.setOnAction(new EventHandler<ActionEvent>(){
			
			@Override
			public void handle(ActionEvent e) {
				ballPane.moveDown();
			}
		});
		
		HBox buttonBox = new HBox(10, btLeft, btRight, btUp, btDown);
		
			buttonBox.setAlignment(Pos.CENTER);
		
			
		BorderPane border = new BorderPane();
		
			border.setCenter(ballPane);
			border.setBottom(buttonBox);
			
		
		Scene scene = new Scene(border, 400, 450);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Moving the Ball");
			primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
