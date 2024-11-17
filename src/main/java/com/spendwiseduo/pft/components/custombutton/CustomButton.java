package com.spendwiseduo.pft.components.custombutton;

import com.spendwiseduo.pft.util.Stylesheet;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/** A custom button component. */
public class CustomButton extends Button {
    /**
     * Creates a new button component.
     *
     * @param text The text to display on the button.
     * @param eventHandler The event handler to call when the button is clicked.
     */
    public CustomButton(final String text, final EventHandler<ActionEvent> eventHandler) {
        super(text);
        this.setOnAction(eventHandler);

        Stylesheet.loadStylesheet(this, "components/button.css");
        this.getStyleClass().add("button");
    }
}
