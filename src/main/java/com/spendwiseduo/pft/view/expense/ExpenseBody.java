package com.spendwiseduo.pft.view.expense;

import com.spendwiseduo.pft.components.body.Body;
import javafx.scene.control.Label;

/** The body of the Expense view. */
public class ExpenseBody extends Body {
    /** Creates a new Expense body. */
    public ExpenseBody() {
        Label test = new Label("Add expense stuff here");

        this.getChildren().add(test);
    }
}
