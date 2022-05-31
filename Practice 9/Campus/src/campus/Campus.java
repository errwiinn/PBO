package campus;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Campus extends Application {

    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();
        Text gedungat = new Text(110, 70, "Gedung B");
        Text gedungbt = new Text(360, 70, "Gedung C");
        Text pintut = new Text(60, 470, "Pintu masuk");
        pintut.setScaleX(1.5);
        pintut.setScaleY(1.5);
        Rectangle pintu = new Rectangle(120, 30);
        pintu.setX(30);
        pintu.setY(450);
        pintu.setFill(Color.WHITE);
        pintu.setStroke(Color.BLACK);
        gedungat.setScaleX(2);
        gedungat.setScaleY(2);
        gedungbt.setScaleX(2);
        gedungbt.setScaleY(2);
        Rectangle rect = new Rectangle();
        Rectangle jalan = new Rectangle(80, 300);
        Rectangle gedunga = new Rectangle(180, 100);
        gedunga.setX(50);
        gedunga.setY(20);
        gedunga.setFill(Color.BEIGE);
        gedunga.setStroke(Color.BLACK);
        Rectangle gedungb = new Rectangle(180, 100);
        gedungb.setX(300);
        gedungb.setY(20);
        gedungb.setFill(Color.BEIGE);
        gedungb.setStroke(Color.BLACK);
        Rectangle jalan2 = new Rectangle(400, 80);
        jalan2.setX(50);
        jalan2.setY(150);
        jalan2.setFill(Color.LIGHTGREEN);
        jalan.setX(50);
        jalan.setY(150);
        jalan.setFill(Color.LIGHTGREEN);
        Text textjalan = new Text(80, 300, "Jalan");
        textjalan.setScaleX(2);
        textjalan.setScaleY(2);
        textjalan.setRotate(90);
        Text text = new Text(290, 350, "Vihara");
        text.setScaleX(2);
        text.setScaleY(2);
        rect.setX(200);
        rect.setY(300);
        rect.setWidth(200);
        rect.setHeight(100);
        rect.setFill(Color.BEIGE);
        rect.setStroke(Color.BLACK);
        root.getChildren().addAll(rect, text, jalan, textjalan, jalan2, gedunga, gedungb, gedungat, gedungbt,
                pintu, pintut);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
