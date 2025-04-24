package carter.candyquarrel;

import java.util.ArrayList;

public class Player {
    private ArrayList<Item> inventory = new ArrayList<>();
    private int maxHealth;
    private int health;
    private int defense;
    private Weapon currentWeapon;
    private Armor currentArmor;
    private String name;

    /** Create the player and give them an item 'fists' to start
     *
     */
    Weapon fists = new Weapon("Fists", 1);

    public Player(String name){
        this.maxHealth = 30;
        this.defense = 0;
        this.health = maxHealth;
        inventory.add(fists);
        this.name = name;
        this.currentWeapon = fists;
    }

    /** an internal method used to update the maximum health of the player
     * when a different set of armor is equipped.
     *
     */
    private void updateHealth(){
        this.maxHealth = 30;
        this.maxHealth += currentArmor.getHealth();
        this.health += currentArmor.getHealth();
    }

    /** another internal method that is used to update the players defense
     *
     */
    private void updateDefense(){
        this.defense = currentArmor.getDefense();
    }


    public void equip(IEquippable item){
        if(item instanceof Weapon){
            this.currentWeapon = (Weapon) item;
        } else if (item instanceof Armor) {
            this.currentArmor = (Armor) item;
            this.updateHealth();
            this.updateDefense();
        }
    }

    public void attack(Enemy enemy){
        enemy.setHealth(enemy.getHealth() - this.currentWeapon.getDamage());
    }

    public void heal(HealthItem item){this.health += item.getHealing();}

    public void addItem(Item item){inventory.add(item);}

    public void setHealth(int health){this.health = health;}


    public int getDefense(){return defense;}
    public int getHealth(){return health;}
    public ArrayList<Item> getInventory(){return inventory;}
}
