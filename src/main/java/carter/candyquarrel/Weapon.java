package carter.candyquarrel;

public class Weapon extends Item implements IEquippable{
    private String name;
    private int damage;
    private double x, y;

    public Weapon(String name, int damage, double x, double y){
        this.name = name;
        this.damage = damage;
        this.x = x;
        this.y = y;
    }

    public int getDamage(){return damage;}

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
