package com.spendwiseduo.pft.view.dashboard;

import com.spendwiseduo.pft.components.header.Header;
import com.spendwiseduo.pft.components.searchbar.SearchBar;
import java.util.List;
import javafx.scene.Node;

/** The header of the Dashboard view. */
public class DashboardHeader extends Header {
    /** Creates a new Dashboard header. */
    public DashboardHeader() {
        super(createChildren());
    }

    /**
     * Creates the children of the Dashboard header.
     *
     * @return the children of the Dashboard header
     */
    private static List<Node> createChildren() {
        return List.of(new SearchBar());
    }
}
