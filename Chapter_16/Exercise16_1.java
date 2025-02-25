import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise16_1 extends Application {

	private Text text;
	private double textX = 150;
	private double textY = 100;
	private double paneWidth = 400;
	private double paneHeight = 200;
	
	@Override
	public void start(Stage primaryStage) {
		
		text = new Text(textX, textY, "Programming is cool!");
		text.setFill(Color.BLACK);
		
		Pane textPane = new Pane(text);
		
		textPane.setPrefSize(paneWidth, paneHeight);
		
		Button btnLeft = new Button("<-");
		Button btnRight = new Button("->");
		
		btnLeft.setOnAction(e -> moveText(-10));
		
		btnRight.setOnAction(e -> moveText(10));
		
		HBox buttonBox = new HBox(10, btnLeft, btnRight);
		
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.setPadding(new Insets(10));
		
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbGreen = new RadioButton("Green");
		RadioButton rbBlue = new RadioButton("Blue");
		
		ToggleGroup colorGroup = new ToggleGroup();
		
		rbRed.setToggleGroup(colorGroup);
		rbGreen.setToggleGroup(colorGroup);
		rbBlue.setToggleGroup(colorGroup);
		
		rbRed.setOnAction(e -> text.setFill(Color.RED));
		rbGreen.setOnAction(e -> text.setFill(Color.GREEN));
		rbBlue.setOnAction(e -> text.setFill(Color.BLUE));
		
		HBox radioBox = new HBox(10, rbRed, rbGreen, rbBlue);
		
		radioBox.setAlignment(Pos.CENTER);
		radioBox.setPadding(new Insets(10));
		
		
		BorderPane border = new BorderPane();
		
		border.setTop(radioBox);
		border.setCenter(textPane);
		border.setBottom(buttonBox);
		
		
		Scene scene = new Scene(border, paneWidth, paneHeight + 100);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise16_1");
		primaryStage.show();
	}
	
	private void moveText(double x) {
		double newX = textX + x;
		
		if(newX >= 0 && newX + text.getLayoutBounds().getWidth() <= paneWidth) {
			textX = newX;
			text.setX(textX);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
