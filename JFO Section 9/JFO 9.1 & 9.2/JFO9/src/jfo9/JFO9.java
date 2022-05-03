package jfo9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JFO9 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Button tombol = new Button();
        tombol.setText("Selamat malam");
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        tombol.setLayoutY(100);
        HBox root = new HBox();
        root.getChildren().add(btn);
        root.getChildren().add(tombol);
        Group root2 = new Group();
        root2.getChildren().add(root);
        Scene scene = new Scene(root2, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
