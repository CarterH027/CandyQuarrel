package carter.candyquarrel;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class EnemyView {
    private Enemy enemy;
    private Node node;

    /**
     * Creates a graphical representation of an enemy
     * @param enemy - the enemy to be realized
     */
    public EnemyView(Enemy enemy){
        this.enemy = enemy;
        Circle circle = new Circle(20, Color.DARKRED);
        circle.setTranslateX(enemy.getX());
        circle.setTranslateY(enemy.getY());
        circle.setStroke(Color.BLACK);
        this.node = circle;
    }

    public Node getNode() {
        return node;
    }

    public Enemy getEnemy(){return enemy;}
}
