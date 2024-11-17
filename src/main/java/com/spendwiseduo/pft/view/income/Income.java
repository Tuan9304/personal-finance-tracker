package com.spendwiseduo.pft.view.income;

import com.spendwiseduo.pft.util.Stylesheet;
import javafx.scene.layout.VBox;

/** The Income view. */
public class Income extends VBox {
    /** Creates a new Income view. */
    public Income() {
        IncomeHeader header = new IncomeHeader();
        IncomeBody body = new IncomeBody();

        this.getChildren().addAll(header, body);

        Stylesheet.loadStylesheet(this, "view/income.css");
        this.getStyleClass().add("income");
    }
}
