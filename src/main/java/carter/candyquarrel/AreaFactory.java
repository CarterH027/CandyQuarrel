package carter.candyquarrel;

import java.util.ArrayList;

public class AreaFactory {

    public AreaFactory(){}

    /**
     * To be called when a new save file is started, it will create all areas and their corresponding elements.
     * @return returns all areas
     */
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
        Area eastWalls = new Area(new Area.AreaBuilder("East Castle Walls")
                .setEnemy(new Enemy("Onion Officer", 50, 6)));

        Area southWalls = new Area(new Area.AreaBuilder("South Castle Walls")
                .setEnemy(new Enemy("Beet Barbarian",35, 9))
        );

        Area northWalls = new Area(new Area.AreaBuilder("North Castle Walls")
                .setEnemy(new Enemy("Cauliflower Conjurer",45, 7))
        );

        Area westWalls = new Area(new Area.AreaBuilder("West Castle Walls")
                .setEnemy(new Enemy("Band of Brussels Sprout Bishops", 100, 5))
        );
        Area candycastle = new Area(new Area.AreaBuilder("Candy Castle")
                .setEnemy(new Enemy("Jamal", new Note("The Princess", "The Princess..?"), 125, 8)));


        lollipopWoods.setConnectedArea(molassesSwamp);
        lollipopWoods.setConnectedArea(gumdropMountains);
        lollipopWoods.setConnectedArea(westWalls);
        molassesSwamp.setConnectedArea(lollipopWoods);
        molassesSwamp.setConnectedArea(peppermintForest);
        molassesSwamp.setConnectedArea(northWalls);
        peppermintForest.setConnectedArea(molassesSwamp);
        peppermintForest.setConnectedArea(eastWalls);
        peppermintForest.setConnectedArea(gumdropMountains);
        gumdropMountains.setConnectedArea(lollipopWoods);
        gumdropMountains.setConnectedArea(peppermintForest);
        gumdropMountains.setConnectedArea(southWalls);
        westWalls.setConnectedArea(lollipopWoods);
        southWalls.setConnectedArea(gumdropMountains);
        eastWalls.setConnectedArea(peppermintForest);
        northWalls.setConnectedArea(molassesSwamp);


        return areas;
    }

    //Will be created once data writer and reader are finished
    //public ArrayList<Area> loadAreasFromSave(){
    //    ArrayList<Area> areas = new ArrayList<>();
    //
    //    return areas;
    //}
}
