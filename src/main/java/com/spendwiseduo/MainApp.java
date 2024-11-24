package com.spendwiseduo;

import atlantafx.base.theme.PrimerLight;
import com.spendwiseduo.pft.view.MainLayout;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** JavaFX App. */
public class MainApp extends Application {
    /** Start the app. */
    @Override
    public void start(final Stage stage) {
        Application.setUserAgentStylesheet(new PrimerLight().getUserAgentStylesheet());
        // Application.setUserAgentStylesheet(new PrimerDark()
        // .getUserAgentStylesheet());

        final int w = 1280;
        final int h = 720;

        MainLayout mainLayout = new MainLayout();

        Scene scene = new Scene(mainLayout, w, h);

        stage.setTitle("Personal Finance Tracker");
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
