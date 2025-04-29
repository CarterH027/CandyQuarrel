package carter.candyquarrel;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PlayerView {
    private Player player;
    private Node node;

    public PlayerView (Player player){
        this.player = player;
        Circle c = new Circle(15, Color.MEDIUMPURPLE);
        c.setStroke(Color.BLACK);
        this.node = c;
    }

    public Node getNode(){ return node; }
    public Player getPlayer(){ return player; }
}
