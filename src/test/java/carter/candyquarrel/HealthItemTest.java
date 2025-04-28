package carter.candyquarrel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthItemTest {
    @Test
    public void healthItemTest(){
        HealthItem item = new HealthItem("health item",10, 0 , 0);
        Player player = new Player("player");
        Enemy enemy = new Enemy("enemy",20,10,0,0);

        enemy.attack(player);
        assertEquals(20,player.getHealth());

    }
}