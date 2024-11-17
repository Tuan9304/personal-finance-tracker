package com.spendwiseduo.pft.view.income;

import com.spendwiseduo.pft.components.body.Body;
import javafx.scene.control.Label;

/** The body of the Income view. */
public class IncomeBody extends Body {
    /** Creates a new Income body. */
    public IncomeBody() {
        Label test = new Label("Add income stuff here");

        this.getChildren().add(test);
    }
}
