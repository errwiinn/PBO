package goaltest;

import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;

public class Goal {

    private Image dukeImage;
    private ImageView dukeImageView;
    private Image gloveImage;
    private ImageView gloveImageView;
    private AudioClip tone;

    public Goal(int x, int y) {
        dukeImage = new Image(getClass().getResource("Images/Duke.png").toString());
        dukeImageView = new ImageView(dukeImage);
        dukeImageView.setX(x);
        dukeImageView.setY(y);

        gloveImage = new Image(getClass().getResource("Images/Glove.png").toString());
        gloveImageView = new ImageView(gloveImage);
        gloveImageView.setPreserveRatio(true);
        gloveImageView.setFitWidth(25);
        gloveImageView.setX(x + 25);
        gloveImageView.setY(y);

        tone = new AudioClip(getClass().getResource("Audio/Note5.wav").toString());
        tone.play();
 
        GoalTest.root.getChildren().addAll(dukeImageView, gloveImageView);
        interactions();
    }

    private void interactions() {
        //Exercise 4   
        dukeImageView.setOnMousePressed((MouseEvent me) -> {
            tone.play();
        });

        dukeImageView.setOnMouseDragged((MouseEvent me) -> {
            System.out.println(me.getSceneX());
            System.out.println(me.getSceneY());
        });
    }
}
