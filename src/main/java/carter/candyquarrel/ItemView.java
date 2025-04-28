package carter.candyquarrel;


import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ItemView {
    private Item item;
    private Node node;

    public ItemView(Item item){
        this.item = item;
        if(item instanceof Weapon){
            Rectangle rectangle = new Rectangle(20,20, Color.BROWN);
            rectangle.setTranslateX(item.getX());
            rectangle.setTranslateY(item.getY());
            this.node = rectangle;
        } else if (item instanceof Armor){
            Rectangle rectangle = new Rectangle(20,20, Color.BLUE);
            rectangle.setTranslateX(item.getX());
            rectangle.setTranslateY(item.getY());
            this.node = rectangle;
        } else if (item instanceof HealthItem) {
            Rectangle rectangle = new Rectangle(20,20, Color.PINK);
            rectangle.setTranslateX(item.getX());
            rectangle.setTranslateY(item.getY());
            this.node = rectangle;
        } else if (item instanceof Note){
            Rectangle rectangle = new Rectangle(20,20, Color.LIGHTYELLOW);
            rectangle.setTranslateX(item.getX());
            rectangle.setTranslateY(item.getY());
            this.node = rectangle;
        } else {
            this.node = null;
        }
    }
     public Node getNode() {
        return node;
     }
}
