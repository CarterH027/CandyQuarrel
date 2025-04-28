package carter.candyquarrel;

public class Armor extends Item implements IEquippable{
    private String name;
    private int additionalHealth;
    private int additionalDefense;
    private double x, y;

    public Armor(String name, int health, int defense, double x, double y){
        this.additionalHealth = health;
        this.additionalDefense = defense;
        this.x = x;
        this.y = y;
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

    @Override
    public String toString(){
        return name;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }
}
