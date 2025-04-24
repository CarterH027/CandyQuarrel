package carter.candyquarrel;

public class Armor extends Item implements IEquippable{
    private String name;
    private int additionalHealth;
    private int additionalDefense;

    public Armor(String name, int health, int defense){
        this.additionalHealth = health;
        this.additionalDefense = defense;
    }

    public int getHealth(){
        return additionalHealth;
    }

    public int getDefense(){
        return additionalDefense;
    }

    public String getName(){
        return name;
    }
}
