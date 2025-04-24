package carter.candyquarrel;

public class Enemy {
    private String name;
    private Item rewardItem;
    private int health;
    private int damage;

    public Enemy(String name, Item item, int health, int damage){
        this.name = name;
        this.rewardItem = item;
        this.health = health;
        this.damage = damage;
    }

    public void attack(Player player){
        player.setHealth(player.getHealth() - this.damage);
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){this.health = health;}
}
