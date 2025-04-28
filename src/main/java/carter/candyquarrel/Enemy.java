package carter.candyquarrel;

public class Enemy {
    private String name;
    private Item rewardItem;
    private int health;
    private int damage;
    private double x, y;

    public Enemy(String name, Item item, int health, int damage, double x, double y){
        this.name = name;
        this.rewardItem = item;
        this.health = health;
        this.damage = damage;
        this.x = x;
        this.y = y;
    }

    public Enemy(String name, int health, int damage, double x, double y){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.x = x;
        this.y = y;
    }

    public double getX() {return x;}

    public double getY(){return y;}

    /**
     * To be called whenever an enemy attacks a player
     * @param player the only player that will be in the game, param will always be player
     */
    public void attack(Player player){
        player.setHealth(player.getHealth() + (player.getDefense() - this.damage));
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){this.health = health;}

    @Override
    public String toString(){
        return name;
    }
}
