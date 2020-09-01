import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.FadeTransition;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;

public class Animation extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		
		Rectangle rectangle = new Rectangle(0, 0, 25, 50);
		rectangle.setFill(Color.BLACK);
		
		double width = 150;
		double height = 150;
		
		Polygon polygon = new Polygon(100);
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
		ObservableList<Double> list = polygon.getPoints();

		double centerX = getWidth() / 2, centerY = getHeight() / 2;
		double radius = Math.min(getWidth(), getHeight()) * 0.4;

		int s = 5;

		
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		}     
		
		pane.getChildren().add(polygon);
		pane.getChildren().add(rectangle);
		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setPath(polygon);
		pt.setNode(rectangle);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.play();
		
		FadeTransition ft = new FadeTransition(Duration.millis(3000), rectangle);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		rectangle.setOnMousePressed(e -> ft.pause());
		rectangle.setOnMouseReleased(e -> ft.play());
		
		polygon.setOnMousePressed(e -> pt.pause());
		polygon.setOnMouseReleased(e -> pt.play());
		
		Scene scene = new Scene(pane, 250, 200);
		primaryStage.setTitle("Animation");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	private int getHeight() {

		return 150;
	}

	private int getWidth() {

		return 150;
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
