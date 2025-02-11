import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class RectangleAnimation extends Application {
	
	private PathTransition pt;
	
	private FadeTransition ft;
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		
		Polygon pentagon = createPentagon(200, 200, 150);
		
		pentagon.setFill(Color.TRANSPARENT);
		pentagon.setStroke(Color.BLACK);
		
		
		Rectangle rectangle = new Rectangle(40, 20, Color.CADETBLUE);
		
		pane.getChildren().addAll(pentagon, rectangle);
		
		pt = new PathTransition();
		
		pt.setDuration(Duration.seconds(5));
		
		pt.setPath(pentagon);
		pt.setNode(rectangle);
		
		pt.setCycleCount(PathTransition.INDEFINITE);
		pt.setAutoReverse(false);
		
		ft = new FadeTransition(Duration.seconds(2.5), rectangle);
		
		ft.setFromValue(1.0);
		
		ft.setToValue(0.2);
		
		ft.setCycleCount(FadeTransition.INDEFINITE);
		
		ft.setAutoReverse(true);
		
			pt.play();
			ft.play();
			
		pane.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				
			pt.pause();
			ft.pause();
			
			} else if (e.getButton() == MouseButton.SECONDARY) {
				
				pt.play();
				ft.play();
			}
		});
		
		
		
		Scene scene = new Scene(pane, 400, 400);
		
		primaryStage.setScene(scene);
		
		
		primaryStage.setTitle("Rectangle Animation");
		
		primaryStage.show();
	}
	
	
	
	private Polygon createPentagon(double centerX, double centerY, double radius) {
		
		Polygon pentagon = new Polygon();
		
		for(int i = 0; i < 5; i++) {
			
			double angle = 2 * Math.PI * i / 5;
			
			double x = centerX + radius * Math.cos(angle);
			double y = centerY - radius * Math.sin(angle);
			
			pentagon.getPoints().addAll(x, y);
		}
		return pentagon;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
