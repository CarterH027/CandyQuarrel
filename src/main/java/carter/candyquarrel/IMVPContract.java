package carter.candyquarrel;

import java.util.ArrayList;

public interface IMVPContract {

    interface Presenter {
        void playerAttackEnemy(Player player, Enemy enemy);
        void enemyAttackPlayer(Enemy enemy, Player player);
        void addItemToInventory(Item item);
    }

    interface View {
        void updatePlayerHP( int hp );
        void updateEnemyHP( int hp );
        void updateInventory(ArrayList<Item> inventory);
    }
}
