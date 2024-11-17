package com.spendwiseduo.pft.components.header;

import com.spendwiseduo.pft.util.Stylesheet;
import java.util.List;
import javafx.scene.Node;
import javafx.scene.layout.HBox;

/** The header of every view. */
public class Header extends HBox {
    /**
     * Creates a new header with the given children.
     *
     * @param children The children of the header.
     */
    public Header(final List<Node> children) {
        this.getChildren().addAll(children);

        Stylesheet.loadStylesheet(this, "components/header.css");
        this.getStyleClass().add("header");
    }
}
