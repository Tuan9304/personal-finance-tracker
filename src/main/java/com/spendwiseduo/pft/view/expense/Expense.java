package com.spendwiseduo.pft.view.expense;

import com.spendwiseduo.pft.util.Stylesheet;
import javafx.scene.layout.VBox;

/** The Expense view. */
public class Expense extends VBox {
    /** Creates a new Expense view. */
    public Expense() {
        ExpenseHeader header = new ExpenseHeader();
        ExpenseBody body = new ExpenseBody();

        this.getChildren().addAll(header, body);

        Stylesheet.loadStylesheet(this, "view/expense.css");
        this.getStyleClass().add("expense");
    }
}
