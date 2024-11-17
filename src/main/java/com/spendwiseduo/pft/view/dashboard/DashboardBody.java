package com.spendwiseduo.pft.view.dashboard;

import com.spendwiseduo.pft.components.body.Body;
import javafx.scene.control.Label;

/** The body of the Dashboard view. */
public class DashboardBody extends Body {
    /** Creates a new Dashboard body. */
    public DashboardBody() {
        Label test = new Label("Add dashboard stuff here");

        this.getChildren().add(test);
    }
}
