package com.spendwiseduo.pft.components.body;

import com.spendwiseduo.pft.util.Stylesheet;
import javafx.scene.layout.Pane;

/** The body of every view. */
public class Body extends Pane {
    /** Creates a new body component. */
    public Body() {
        Stylesheet.loadStylesheet(this, "components/body.css");
        this.getStyleClass().add("body");
    }
}
