import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

/*
 * Cody Henopp
 * 
 * 08/17/2020
 * 
 * This programs creates a stop sign.
 */

public class Exercise14_15 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {  
		// Create a scene and place it in the stage
		double width = 400;
		double height = 400;
		StackPane pane = new StackPane();
		Polygon polygon = new Polygon();
		polygon.setFill(Color.RED);
		polygon.setStroke(Color.RED);
		ObservableList<Double> list = polygon.getPoints();

		double centerX = getWidth() / 2, centerY = getHeight() / 2;
		double radius = Math.min(getWidth(), getHeight()) * 0.4;
		// s represents the number of sides of the shape
		// Make sure to update this number when necessary
		int s = 8;
		// Add points to the polygon list
		polygon.setRotate(22.5);
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		}     

		

		Label label = new Label("STOP");
		label.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
		label.setTextFill(Color.WHITE);
		pane.getChildren().clear();
		pane.getChildren().addAll(polygon, label);
		Scene scene = new Scene(pane, width, height);
		primaryStage.setTitle("ShowPolygon"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	private int getHeight() {
		// TODO Auto-generated method stub
		return 400;
	}

	private int getWidth() {
		// TODO Auto-generated method stub
		return 400;
	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}

class MyPolygon extends Pane {
	private void paint() {
		// Create a polygon and place polygon to pane
		Polygon polygon = new Polygon();
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.RED);
		ObservableList<Double> list = polygon.getPoints();

		double centerX = getWidth() / 2, centerY = getHeight() / 2;
		double radius = Math.min(getWidth(), getHeight()) * 0.4;
		// s represents the number of sides of the shape
		// Make sure to update this number when necessary
		int s = 8;
		// Add points to the polygon list
		polygon.setRotate(22.5);
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		}     



	}

	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		paint();
	}

	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paint();
	}
}
