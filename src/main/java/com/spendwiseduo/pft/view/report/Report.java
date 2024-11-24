package com.spendwiseduo.pft.view.report;

import com.spendwiseduo.pft.util.Stylesheet;
import javafx.scene.layout.VBox;

/** The Report view. */
public class Report extends VBox {
    /** Creates a new Report view. */
    public Report() {
        ReportHeader header = new ReportHeader();
        ReportBody body = new ReportBody();

        this.getChildren().addAll(header, body);

        Stylesheet.loadStylesheet(this, "view/report.css");
        this.getStyleClass().add("report");
    }
}
