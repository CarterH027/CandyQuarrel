package carter.candyquarrel;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;

public class LollipopWoods extends Scene implements AreaGraphics {

    private Pane root;
    private Area area;
    private Player player;

    public LollipopWoods(Player player, Area area, double v, double v1, Paint paint) {
        super(new Pane(), v, v1, paint);
        this.area = area;
        this.player = player;
        initializeGraphics();
    }

    private void initializeGraphics() {
        if (area.isEnemyExists() && area.getEnemy() != null){

        }
    }
}
