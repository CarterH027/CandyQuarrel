package carter.candyquarrel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmorTest {

    @Test
    public void armorHealthTest(){
        Armor armor = new Armor("armor", 10, 0, 0 , 0);
        Player player = new Player("player");

        player.equip(armor);

        assertEquals(40,player.getHealth());
    }

    @Test
    public void armorDefenseTest(){
        Armor armor = new Armor("armor", 0, 5, 0 , 0);
        Player player = new Player("player");
        Enemy enemy = new Enemy("enemy", 20, 5,0,0);
        player.equip(armor);

        enemy.attack(player);

        assertEquals(30,player.getHealth());
    }
}