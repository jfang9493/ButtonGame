package game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class GameCode extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX App");

        Label label = new Label("jfjfmfxdmsrm");
        Scene scene = new Scene(label,700,500);
        primaryStage.setScene(scene);

        Stage stage = new Stage();
        stage.show();
        stage.setTitle("The Game");
        stage.setX(50);
        stage.setY(50);

        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
