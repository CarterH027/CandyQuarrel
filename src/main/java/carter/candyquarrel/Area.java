package carter.candyquarrel;

import java.util.ArrayList;

public class Area {
    private Item areaItem;
    private boolean itemExists;
    private Enemy enemy;
    private boolean enemyExists;
    private String name;
    private ArrayList<Area> connectedAreas;

    public Area(AreaBuilder builder){
        this.name = builder.name;
        this.areaItem = builder.areaItem;
        this.itemExists = builder.itemExists;
        this.enemy = builder.enemy;
        this.enemyExists = builder.enemyExists;
        this.connectedAreas = new ArrayList<>();
    }

    public Enemy getEnemy(){return enemy;}
    public Item getAreaItem(){return areaItem;}
    public boolean isItemExists(){return itemExists;}
    public boolean isEnemyExists(){return enemyExists;}
    /**
     * To be called when the item in the area is taken, so that it no longer appears
     */
    public void itemTaken(){
        this.itemExists = false;
    }

    /**
     * to be used when the area enemy is defeated, so that it no longer appears
     */
    public void enemyDefeated(){
        this.enemyExists = false;
    }

    /**
     * sets the areas that are connected to a specific area, so that the game knows
     * the connected areas
     * @param area the area to be connected to current area
     */
    public void setConnectedArea(Area area) {
        connectedAreas.add(area);
    }

    //A getter for all the connected areas
    public ArrayList<Area> getConnectedAreas(){
        return connectedAreas;
    }

    @Override
    public String toString(){
        return name;
    }

    static class AreaBuilder{
        private Item areaItem;
        private boolean itemExists;
        private Enemy enemy;
        private boolean enemyExists;
        private String name;

        public AreaBuilder(String name){
            this.name = name;
            this.itemExists = false;
            this.enemyExists = false;
        }

        public AreaBuilder setEnemy(Enemy enemy){
            this.enemy = enemy;
            this.enemyExists = true;
            return this;
        }

        public AreaBuilder setItem(Item item){
            this.areaItem = item;
            this.itemExists = true;
            return this;
        }
    }
}
