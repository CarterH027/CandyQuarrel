package carter.candyquarrel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    @Test
    public void WeaponTest(){

        Player player = new Player("name");
        Weapon weapon0 = new Weapon("Test Weapon", 10, 0, 0);
        Enemy enemy = new Enemy("Test Enemy",new Weapon("Test Weapon2",15, 0 , 0),20,5,0,0);

        player.addItem(weapon0);
        player.equip(weapon0);

        player.attack(enemy);
        assertEquals(10,enemy.getHealth());

        Weapon weapon1 = new Weapon("Test Weapon3", 1, 0, 0);
        player.equip(weapon1);
        player.attack(enemy);

        assertEquals(9,enemy.getHealth());
    }
}