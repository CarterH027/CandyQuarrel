package carter.candyquarrel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        AreaFactory areaFactory = new AreaFactory();
        ArrayList<Area> areas = areaFactory.makeNewAreas();

        Player player = new Player("Carter");
        PlayerView playerView = new PlayerView(player);

        Area lollipopWoods = areas.get(0);

        LollipopWoods lw = new LollipopWoods(player, lollipopWoods,600, 600, Color.DARKGREEN);
        Scene currentScene = lw;

        stage.setScene(currentScene);

        stage.setTitle("Candy Quarrel");

        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}