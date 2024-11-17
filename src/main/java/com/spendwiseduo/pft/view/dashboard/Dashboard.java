package com.spendwiseduo.pft.view.dashboard;

import com.spendwiseduo.pft.util.Stylesheet;
import javafx.scene.layout.VBox;

/** The Dashboard view. */
public class Dashboard extends VBox {
    /** Creates a new Dashboard view. */
    public Dashboard() {
        DashboardHeader header = new DashboardHeader();
        DashboardBody body = new DashboardBody();

        this.getChildren().addAll(header, body);

        Stylesheet.loadStylesheet(this, "view/dashboard.css");
        this.getStyleClass().add("dashboard");
    }
}
