package com.spendwiseduo.pft.components.navbar;

import com.spendwiseduo.pft.components.custombutton.CustomButton;
import com.spendwiseduo.pft.util.Stylesheet;
import java.util.List;
import javafx.scene.layout.VBox;

/** A bar containing button to navigate between views. */
public class NavBar extends VBox {
    /**
     * Creates a new NavBar with the given buttons.
     *
     * @param buttons The buttons to display in the NavBar.
     */
    public NavBar(final List<CustomButton> buttons) {
        for (CustomButton button : buttons) {
            button.setMaxWidth(Double.MAX_VALUE);
        }

        this.getChildren().addAll(buttons);

        Stylesheet.loadStylesheet(this, "components/nav-bar.css");
        this.getStyleClass().add("nav-bar");
    }

    /**
     * Sets the button at the given index to be active.
     *
     * @param index The index of the button to set as active.
     */
    public void setActiveButton(final int index) {
        for (int i = 0; i < this.getChildren().size(); i++) {
            CustomButton button = (CustomButton) this.getChildren().get(i);
            button.getStyleClass().remove("button-active");

            if (i == index) {
                button.getStyleClass().add("button-active");
            }
        }
    }
}
