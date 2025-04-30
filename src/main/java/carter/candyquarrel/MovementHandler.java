package carter.candyquarrel;


import javafx.animation.AnimationTimer;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;


import java.util.HashSet;
import java.util.List;
import java.util.Set;


/** A class that handles movement and Collision logic
 *
 */
public class MovementHandler {


    private final Set<KeyCode> pressedKeys = new HashSet<>();
    private final Circle playerNode;
    private final double speed;
    private final List<Node> collidables;
    private double startX, startY;


    /**
     *
     * @param scene the current scene that the player is in, when constructing, it should be within an AreaView
     *              (i.e. Lollipop Woods) and 'this' should be passed in.
     * @param playerNode should be obtained from playerView.getNode
     * @param speed the speed at which the player character will move
     * @param collidables a list of objects that the player can collide with in the area
     * @param x starting x position of the player
     * @param y starting y position of the player
     */
    public MovementHandler(Scene scene, Circle playerNode, double speed, List<Node> collidables, double x, double y) {
        this.playerNode = playerNode;
        this.speed = speed;
        this.collidables = collidables;
        this.startX = x;
        this.startY = y;




        scene.setOnKeyPressed(e -> pressedKeys.add(e.getCode()));
        scene.setOnKeyReleased(e -> pressedKeys.remove(e.getCode()));


        playerNode.setTranslateY(startY);
        playerNode.setTranslateX(startX);
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
            }
        };
        timer.start();
    }
    private void update() {
        double dx = 0, dy = 0;


        if (pressedKeys.contains(KeyCode.W) || pressedKeys.contains(KeyCode.UP)) {
            dy -= speed;
        }
        if (pressedKeys.contains(KeyCode.S) || pressedKeys.contains(KeyCode.DOWN)) {
            dy += speed;
        }
        if (pressedKeys.contains(KeyCode.A) || pressedKeys.contains(KeyCode.LEFT)) {
            dx -= speed;
        }
        if (pressedKeys.contains(KeyCode.D) || pressedKeys.contains(KeyCode.RIGHT)) {
            dx += speed;
        }


        // This will predict next player position, and revert if the player object
        // Collides with anything in the scene
        double nextX = playerNode.getTranslateX() + dx;
        double nextY = playerNode.getTranslateY() + dy;




        playerNode.setTranslateX(nextX);
        playerNode.setTranslateY(nextY);


        Node collided = getcollidingNode();


        if (collided != null) {
            playerNode.setTranslateX(playerNode.getTranslateX() - dx);
            playerNode.setTranslateY(playerNode.getTranslateY() - dy);
        }
    }

    //TODO: this will eventually have something to do with the player interacting with objects as well but for now...

    /**
     * Checks to see if the player dimensions collide with another node's dimensions
     * @return the node contacted
     */
    private Node getcollidingNode() {
        for (Node node : collidables) {
            if (playerNode.getBoundsInParent().intersects(node.getBoundsInParent())) {
                return node;
            }
        }
        return null;
    }
}
