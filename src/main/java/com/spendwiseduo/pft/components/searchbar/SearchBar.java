package com.spendwiseduo.pft.components.searchbar;

import com.spendwiseduo.pft.components.custombutton.CustomButton;
import com.spendwiseduo.pft.util.Stylesheet;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/** A search bar component that allows users to search for items. */
public class SearchBar extends HBox {
    private TextField searchField;
    private CustomButton searchButton;

    /** Creates a new search bar. */
    public SearchBar() {
        searchField = new TextField();
        searchField.setPromptText("Search...");

        searchButton = new CustomButton("Search", e -> search());

        this.getChildren().addAll(searchField, searchButton);

        Stylesheet.loadStylesheet(this, "components/search-bar.css");
        this.getStyleClass().add("search-bar");
    }

    /** Searches for items based on the user's input. */
    private void search() {
        System.out.println("Searching...");
    }
}
