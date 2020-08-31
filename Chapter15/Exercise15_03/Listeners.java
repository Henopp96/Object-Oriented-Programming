import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Listeners extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	private CirclePane circlePane = new CirclePane();
	@Override
	public void start(Stage primaryStage) {
		
		
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
		
		btLEFT.setOnKeyPressed(e -> circlePane.left());
		btRIGHT.setOnKeyPressed(e -> circlePane.right());
		btUP.setOnKeyPressed(e -> circlePane.up());
		btDOWN.setOnKeyPressed(e -> circlePane.down());
		
		
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		
		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("Listeners");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}
