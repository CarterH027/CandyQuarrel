package carter.candyquarrel;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;

import java.util.HashSet;
import java.util.Set;

public class MovementHandler {

    private final Set<KeyCode> pressedKeys = new HashSet<>();
    private final Circle playerNode;
    private final double speed;

    public MovementHandler(Scene scene, Circle playerNode, double speed) {
        this.playerNode = playerNode;
        this.speed = speed;

        scene.setOnKeyPressed(e -> pressedKeys.add(e.getCode()));
        scene.setOnKeyReleased(e -> pressedKeys.remove(e.getCode()));

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
            }
        };
        timer.start();
    }
        private void update () {
            if (pressedKeys.contains(KeyCode.W) || pressedKeys.contains(KeyCode.UP)) {
                playerNode.setTranslateY(playerNode.getTranslateY() - speed);
            }
            if (pressedKeys.contains(KeyCode.S) || pressedKeys.contains(KeyCode.DOWN)) {
                playerNode.setTranslateY(playerNode.getTranslateY() + speed);
            }
            if (pressedKeys.contains(KeyCode.A) || pressedKeys.contains(KeyCode.LEFT)) {
                playerNode.setTranslateX(playerNode.getTranslateX() - speed);
            }
            if (pressedKeys.contains(KeyCode.D) || pressedKeys.contains(KeyCode.RIGHT)) {
                playerNode.setTranslateX(playerNode.getTranslateX() + speed);
            }
    }
}
