package carter.candyquarrel;

public class Weapon extends Item implements IEquippable{
    private String name;
    private int damage;

    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public int getDamage(){return damage;}
}
