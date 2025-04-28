package carter.candyquarrel;

import java.util.ArrayList;

public interface MVPContract {

    interface InventoryPresenter{
        public void addItem_Inventory(Item item, Player player);
    }

    interface PlayerPresenter{
        public void playerAttacked(Player player, Enemy enemy);
    }

    interface EnemyPresenter{
        public void enemyAttacked(Player player, Enemy enemy);
    }

    interface AreaPresenter{
        public void enemyDefeated(Area area);
        public void itemTaken(Area area);
    }

    interface View{
        public void updateInventory( ArrayList<Item> inventory );
        public void updatePlayerHP( int pHP );
        public void updateEnemyHP( int eHP );
        public void updateArea( Area area );
    }

}
