package carter.candyquarrel;

import java.util.ArrayList;

public class AreaFactory {

    public AreaFactory(){}

    public ArrayList<Area> makeNewAreas(){
        ArrayList<Area> areas = new ArrayList<>();
        Area lollipopWoods = new Area(new Area.AreaBuilder("Lollipop Woods")
                .setEnemy(new Enemy("Broccoli Brute", new HealthItem("Bottle of Cola", 10), 30, 5))
                .setItem(new Weapon("Lollipop Sword", 6)));

        Area peppermintForest = new Area(new Area.AreaBuilder("Peppermint Forest")
                .setEnemy(new Enemy("Corn Child", new Note("Chocolate Key", "Key used to unlock the doors to the castle.\nYou're a monster, but it was necessary"), 100, 0))
                .setItem(new Weapon("Peppermint Bow", 8)));

        Area molassesSwamp = new Area(new Area.AreaBuilder("Molasses Swamp")
                .setEnemy(new Enemy("Tomato Titan", new Weapon("Gummy Worm Spear", 10), 30, 5))
                .setItem(new Armor("Mint Marauder Armor", 15, 5)));

        Area gumdropMountains = new Area(new Area.AreaBuilder("Gumdrop Mountains")
                .setEnemy(new Enemy("Carrot Crusader", new Armor("Gumdrop Shoes", 10, 2), 30, 5)));

        // Still need to do the ones below.
        Area eastWalls = new Area(new Area.AreaBuilder("Lollipop Woods")
                .setEnemy(new Enemy("Broccoli Brute", new HealthItem("Bottle of Cola", 10), 30, 5))
                .setItem(new Weapon("Lollipop Sword", 6)));

        Area southWalls = new Area(new Area.AreaBuilder("Lollipop Woods")
                .setEnemy(new Enemy("Broccoli Brute", new HealthItem("Bottle of Cola", 10), 30, 5))
                .setItem(new Weapon("Lollipop Sword", 6)));

        Area northWalls = new Area(new Area.AreaBuilder("Lollipop Woods")
                .setEnemy(new Enemy("Broccoli Brute", new HealthItem("Bottle of Cola", 10), 30, 5))
                .setItem(new Weapon("Lollipop Sword", 6)));

        Area westWalls = new Area(new Area.AreaBuilder("Lollipop Woods")
                .setEnemy(new Enemy("Broccoli Brute", new HealthItem("Bottle of Cola", 10), 30, 5))
                .setItem(new Weapon("Lollipop Sword", 6)));

        Area candycastle = new Area(new Area.AreaBuilder("Lollipop Woods")
                .setEnemy(new Enemy("Broccoli Brute", new HealthItem("Bottle of Cola", 10), 30, 5)));

        return areas;
    }

    public ArrayList<Area> loadAreasFromSave(){
        ArrayList<Area> areas = new ArrayList<>();

        return areas;
    }
}
