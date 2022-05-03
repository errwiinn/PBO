/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jfo9.javafx2;

import javafx.scene.shape.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TestFx2 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();
        Rectangle rect = new Rectangle(10, 100, 20, 250);
        rect.setFill(Color.rgb(215, 0, 3));
        rect.setStroke(Color.BLUE);
        rect.setStrokeWidth(5);
        root.getChildren().add(rect);
        Polygon pel = new Polygon(new double[]{
            22.0, 19.0, 100.0, 12.0, 140.0, 190.0});
        root.getChildren().add(pel);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
