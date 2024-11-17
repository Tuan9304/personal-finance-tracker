package com.spendwiseduo.pft.view.expense;

import com.spendwiseduo.pft.components.header.Header;
import com.spendwiseduo.pft.components.searchbar.SearchBar;
import java.util.List;
import javafx.scene.Node;

/** The header of the Expense view. */
public class ExpenseHeader extends Header {
    /** Creates a new Expense header. */
    public ExpenseHeader() {
        super(createChildren());
    }

    /**
     * Creates the children of the Expense header.
     *
     * @return the children of the Expense header
     */
    private static List<Node> createChildren() {
        return List.of(new SearchBar());
    }
}
