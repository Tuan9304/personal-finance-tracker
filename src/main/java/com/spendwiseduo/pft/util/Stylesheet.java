package com.spendwiseduo.pft.util;

import javafx.scene.Parent;

/** Utility class for loading stylesheets. */
public final class Stylesheet {
    public static final String STYLESHEET_FOLDER = "/styles/";

    /**
     * Loads a stylesheet into a parent node.
     *
     * @param parentNode The parent node to load the stylesheet into.
     * @param stylesheet The name of the stylesheet to load.
     */
    public static void loadStylesheet(final Parent parentNode, final String stylesheet) {
        String css = Stylesheet.class.getResource(STYLESHEET_FOLDER + stylesheet).toExternalForm();

        if (css == null) {
            System.out.println("Stylesheet not found: " + stylesheet);
            System.exit(1);
        }

        parentNode.getStylesheets().add(css);
    }

    private Stylesheet() {
        throw new AssertionError("Stylesheet is a utility class and should not be instantiated.");
    }
}
