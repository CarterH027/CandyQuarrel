package carter.candyquarrel;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class EnemyView {
    private Enemy enemy;
    private Node node;

    public EnemyView(Enemy enemy){
        this.enemy = enemy;
        Circle circle = new Circle(20, Color.DARKRED);
        circle.setTranslateX(enemy.getX());
        circle.setTranslateY(enemy.getY());
        this.node = circle;
    }

    public Node getNode() {
        return node;
    }
}
