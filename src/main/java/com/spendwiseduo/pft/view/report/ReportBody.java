package com.spendwiseduo.pft.view.report;

import com.spendwiseduo.pft.components.body.Body;
import javafx.scene.control.Label;

/** The body of the Report view. */
public class ReportBody extends Body {
    /** Creates a new Report body. */
    public ReportBody() {
        Label test = new Label("Add report stuff here");

        this.getChildren().add(test);
    }
}
