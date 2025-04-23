module carter.candyquarrel {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens carter.candyquarrel to javafx.fxml;
    exports carter.candyquarrel;
}