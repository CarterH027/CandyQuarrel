package carter.candyquarrel;


import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ItemView {
    private Item item;
    private Node node;

    public ItemView(Item item){
        this.item = item;
        Rectangle rectangle = new Rectangle(20,20, Color.BROWN);
        rectangle.setTranslateX(item.getX());
        rectangle.setTranslateY(item.getY());
        rectangle.setStroke(Color.BLACK);

        if(item instanceof Weapon){
            rectangle.setFill(Color.DARKGREY);
        } else if (item instanceof Armor){
            rectangle.setFill(Color.BLUE);
        } else if (item instanceof HealthItem) {
            rectangle.setFill(Color.LIGHTPINK);
        } else if (item instanceof Note){
            rectangle.setFill(Color.LIGHTYELLOW);
        } else {
            rectangle.setFill(Color.GREY);
        }

        this.node = rectangle;
    }
     public Node getNode() {
        return node;
     }

     public Item getItem(){
        return item;
     }
}
