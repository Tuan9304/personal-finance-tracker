package com.spendwiseduo.pft.view.income;

import com.spendwiseduo.pft.components.header.Header;
import com.spendwiseduo.pft.components.searchbar.SearchBar;
import java.util.List;
import javafx.scene.Node;

/** The header of the Income view. */
public class IncomeHeader extends Header {
    /** Creates a new Income header. */
    public IncomeHeader() {
        super(createChildren());
    }

    /**
     * Creates the children of the Income header.
     *
     * @return the children of the Income header
     */
    private static List<Node> createChildren() {
        return List.of(new SearchBar());
    }
}
