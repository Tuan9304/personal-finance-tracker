package org.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/** JavaFX App. */
public class App extends Application {
    /** start the app. */
    @Override
    public void start(final Stage stage) {
        final var javaVersion = SystemInfo.javaVersion();
        final var javafxVersion = SystemInfo.javafxVersion();
        final int w = 640;
        final int h = 480;
        var label = new Label(
            "Hello, JavaFX " + javafxVersion
            + ", running on Java " + javaVersion + "."
        );
        var scene = new Scene(new StackPane(label), w, h);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Main method.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
       launch();
    }
}
