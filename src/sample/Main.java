/*
Morgan Norwood
11/20/2017
Program will display the message "java is fun",
when the user clicks on the text, the message
displays the text "java is powerful"
 */


package sample;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Main extends Application {

    @Override
    public void start (Stage primaryStage) {
    StackPane pane = new StackPane();
    Text text1 = new Text("Java is fun");
    Text text2 = new Text("Java is powerful");
		pane.getChildren().addAll(text1);

		pane.setOnMouseClicked(e -> {
        if (pane.getChildren().contains(text1)) {
            pane.getChildren().add(text2);
            pane.getChildren().remove(text1);
        }
        else {
            pane.getChildren().add(text1);
            pane.getChildren().remove(text2);
        }
    });

    // Create window 
    Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Assignment15"); // Set the title
		primaryStage.setScene(scene); //set scene
		primaryStage.show(); // Display 
}

    public static void main(String[] args) {
        launch(args);
    }
}
