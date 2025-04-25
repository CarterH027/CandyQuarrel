package carter.candyquarrel;

import java.util.ArrayList;

public class Area {
    private Item areaItem;
    private boolean itemExists;
    private Enemy enemy;
    private boolean enemyExists;
    private String name;
    private ArrayList<Area> connectedAreas;

    public Area(String name, Item item, Enemy enemy){
        this.name = name;
        this.areaItem = item;
        this.itemExists = true;
        this.enemy = enemy;
        this.enemyExists = true;
    }

    public Area(String name, Enemy enemy){
        this.name = name;
        this.itemExists = false;
        this.enemy = enemy;
        this.enemyExists = true;
    }

    public void itemTaken(){
        this.itemExists = false;
    }
    public void enemyDefeated(){
        this.enemyExists = false;
    }
    public void setConnectedArea(Area area) {
        connectedAreas.add(area);
    }

    @Override
    public String toString(){
        return name;
    }
}
