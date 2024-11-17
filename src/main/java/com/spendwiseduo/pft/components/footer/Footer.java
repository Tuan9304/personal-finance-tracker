package com.spendwiseduo.pft.components.footer;

import com.spendwiseduo.pft.util.Stylesheet;
import java.util.List;
import javafx.scene.Node;
import javafx.scene.layout.HBox;

/** The footer of every view. */
public class Footer extends HBox {
    /**
     * Creates a new footer with the given children.
     *
     * @param children The children of the footer.
     */
    public Footer(final List<Node> children) {
        this.getChildren().addAll(children);

        Stylesheet.loadStylesheet(this, "components/footer.css");
        this.getStyleClass().add("footer");
    }
}
