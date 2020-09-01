import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Listeners extends Application{
	
	
	@Override
	
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Circle circle = new Circle(100, 60, 20);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		pane.getChildren().add(circle);
		

		
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btLEFT = new Button("Left");
		Button btRIGHT = new Button("Right");
		Button btUP = new Button("Up");
		Button btDOWN = new Button("Down");
		hBox.getChildren().add(btLEFT);
		hBox.getChildren().add(btRIGHT);
		hBox.getChildren().add(btUP);
		hBox.getChildren().add(btDOWN);
		
		btLEFT.setOnAction(e -> {
			circle.setCenterX(circle.getCenterX() > 0 ? circle.getCenterX() - 2 : 0);
		});
		btRIGHT.setOnAction(e -> {
			circle.setCenterX(circle.getCenterX() > 0 ? circle.getCenterX() + 2 : 0);
		});
		btUP.setOnAction(e -> {
			circle.setCenterY(circle.getCenterY() > 0 ? circle.getCenterY() - 2 : 0);
		});
		btDOWN.setOnAction(e -> {
			circle.setCenterY(circle.getCenterY() > 0 ? circle.getCenterY() + 2 : 0);
		});
		
		
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		
		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("Listeners");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

