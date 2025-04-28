package carter.candyquarrel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    public void enemyTest(){

        Enemy enemy = new Enemy("Enemy",new Armor("Armor",10,10), 20,10,0,0);
        Player player = new Player("Player");

        enemy.attack(player);

        assertEquals(20,player.getHealth());
    }

}