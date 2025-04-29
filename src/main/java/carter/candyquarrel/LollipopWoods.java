package carter.candyquarrel;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class LollipopWoods extends Scene implements AreaGraphics {

    private Pane root;
    private Area area;
    private Player player;

    public LollipopWoods(Player player, Area area, double v, double v1, Color backgroundColor) {
        super(new Pane(), v, v1, backgroundColor);
        this.root = (Pane) getRoot();
        this.area = area;
        this.player = player;
        initializeGraphics();
    }

    private void initializeGraphics() {
        double startX = getWidth() / 2 - 100;
        double startY = getWidth() / 2;

        Line eastPath = new Line (startX, startY, (startX + 100) * 2, startY);
        eastPath.setStroke(Color.SADDLEBROWN);
        eastPath.setStrokeWidth(15);

        Line northeastPath = new Line(startX, startY, (startX + 100) * 2, startY * 0);
        northeastPath.setStroke(Color.SADDLEBROWN);
        northeastPath.setStrokeWidth(15);

        Line southeastPath = new Line(startX, startY, (startX + 100) * 2, startY * 2);
        southeastPath.setStroke(Color.SADDLEBROWN);
        southeastPath.setStrokeWidth(15);

        Circle pathOrigin = new Circle(15);
        pathOrigin.setTranslateY(startY);
        pathOrigin.setTranslateX(startX + 5);
        pathOrigin.setFill(Color.SADDLEBROWN);

        root.getChildren().addAll(eastPath, northeastPath, southeastPath, pathOrigin);
        if (area.isEnemyExists() && area.getEnemy() != null){
            root.getChildren().add(new EnemyView(area.getEnemy()).getNode());
        }
        if (area.isItemExists() && area.getAreaItem() != null){
            root.getChildren().add(new ItemView(area.getAreaItem()).getNode());
        }
        PlayerView playerView = new PlayerView(player);
        root.getChildren().add(playerView.getNode());

        new MovementHandler(this, (Circle) playerView.getNode(), 3.0);
    }
}
