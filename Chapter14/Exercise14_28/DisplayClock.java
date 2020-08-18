/*
 * Cody Henopp
 * 
 * 08/18/2020
 * 
 * This program displays the clock from the ClockPane class.
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class DisplayClock extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a clock and a label
		int minute = (int)(Math.random() * 2);
		if (minute == 0) {
			minute = 0;
		}
		else {
			minute = 30;
		}
		ClockPane clock = new ClockPane(((int)(Math.random() * 12)) , minute , 0);
		String timeString = clock.getHour() + ":" + clock.getMinute() 
		+ ":" + clock.getSecond();
		clock.setsecondHandVisible(false);
		Label lblCurrentTime = new Label(timeString);

		// Place clock and label in border pane
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("DisplayClock"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	public static void main(String[] args) {
		launch(args);
	}
}
