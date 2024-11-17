package com.spendwiseduo.pft.view.report;

import com.spendwiseduo.pft.components.header.Header;
import com.spendwiseduo.pft.components.searchbar.SearchBar;
import java.util.List;
import javafx.scene.Node;

/** The header of the Report view. */
public class ReportHeader extends Header {
    /** Creates a new Report header. */
    public ReportHeader() {
        super(createChildren());
    }

    /**
     * Creates the children of the Report header.
     *
     * @return the children of the Report header
     */
    private static List<Node> createChildren() {
        return List.of(new SearchBar());
    }
}
