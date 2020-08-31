import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CirclePane extends Pane{
	private Circle circle = new Circle(25);
	private CirclePane circlePane = new CirclePane();
	
	public CirclePane() {
		
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		getChildren().add(circle);
	}
	
	public void left() {
		circlePane.setOnKeyPressed(e ->{
		if (e.getCode() == KeyCode.LEFT) {
			circlePane.getOnKeyPressed();
		}
	
	});
	}
	public void right() {
		circlePane.setOnKeyPressed(e ->{
		if (e.getCode() == KeyCode.RIGHT) {
			circlePane.getOnKeyPressed();
		}
	
	});
	}
	public void up() {
		circlePane.setOnKeyPressed(e ->{
		if (e.getCode() == KeyCode.UP) {
			circlePane.getOnKeyPressed();
		}
	
	});
	}
	public void down() {
		circlePane.setOnKeyPressed(e ->{
		if (e.getCode() == KeyCode.DOWN) {
			circlePane.getOnKeyPressed();
		}
	
	});
	}
}
