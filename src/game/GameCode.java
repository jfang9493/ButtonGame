package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class GameCode extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Clicker Game");
        Parent root = FXMLLoader.load(getClass().getResource("MyFXML.fxml"));
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
