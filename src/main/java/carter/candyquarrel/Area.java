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
